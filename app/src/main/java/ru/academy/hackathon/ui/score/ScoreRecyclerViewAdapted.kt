package ru.academy.hackathon.ui.score

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.academy.hackathon.databinding.ScoreUserItemBinding

class ScoreRecyclerViewAdapted(
    private val values: ArrayList<Pair<String, Int>>
): RecyclerView.Adapter<ScoreRecyclerViewAdapted.ScoreViewHolder>() {

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

    inner class ScoreViewHolder(private val binding: ScoreUserItemBinding)
        : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Pair<String, Int>) {
            binding.addUserName.text = item.first
            binding.userScore.text = item.second.toString()
        }
    }
}