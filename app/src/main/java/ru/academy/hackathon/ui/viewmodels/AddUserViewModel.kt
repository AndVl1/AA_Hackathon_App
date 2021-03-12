package ru.academy.hackathon.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import ru.academy.hackathon.data.models.User
import ru.academy.hackathon.data.repositories.UserRepository
import ru.academy.hackathon.data.repositories.UsersRepositoryImpl

class AddUserViewModel(private val repository: UsersRepositoryImpl) : ViewModel() {

    private val viewScope = CoroutineScope(SupervisorJob() + Dispatchers.Main)

    val users = repository.getAllUsers()

    fun addUser(user : User){
        viewScope.launch {
            repository.insertUser(user=user)
        }
    }


    @Suppress("UNCHECKED_CAST")
    class Factory(private val repository: UsersRepositoryImpl) :
        ViewModelProvider.NewInstanceFactory() {

        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return AddUserViewModel(repository = repository) as T
        }
    }

}