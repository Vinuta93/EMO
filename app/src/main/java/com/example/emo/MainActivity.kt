package com.example.emo

import android.R
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.example.emo.ui.*
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    private lateinit var toolbar: Toolbar
    private lateinit var toolbarTitle: TextView
    private var fragment: Fragment = HomeFragment()
    private lateinit var bottomNavigationView : BottomNavigationView




    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.themeemo)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // rESPONSIBLE FOR sETTING Up IDS AND TITLE TEXT
        toolbar = findViewById(R.id.toolbar)
        bottomNavigationView = findViewById(R.id.bottomNavigation)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        toolbarTitle = toolbar.findViewById(R.id.toolbar_title)
        toolbarTitle.text = "Activities"
        toolbarTitle.textAlignment = View.TEXT_ALIGNMENT_CENTER

        // Disbale Night/DARK mODE OF THE APPLICATION
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