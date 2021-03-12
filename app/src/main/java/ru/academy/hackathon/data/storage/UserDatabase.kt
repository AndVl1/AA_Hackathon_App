package ru.academy.hackathon.data.storage

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import ru.academy.hackathon.data.models.User

@Database(entities = [User::class], version = 1)
abstract class UserDatabase : RoomDatabase() {

    abstract val userDao : UserDao

    companion object {
        private var db: UserDatabase? = null

        fun getInstance(context: Context): UserDatabase {
            synchronized(UserDatabase::class.java) {
                db?.let { return it }
                val instance =
                    Room.databaseBuilder(context, UserDatabase::class.java, Contact.DATABASE_NAME)
                        .build()

                db = instance
                return instance
            }
        }
    }
}