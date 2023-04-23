package com.example.myappkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var tv: TextView

    private lateinit var rv2: RecyclerView
    private lateinit var rv: RecyclerView
    private lateinit var btn: Button
    private val list = ArrayList<FollowerModel>()
    private val adapter = RvAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.soo_all_followers)

        rv2 = findViewById(R.id.photosww)
        rv = findViewById(R.id.recycleView)
        btn = findViewById(R.id.foolow)

        texttv()


        setAdapter()
        addFollower()
        setNewAdapter()

    }

    private fun setAdapter() {
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
        adapter.addFollowers(list)
        rv.adapter = adapter


    }

    private fun addFollower() {
        btn.setOnClickListener{
            list.add(FollowerModel("Baely","https://img.freepik.com/free-vector/businessman-character-avatar-isolated_24877-60111.jpg"))
            adapter.addFollowers(list)
        }
    }

    private fun setNewAdapter() {
        val adapter = Adapter()




        val list = ArrayList<String>()

        list.add("https://static.kulturologia.ru/files/u18172/181721464.jpg")
        list.add("https://www.theartnewspaper.ru/media/original_images/3f92a81d-4e8b-46c6-9149-6344e1e930d6.jpg")
        list.add("https://avatars.mds.yandex.net/get-mpic/4262452/img_id5635830207981014623.jpeg/orig")
        list.add("https://tengrinews.kz/userdata/1(279).jpg")
        adapter.addFollowers(list)
        rv2.adapter = adapter

    }

    private fun texttv() {
        tv.setOnClickListener{
            val intent = Intent(this,Activi::class.java)
            startActivity(intent)
        }
    }


}