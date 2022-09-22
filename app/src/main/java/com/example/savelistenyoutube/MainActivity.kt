package com.example.savelistenyoutube

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.widget.BaseAdapter
import java.security.AccessControlContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ButtonEvent = findViewById<Button>(R.id.search_button)
        val YoutubeLinkText = findViewById<EditText>(R.id.youtube_link_text)
        val ListViews = findViewById<ListView>(R.id.list_view)
//        ListViews.app

        ButtonEvent.setOnClickListener {
            Log.v("0", YoutubeLinkText.text.toString())
        }
    }
}