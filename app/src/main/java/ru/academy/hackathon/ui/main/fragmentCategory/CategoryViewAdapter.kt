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
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import ru.academy.hackathon.application.FantsApp
import ru.academy.hackathon.data.Fant
import ru.academy.hackathon.ui.main.ViewModelCategory


class CategoryViewAdapter(val viewModel: ViewModelCategory, val someClickListener: (Long) -> Unit) :
    RecyclerView.Adapter<CategoryViewAdapter.CategoryViewHolder>() {
    private var fantList: List<Fant> = listOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder =
        CategoryViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.view_holder, parent, false)
        )


    fun bindCategory(fantList: List<Fant>) {
        this.fantList = fantList
        Log.v("bindCategory", "${fantList.size}")
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = fantList.size

    fun getItem(position: Int): Fant = fantList[position]

    inner class CategoryViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        private val checkTask: CheckBox = itemView.findViewById(R.id.checkBoxTask)
        private val imageView: ImageView = itemView.findViewById(R.id.imageView)
        private val textView: TextView = itemView.findViewById(R.id.textView)

        private val scope = CoroutineScope(Dispatchers.IO)
        private val uiScope = CoroutineScope(Dispatchers.Main)

        init {
            checkTask.setOnClickListener {
                if (checkTask.isChecked) {
                    insertFant(fant = fantList[adapterPosition])
                }
            }
        }

        @SuppressLint("SetTextI18n")
        fun bind(fant: Fant) {
            textView.text = fant.textTask
            //context.getResources(fant.imageName)
            Log.v("fun bind", "$fant.imageName")
            Glide
                .with(itemView)
                .load(fant.imageName)
                .into(this.imageView)
            checkTask.isChecked = fant.checkTask

            if (checkTask.isChecked) {
                insertFant(fant=fant)
            }

            scope.launch {
                fant.id?.let {
                    val fantDb = viewModel.repository.getFantsList(idCategory = it)
                    uiScope.launch {
                        if (fantDb != null) {
                            Log.d("AAA","AAAAAAAAAAAAAAAAAAAAAAAAA")
                            checkTask.isChecked = true
                        }
                    }
                }
            }
        }

        private fun insertFant(fant : Fant){
            scope.launch {
                fant.id?.let {
                    val fantDb = viewModel.repository.getFantsList(idCategory = it)
                    uiScope.launch {
                        if (fantDb == null) {
                            viewModel.repository.insertFant(fant = fantList[adapterPosition])
                        }
                    }
                }
            }
        }
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(getItem(position.toInt()));
        holder.itemView.setOnClickListener {
            someClickListener(position.toLong())
        }
    }
}