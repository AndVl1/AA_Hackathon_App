package ru.academy.hackathon.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ru.academy.hackathon.data.repositories.FantRepositoryImpl
import ru.academy.hackathon.data.repositories.UsersRepositoryImpl

class GameViewModel(
    private val userRepository: UsersRepositoryImpl,
    private val fantRepository: FantRepositoryImpl
) : ViewModel() {

    /*
    @Suppress("UNCHECKED_CAST")
    class Factory(
        private val userRepository: UsersRepositoryImpl,
        private val fantRepository: FantRepositoryImpl
    ) :
        ViewModelProvider.NewInstanceFactory() {

        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return GameViewModel(userRepository = userRepository, fantRepository = fantRepository)
        }
    }
    
     */
}