package ru.academy.hackathon.data.repositories

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import ru.academy.hackathon.data.models.User

interface UserRepository {
    fun getAllUsers() : LiveData<List<User>>

    fun getPagedUsers(): DataSource.Factory<Int, User>

    suspend fun getUserById(id: Int): User

    suspend fun insertUser(user: User)

    suspend fun insertUsers(users: List<User>)

    suspend fun deleteAllUsers()

    suspend fun deleteUserById(id: Int)

    suspend fun updateUser(user : User)
}