package ru.academy.hackathon.data

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "fant_task" )
data class Fant(
    @PrimaryKey(autoGenerate = false)
    var id: Int?,
    var idCategory: Int,
    var textTask: String,
    var imageName: Int,
    var countUsers: Int,
    var checkTask: Boolean
)
