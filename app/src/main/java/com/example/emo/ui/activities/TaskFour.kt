package com.example.emo.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import com.example.emo.Activities
import com.example.emo.R
import com.example.emo.ui.activities.taskfoursubactivities.TaskFourSubActivity

class TaskFour : AppCompatActivity() {
    private lateinit var toolbar: Toolbar
    private lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_four)
        toolbar = findViewById(R.id.toolbar)
        btn = findViewById(R.id.btn)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        btn.setOnClickListener {
            startActivity(Intent(this, TaskFourSubActivity::class.java))
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)

        startActivity(Intent(this, Activities::class.java))
        return true
    }
}