package ru.academy.hackathon.data.storage

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import ru.academy.hackathon.data.models.User

@Dao
interface UserDao {

    @Query("SELECT * FROM users")
    fun getAllUsers(): LiveData<List<User>>

    @Query("SELECT * FROM users WHERE id == :id")
    suspend fun getUserById(id: Int): User

    @Insert
    suspend fun insertUser(user: User)

    @Insert
    suspend fun insertUsers(users: List<User>)


    @Query("DELETE FROM users")
    suspend fun deleteAllUsers()

    @Query("DELETE FROM users WHERE id == :id")
    suspend fun deleteUserById(id: Int)

    @Update
    suspend fun updateUser(user: User)
}