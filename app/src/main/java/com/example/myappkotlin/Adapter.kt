package com.example.myappkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load

class Adapter:RecyclerView.Adapter<Adapter.ViewHolder>() {

    private val list = ArrayList<String>()
    class ViewHolder(itemVIew: View):RecyclerView.ViewHolder(itemVIew) {
        fun bind(string: String){
            val imageView = itemView.findViewById<ImageView>(R.id.itemview)
            imageView.load(string)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item,parent,false)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    fun addFollowers(list: List<String>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }





}