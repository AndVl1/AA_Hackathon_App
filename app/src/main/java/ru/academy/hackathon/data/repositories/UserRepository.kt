package ru.academy.hackathon.data.repositories

import androidx.lifecycle.LiveData
import ru.academy.hackathon.data.models.User

interface UserRepository {
    suspend fun getAllUsers() : LiveData<List<User>>

    suspend fun getUserById(id: Int): User

    suspend fun insertUser(user: User)

    suspend fun insertUsers(users: List<User>)

    suspend fun deleteAllUsers()

    suspend fun deleteUserById(id: Int)
}