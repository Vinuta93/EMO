package com.example.emo.ui.activities.taskthreesubactivities.subfragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.emo.Activities
import com.example.emo.R

class TaskCompleted : AppCompatActivity() {

    lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_completed)
        btn = findViewById(R.id.btn)
        btn.setOnClickListener{
            startActivity(Intent(this, Activities::class.java))
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this, Activities::class.java))
    }
}