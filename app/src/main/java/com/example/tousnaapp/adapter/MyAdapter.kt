package com.example.tousnaapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tousnaapp.activity.ItemPhnomPenhActivity
import com.example.tousnaapp.model.News

class MyAdapter(private var newList: List<News>) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemPhnomPenhActivity.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = newList[position]
        holder.bind(currentItem)
    }

    override fun getItemCount(): Int {
        return newList.size
    }

    inner class ViewHolder(private val binding: ItemPhnomPenhActivity) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Item) {
            binding.itemImageView.setImageResource(item.imageResId)
            binding.itemTextView.text = item.text
        }
    }
}


