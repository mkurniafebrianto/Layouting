package com.example.layoutingch4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvListChat: RecyclerView
    private val list = ArrayList<ListChat>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rv_activity)

        rvListChat = findViewById(R.id.rv_list_chat)
        rvListChat.setHasFixedSize(true)

        list.addAll(getListChat())
        showRecyclerList()

    }

    private fun getListChat(): ArrayList<ListChat> {
        val dataPhoto = resources.obtainTypedArray(R.array.data_photo)
        val dataName = resources.getStringArray(R.array.data_name)
        val dataStatus = resources.getStringArray(R.array.data_status)
        val listChat = ArrayList<ListChat>()
        for (i in dataName.indices) {
            val chat = ListChat(dataPhoto.getResourceId(i,-1), dataName[i], dataStatus[i])
            listChat.add(chat)
        }
        return listChat
    }

    private fun showRecyclerList() {
        rvListChat.layoutManager = LinearLayoutManager(this)
        val listChatAdapter = ListChatAdapter(list)
        rvListChat.adapter = listChatAdapter
    }
}