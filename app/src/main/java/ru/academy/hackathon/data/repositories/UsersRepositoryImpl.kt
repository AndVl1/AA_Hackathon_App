package ru.academy.hackathon.data.repositories

import androidx.lifecycle.LiveData
import kotlinx.coroutines.Dispatchers
import ru.academy.hackathon.data.models.User

class UsersRepositoryImpl : UserRepository {

    private val dispatcher = Dispatchers.IO

    override suspend fun getAllUsers(): LiveData<List<User>> {
        TODO("Not yet implemented")
    }

    override suspend fun getUserById(id: Int): User {
        TODO("Not yet implemented")
    }

    override suspend fun insertUser(user: User) {
        TODO("Not yet implemented")
    }

    override suspend fun insertUsers(users: List<User>) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteAllUsers() {
        TODO("Not yet implemented")
    }

    override suspend fun deleteUserById(id: Int) {
        TODO("Not yet implemented")
    }
}