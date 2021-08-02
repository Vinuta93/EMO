package com.example.emo


import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.example.emo.ui.*
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {


    private lateinit var toolbarTitle: TextView
    private lateinit var toolbarImage: ImageView
    private var fragment: Fragment = HomeFragment()
    private lateinit var bottomNavigationView : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottomNavigation)
        toolbarTitle = findViewById(R.id.toolbar_title)
        toolbarImage = findViewById(R.id.toolbar_img)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        supportFragmentManager.beginTransaction().add(R.id.host_fragment, HomeFragment()).commit()
        bottomNavigationView.setOnNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.home -> {
                fragment = HomeFragment()

            }
            R.id.journal -> {
                fragment = JournalFragment()

            }
            R.id.message -> {
                fragment = MessageFragment()

            }
            R.id.search -> {
                fragment = SearchFragment()

            }
            R.id.profile -> {
                fragment = ProfileFragment()

            }
        }
        supportFragmentManager.beginTransaction()
            .replace(R.id.host_fragment, fragment)
            .commit()
        return true
    }



}