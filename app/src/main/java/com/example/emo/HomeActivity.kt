package com.example.emo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {


    lateinit var myText : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.themeemo)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        myText = findViewById(R.id.txtid)

    }
}