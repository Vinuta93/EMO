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
import com.example.emo.ui.activities.TaskOne
import com.example.emo.ui.activities.TaskThree
import com.example.emo.ui.activities.TaskTwo

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
            GridItem(R.drawable.image, "Activity 1", "Description..."),
            GridItem(R.drawable.image, "Activity 2", "Description..."),
            GridItem(R.drawable.image, "Activity 3", "Description..."),
            GridItem(R.drawable.image, "Activity 4", "Description..."),
            GridItem(R.drawable.image, "Activity 5", "Description..."),
            GridItem(R.drawable.image, "Activity 6", "Description..."),


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

            }
            4 -> {

            }
            5 -> {

            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)

       // Toast.makeText(this, "dsc", Toast.LENGTH_SHORT).show()
        startActivity(Intent(this, MainActivity::class.java))



        return true
    }

    override fun onBackPressed() {
        super.onBackPressed()

    }
}