package com.example.emo.ui.activities.taskthreesubactivities.subfragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.emo.Activities
import com.example.emo.R

class TaskCompleted : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_completed)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this, Activities::class.java))
    }
}