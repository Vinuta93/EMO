package com.example.emo.ui.activities.tasktwosubactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import com.example.emo.R
import com.example.emo.ui.activities.TaskThree
import com.example.emo.ui.activities.TaskTwo
import com.example.emo.ui.activities.taskthreesubactivities.TaskThreeSubActivity
import com.example.emo.ui.activities.taskthreesubactivities.subfragments.FirstQuesFragment
import com.shuhart.stepview.StepView

class TaskTwoSubActivity : AppCompatActivity() {

    private lateinit var toolbar: Toolbar

    companion object{
        lateinit var stepView: StepView
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_two_sub)

        toolbar = findViewById(R.id.toolbar)
        stepView = findViewById(R.id.step_view)
        stepView.go(0, true)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportFragmentManager.beginTransaction().add(R.id.host_fragment2, com.example.emo.ui.activities.tasktwosubactivities.subfragments.FirstQuesFragment()).commit()

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)

        startActivity(Intent(this, TaskTwo::class.java))
        return true
    }
}