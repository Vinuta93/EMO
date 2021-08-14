package com.example.emo.ui.activities.taskthreesubactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.example.emo.Activities
import com.example.emo.R
import com.example.emo.ui.HomeFragment
import com.example.emo.ui.activities.TaskThree
import com.example.emo.ui.activities.taskthreesubactivities.subfragments.FirstQuesFragment
import com.shuhart.stepview.StepView

class TaskThreeSubActivity : AppCompatActivity() {

    private lateinit var toolbar: Toolbar

    companion object{
        lateinit var stepView: StepView
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_three_sub)
        toolbar = findViewById(R.id.toolbar)
        stepView = findViewById(R.id.step_view)
        stepView.go(0, true)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        supportFragmentManager.beginTransaction().add(R.id.host_fragment, FirstQuesFragment()).commit()
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)

        startActivity(Intent(this, TaskThree::class.java))
        return true
    }
}