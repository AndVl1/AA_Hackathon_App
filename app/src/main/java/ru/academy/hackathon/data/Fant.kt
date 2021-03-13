package ru.academy.hackathon.data

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

//@Entity(tableName = "fant_task" )
@Entity(tableName = "fant_task", primaryKeys = ["id", "idCategory"])
data class Fant(
//    @PrimaryKey(autoGenerate = false)
    @NonNull
    var id: Int,
    @NonNull
    var idCategory: Int,
    var textTask: String,
    var imageName: Int,
    var countUsers: Int,
    var checkTask: Boolean
)