package com.example.emo.ui.activities.taskfivesubactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import com.example.emo.Activities
import com.example.emo.R
import com.example.emo.ui.activities.taskthreesubactivities.subfragments.TaskCompleted
import com.google.android.material.textfield.TextInputEditText

class TaskFiveSubActivity : AppCompatActivity() {

    private lateinit var toolbar: Toolbar
    private lateinit var button: Button
    lateinit var editText : TextInputEditText
    var allow : Boolean = false



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_five_sub)
        toolbar = findViewById(R.id.toolbar)
        button = findViewById(R.id.btn)
        editText = findViewById(R.id.editText)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        button.setOnClickListener {
            if (allow)
            startActivity(Intent(this, TaskCompleted::class.java))
        }

        editText.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {

            }

            override fun afterTextChanged(s: Editable) {
                allow = s.length >=10
            }
        })




    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)

        startActivity(Intent(this, Activities::class.java))
        return true
    }
}