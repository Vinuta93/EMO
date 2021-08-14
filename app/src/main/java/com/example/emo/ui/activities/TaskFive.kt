package com.example.emo.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import com.example.emo.Activities
import com.example.emo.R
import com.example.emo.ui.activities.taskfivesubactivities.TaskFiveSubActivity

class TaskFive : AppCompatActivity() {
    private lateinit var toolbar: Toolbar
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_five2)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        button = findViewById(R.id.btn)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        button.setOnClickListener {
            startActivity(Intent(this, TaskFiveSubActivity::class.java))
        }
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)

        startActivity(Intent(this, Activities::class.java))
        return true
    }
}