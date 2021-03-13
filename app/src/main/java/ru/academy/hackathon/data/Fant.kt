package ru.academy.hackathon.data

import android.os.Parcelable
import androidx.room.Entity

@Entity(tableName = "fant_task", primaryKeys = ["id", "idCategory"])
data class Fant(
    var id: Int,
    var idCategory: Int,
    var textTask: String,
    var imageName: Int,
    var countUsers: Int,
    var checkTask: Boolean
)