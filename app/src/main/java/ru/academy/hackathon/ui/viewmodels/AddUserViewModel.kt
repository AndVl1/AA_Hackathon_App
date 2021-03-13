package ru.academy.hackathon.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.paging.LivePagedListBuilder
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

    val pagedUsers = LivePagedListBuilder(repository.getPagedUsers(), 10).build()

    fun addUser(user : User){
        viewScope.launch {
            repository.insertUser(user=user)
        }
    }

    fun clearUsers() {
        viewScope.launch {
            repository.deleteAllUsers()
        }
    }

    fun deleteUser(user : User){
        viewScope.launch {
            user.id?.let { repository.deleteUserById(id= it) }
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
