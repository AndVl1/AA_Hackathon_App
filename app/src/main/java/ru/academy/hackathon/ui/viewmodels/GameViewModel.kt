package ru.academy.hackathon.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import ru.academy.hackathon.data.models.User
import ru.academy.hackathon.data.repositories.FantRepositoryImpl
import ru.academy.hackathon.data.repositories.UsersRepositoryImpl

class GameViewModel(
    private val userRepository: UsersRepositoryImpl,
    private val fantRepository: FantRepositoryImpl
) : ViewModel() {

    private val viewScope = CoroutineScope(SupervisorJob() + Dispatchers.Main)

    fun updateUser(user : User){
        viewScope.launch {
            userRepository.updateUser(user=user)
        }
    }

    @Suppress("UNCHECKED_CAST")
    class Factory(
        private val userRepository: UsersRepositoryImpl,
        private val fantRepository: FantRepositoryImpl
    ) : ViewModelProvider.NewInstanceFactory() {

        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return GameViewModel(
                userRepository = userRepository,
                fantRepository = fantRepository
            ) as T
        }
    }

    object Index {
        var currentIndexUser = 0
        var currentIndexRound = 1
    }
}