package ru.academy.hackathon.ui.main.fragmentCategory

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.academy.hackathon.R
import com.bumptech.glide.Glide
import ru.academy.hackathon.data.Fant


class CategoryViewAdapter(val someClickListener: (Long) -> Unit) :
    RecyclerView.Adapter<CategoryViewAdapter.CategoryViewHolder>() {
    private var fantList: List<Fant> =  listOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder =
        CategoryViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.view_holder, parent, false)
        )



    fun bindCategory(fantList: List<Fant>) {
        this.fantList = fantList
        Log.v("bindCategory","${fantList.size}")
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = fantList.size

    fun getItem(position: Int): Fant = fantList[position]

    class CategoryViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        private val checkTask: CheckBox = itemView.findViewById(R.id.checkBoxTask)
        private val imageView: ImageView = itemView.findViewById(R.id.imageView)
        private val textView: TextView = itemView.findViewById(R.id.textView)

        @SuppressLint("SetTextI18n")
        fun bind(fant: Fant) {
            textView.text = fant.textTask
            Glide
                .with(itemView)
                .load(R.drawable.push_up)
                .into(this.imageView)
            checkTask.isChecked = fant.checkTask
        }
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(getItem(position.toInt()));
        holder.itemView.setOnClickListener {
            someClickListener(position.toLong())
        }
    }
}