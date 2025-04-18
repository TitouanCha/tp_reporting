package com.example.testandroid

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var mainActivityTitleTextView: TextView
    private lateinit var mainActivityCentralTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        this.mainActivityTitleTextView = findViewById(R.id.main_activity_title_tv)
        this.mainActivityTitleTextView.text = "Android > IOS"

        this.mainActivityCentralTextView = findViewById(R.id.main_activity_central_tv)
        this.mainActivityCentralTextView.text = "New Text !!!"

    }
}