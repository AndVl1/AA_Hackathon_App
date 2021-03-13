package ru.academy.hackathon.data.repositories

import android.content.Context
import androidx.lifecycle.LiveData
import kotlinx.coroutines.*
import ru.academy.hackathon.data.Fant
import ru.academy.hackathon.data.models.User
import ru.academy.hackathon.data.storage.UserDatabase

class UsersRepositoryImpl(applicationContext: Context) : UserRepository {

    private val dispatcher = Dispatchers.IO

    private val db = UserDatabase.getInstance(context = applicationContext)

    private val dao = db.userDao

    override fun getAllUsers(): LiveData<List<User>> = dao.getAllUsers()

    override suspend fun getUserById(id: Int): User = withContext(dispatcher) {
        dao.getUserById(id = id)
    }

    override suspend fun insertUser(user: User) = withContext(dispatcher) {
        dao.insertUser(user = user)
    }

    override suspend fun insertUsers(users: List<User>) = withContext(dispatcher) {
        dao.insertUsers(users = users)
    }

    override suspend fun deleteAllUsers() = withContext(dispatcher) {
        dao.deleteAllUsers()
    }

    override suspend fun deleteUserById(id: Int) = withContext(dispatcher) {
        dao.deleteUserById(id = id)
    }

    override suspend fun updateUser(user: User) {
        dao.updateUser(user = user)
    }


    suspend fun getAllFant(): List<Fant> = dao.getAllFant()

    suspend fun getFantById(id: Int): Fant = withContext(dispatcher) {
        dao.getFantById(id = id)
    }

    suspend fun getFantByIdCategory(idCategory: Int): List<Fant> = withContext(dispatcher) {
        dao.getFantsByIdCategory(idCategory = idCategory )
    }



    suspend fun insertUser(fant: Fant) = withContext(dispatcher) {
        dao.insertFant(fant = fant)
    }

    suspend fun updateUser(fant: Fant) {
        dao.updateFant(fant = fant)
    }














}