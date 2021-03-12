package ru.academy.hackathon.ui.addusers

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import ru.academy.hackathon.data.models.User
import ru.academy.hackathon.databinding.AddUserItemBinding

class AddUserHolder(view: View) : RecyclerView.ViewHolder(view) {

    private var _binding: AddUserItemBinding? = null
    private val binding get() = _binding!!

    fun bind(user: User) {
        binding.addUserName.text = user.name
    }
}