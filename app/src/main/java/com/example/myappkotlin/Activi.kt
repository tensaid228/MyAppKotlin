package com.example.myappkotlin

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class Activi: AppCompatActivity() {

    private val followers = FollowersAdapter()
    private lateinit var rv: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.soo_all)
        rv = findViewById(R.id.followers_soo_all)

        
        setAdapter()




    }

    private fun setAdapter() {
        val list = arrayListOf<FollowerModel>()
        list.add(FollowerModel("Baely","https://img.freepik.com/free-vector/businessman-character-avatar-isolated_24877-60111.jpg"))
        list.add(FollowerModel("Baely","https://img.freepik.com/free-vector/businessman-character-avatar-isolated_24877-60111.jpg"))
        list.add(FollowerModel("Baely","https://img.freepik.com/free-vector/businessman-character-avatar-isolated_24877-60111.jpg"))
        list.add(FollowerModel("Baely","https://img.freepik.com/free-vector/businessman-character-avatar-isolated_24877-60111.jpg"))
        list.add(FollowerModel("Baely","https://img.freepik.com/free-vector/businessman-character-avatar-isolated_24877-60111.jpg"))
        list.add(FollowerModel("Baely","https://img.freepik.com/free-vector/businessman-character-avatar-isolated_24877-60111.jpg"))
        list.add(FollowerModel("Baely","https://img.freepik.com/free-vector/businessman-character-avatar-isolated_24877-60111.jpg"))
        list.add(FollowerModel("Baely","https://img.freepik.com/free-vector/businessman-character-avatar-isolated_24877-60111.jpg"))
        list.add(FollowerModel("Baely","https://img.freepik.com/free-vector/businessman-character-avatar-isolated_24877-60111.jpg"))
        list.add(FollowerModel("Baely","https://img.freepik.com/free-vector/businessman-character-avatar-isolated_24877-60111.jpg"))
        list.add(FollowerModel("Baely","https://img.freepik.com/free-vector/businessman-character-avatar-isolated_24877-60111.jpg"))
        followers.addFollowers(list)
        rv.adapter = followers
    }

}