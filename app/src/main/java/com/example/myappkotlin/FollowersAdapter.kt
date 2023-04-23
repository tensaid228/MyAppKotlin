package com.example.myappkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load


class FollowersAdapter: RecyclerView.Adapter<RvViewHolder>() {

    private val list = ArrayList<FollowerModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvViewHolder  {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_item,parent,false)
        return RvViewHolder(view)

    }


    fun addFollowers(list: List<FollowerModel>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }


    override fun onBindViewHolder(holder: RvViewHolder , position: Int) {
        holder.bind(list[position])

    }


    override fun getItemCount(): Int {
        return list.size

    }
}

class AdapterFollowers(itemView: View): RecyclerView.ViewHolder(itemView) {

    fun bind(follower: FollowerModel) {
        val tv = itemView.findViewById<TextView>(R.id.textv)
        val imageView = itemView.findViewById<ImageView>(R.id.iamgeviewww)
        tv.text = follower.name
        imageView.load(follower.avatarImage)
    }




}