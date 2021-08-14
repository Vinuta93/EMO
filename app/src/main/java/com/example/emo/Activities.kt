package com.example.emo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.emo.adapter.GridAdapter
import com.example.emo.interfaces.OnGridItemClick
import com.example.emo.model.GridItem
import com.example.emo.ui.activities.*

class Activities : AppCompatActivity(), OnGridItemClick {
    private lateinit var recyclerView: RecyclerView
    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activities)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        recyclerView = findViewById(R.id.rv)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = GridAdapter(this, generateData(), this )

    }
    private fun generateData() :List<GridItem> {
        return listOf(
            GridItem(R.drawable.activityone, "Stress means to you?", "We have all been anxious or currently under a lot ...",R.drawable.heartred),
            GridItem(R.drawable.activitytwo, "Know your emotions", "Choose any words you like to fill the blank cards...",R.drawable.heartgrey),
            GridItem(R.drawable.activitythree, "Your fav character", "If you were a character what would you like to be...",R.drawable.heartgrey),
            GridItem(R.drawable.activityfour, "Create your garden", "Create your garden by using the color after click...",R.drawable.heartgrey),
            GridItem(R.drawable.activityfive, "Letter to future self", "What advice you will give it to your future self ?",R.drawable.heartred),
            GridItem(R.drawable.activitysix, "Blank Cards", "Take a picture of any thing you feel you are grateful.",R.drawable.heartgrey),
            )
    }

    override fun onGridItemClick(item: GridItem, position: Int) {
        when (position){
            0 -> {
                startActivity(Intent(this, TaskOne::class.java))
            }
            1 -> {
                startActivity(Intent(this, TaskTwo::class.java))

            }
            2 -> {
                startActivity(Intent(this, TaskThree::class.java))

            }
            3 -> {
                startActivity(Intent(this, TaskFour::class.java))
            }
            4 -> {
                startActivity(Intent(this, TaskFive::class.java))
            }
            5 -> {

            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)
        startActivity(Intent(this, MainActivity::class.java))
        return true
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}