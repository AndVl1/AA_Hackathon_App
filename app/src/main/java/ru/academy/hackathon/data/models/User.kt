package ru.academy.hackathon.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.academy.hackathon.data.storage.Contact

@Entity(
    tableName = Contact.User.TABLE_NAME
)
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val name: String,
    val ageType: String = AgeType.ADULT.value,
    val taskType: String = TaskType.SPORTS.value,
    var countSuccessfulTask: Int=0
)

enum class AgeType(val value : String){
    KID("KID"), ADULT("ADULT")
}

enum class TaskType(val value: String){
    SPORTS("SPORTS")
}
