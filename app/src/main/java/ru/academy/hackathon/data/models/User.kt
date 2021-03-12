package ru.academy.hackathon.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.academy.hackathon.data.storage.Contact

@Entity(
    tableName = Contact.User.TABLE_NAME
)
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val ageType: String,
    val taskType: String,
    val countSuccessfulTask: Int
)