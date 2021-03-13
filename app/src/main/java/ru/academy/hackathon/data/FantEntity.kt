package ru.academy.hackathon.data

import androidx.room.Entity

@Entity(tableName = "locationUser", primaryKeys = ["track", "id"])
data class FantEntity(
    var id: Int,
    var idCategory: Int,
    var textTask: String,
    var imageName: String,
    var countUsers: Int,
    var checkTask: Boolean
)