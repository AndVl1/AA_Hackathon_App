package ru.academy.hackathon.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.academy.hackathon.R
import ru.academy.hackathon.data.models.User
import ru.academy.hackathon.databinding.AddUserItemBinding
import ru.academy.hackathon.ui.addusers.AddUserHolder

class AddUserAdapter(private var users: List<User> = emptyList()) :
    RecyclerView.Adapter<AddUserHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        AddUserHolder(
            itemBinding = AddUserItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: AddUserHolder, position: Int) =
        holder.bind(user = users[position])

    override fun getItemCount() = users.size

    fun bindUsers(users: List<User>) {
        this.users= users
    }

    fun getData() = users
}