package ru.academy.hackathon.ui.score

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.academy.hackathon.data.models.User
import ru.academy.hackathon.databinding.ScoreUserItemBinding

class ScoreRecyclerViewAdapted(
    var values: List<User> = emptyList()): RecyclerView.Adapter<ScoreRecyclerViewAdapted.ScoreViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScoreViewHolder {
        return ScoreViewHolder(
            ScoreUserItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = values.size

    override fun onBindViewHolder(holder: ScoreViewHolder, position: Int) {
        holder.bind(values[position])
    }

    fun bindData(users : List<User>){
        values=users
    }

    inner class ScoreViewHolder(private val binding: ScoreUserItemBinding)
        : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: User) {
            binding.addUserName.text = item.name
            binding.userScore.text = item.countSuccessfulTask.toString()
        }
    }
}
