package ru.academy.hackathon.ui.addusers

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import ru.academy.hackathon.data.models.User
import ru.academy.hackathon.databinding.AddUserItemBinding

class AddUserHolder(val itemBinding: AddUserItemBinding) : RecyclerView.ViewHolder(itemBinding.root) {

    fun bind(user: User) {
        itemBinding.addUserName.text = user.name
    }
}