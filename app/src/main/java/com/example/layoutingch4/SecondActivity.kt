package com.example.layoutingch4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)
    }

    val detailPhoto = findViewById<ImageView>(R.id.iv_detail_photo)
    val detailName = findViewById<TextView>(R.id.tv_detail_name)
    val detailStatus = findViewById<TextView>(R.id.tv_detail_status)
}