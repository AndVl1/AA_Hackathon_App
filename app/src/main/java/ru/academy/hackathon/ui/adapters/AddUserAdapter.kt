package ru.academy.hackathon.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import ru.academy.hackathon.R
import ru.academy.hackathon.data.models.User
import ru.academy.hackathon.databinding.AddUserItemBinding

class AddUserAdapter(private var users: List<User> = emptyList()) :
    PagedListAdapter<User, AddUserAdapter.AddUserHolder>(DIFF_CALLBACK) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        AddUserHolder(
            itemBinding = AddUserItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: AddUserHolder, position: Int) =
        holder.bind(getItem(position)!!)

    fun bindUsers(users: List<User>) {
        this.users= users
    }

    fun getUserItem(index: Int) = getItem(index)

    fun getData() = users

    inner class AddUserHolder(val itemBinding: AddUserItemBinding) : RecyclerView.ViewHolder(itemBinding.root) {

        fun bind(user: User) {
            itemBinding.addUserName.text = user.name
        }
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<User>() {
            override fun areItemsTheSame(oldItem: User, newItem: User): Boolean
                    = oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: User, newItem: User): Boolean
                    = oldItem == newItem
        }
    }
}
