package com.example.emo.ui.activities.taskfoursubactivities

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.emo.Activities
import com.example.emo.R
import com.google.android.material.floatingactionbutton.FloatingActionButton


class TaskFourSubActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var toolbar: Toolbar
    private lateinit var fab1 :FloatingActionButton
    private lateinit var fab2 :FloatingActionButton
    private lateinit var fab3 :FloatingActionButton
    private lateinit var fab4 :FloatingActionButton
    private lateinit var fab5 :FloatingActionButton
    private lateinit var fab6 :FloatingActionButton
    private lateinit var fab7 :FloatingActionButton
    private lateinit var fab8 :FloatingActionButton
    private lateinit var fab9 :FloatingActionButton
    private lateinit var fab10 :FloatingActionButton
    private lateinit var fab11 :FloatingActionButton
    private lateinit var fab12 :FloatingActionButton
    private lateinit var fab13 :FloatingActionButton
    private lateinit var fab14 :FloatingActionButton
    private lateinit var fab15 :FloatingActionButton
    private lateinit var fab16 :FloatingActionButton
    private lateinit var fab17 :FloatingActionButton
    private lateinit var fab18 :FloatingActionButton
    private lateinit var fab19 :FloatingActionButton
    private lateinit var fab20 :FloatingActionButton
    private lateinit var fab21 :FloatingActionButton
    private lateinit var fab22 :FloatingActionButton
    private lateinit var fab23 :FloatingActionButton
    private lateinit var fab24 :FloatingActionButton
    private lateinit var fab25 :FloatingActionButton
    private lateinit var fab26 :FloatingActionButton
    private lateinit var fab27 :FloatingActionButton
    private lateinit var fab28 :FloatingActionButton
    private lateinit var fab29 :FloatingActionButton
    private lateinit var fab30 :FloatingActionButton
    private lateinit var fab31 :FloatingActionButton
    private lateinit var fab32 :FloatingActionButton
    private lateinit var happyFab :FloatingActionButton
    private lateinit var stressFab :FloatingActionButton
    private lateinit var relaxFab :FloatingActionButton
    private lateinit var sadFab :FloatingActionButton
    private lateinit var angryFab :FloatingActionButton
    private lateinit var alertDialog: android.app.AlertDialog.Builder
    private lateinit var alert: android.app.AlertDialog
     var pickerColor : Int = Color.WHITE


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_four_sub)
        toolbar = findViewById(R.id.toolbar)
        setupView()
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)
        startActivity(Intent(this, Activities::class.java))
        return true
    }

    private fun setupView(){
        fab1 = findViewById(R.id.btn1)
        fab1.setOnClickListener(this)
        fab2 = findViewById(R.id.btn2)
        fab2.setOnClickListener(this)
        fab3 = findViewById(R.id.btn3)
        fab3.setOnClickListener(this)
        fab4 = findViewById(R.id.btn4)
        fab4.setOnClickListener(this)
        fab5 = findViewById(R.id.btn5)
        fab5.setOnClickListener(this)
        fab6 = findViewById(R.id.btn6)
        fab6.setOnClickListener(this)
        fab7 = findViewById(R.id.btn7)
        fab7.setOnClickListener(this)
        fab8 = findViewById(R.id.btn8)
        fab8.setOnClickListener(this)
        fab9 = findViewById(R.id.btn9)
        fab9.setOnClickListener(this)
        fab10 = findViewById(R.id.btn10)
        fab10.setOnClickListener(this)
        fab11 = findViewById(R.id.btn11)
        fab11.setOnClickListener(this)
        fab12 = findViewById(R.id.btn12)
        fab12.setOnClickListener(this)
        fab13 = findViewById(R.id.btn13)
        fab13.setOnClickListener(this)
        fab14 = findViewById(R.id.btn14)
        fab14.setOnClickListener(this)
        fab15 = findViewById(R.id.btn15)
        fab15.setOnClickListener(this)
        fab16 = findViewById(R.id.btn16)
        fab16.setOnClickListener(this)
        fab17 = findViewById(R.id.btn17)
        fab17.setOnClickListener(this)
        fab18 = findViewById(R.id.btn18)
        fab18.setOnClickListener(this)
        fab19 = findViewById(R.id.btn19)
        fab19.setOnClickListener(this)
        fab20 = findViewById(R.id.btn20)
        fab20.setOnClickListener(this)
        fab21 = findViewById(R.id.btn21)
        fab21.setOnClickListener(this)
        fab22 = findViewById(R.id.btn22)
        fab22.setOnClickListener(this)
        fab23 = findViewById(R.id.btn23)
        fab23.setOnClickListener(this)
        fab24 = findViewById(R.id.btn24)
        fab24.setOnClickListener(this)
        fab25 = findViewById(R.id.btn25)
        fab25.setOnClickListener(this)
        fab26 = findViewById(R.id.btn26)
        fab26.setOnClickListener(this)
        fab27 = findViewById(R.id.btn27)
        fab27.setOnClickListener(this)
        fab28 = findViewById(R.id.btn28)
        fab28.setOnClickListener(this)
        fab29 = findViewById(R.id.btn29)
        fab29.setOnClickListener(this)
        fab30 = findViewById(R.id.btn30)
        fab30.setOnClickListener(this)
        fab31 = findViewById(R.id.btn31)
        fab31.setOnClickListener(this)
        fab32 = findViewById(R.id.btn32)
        fab32.setOnClickListener(this)

    }

    private fun changeCircleColor( btn : FloatingActionButton , color: Int){
        btn.backgroundTintList = ColorStateList.valueOf(color)

    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btn1 -> {
                showPopup(fab1)
            }
            R.id.btn2 -> {
                showPopup(fab2)
            }
            R.id.btn3 -> {
                showPopup(fab3)
            }
            R.id.btn4 -> {
                showPopup(fab4)
            }
            R.id.btn5 -> {
                showPopup(fab5)
            }
            R.id.btn6 -> {
                showPopup(fab6)
            }
            R.id.btn7 -> {
                showPopup(fab7)
            }
            R.id.btn8 -> {
                showPopup(fab8)
            }
            R.id.btn9 -> {
                showPopup(fab9)
            }
            R.id.btn10 -> {
                showPopup(fab10)
            }
            R.id.btn11 -> {
                showPopup(fab11)
            }
            R.id.btn12 -> {
                showPopup(fab12)
            }
            R.id.btn13 -> {
                showPopup(fab13)
            }
            R.id.btn14 -> {
                showPopup(fab14)
            }
            R.id.btn15 -> {
                showPopup(fab15)
            }
            R.id.btn16 -> {
                showPopup(fab16)
            }
            R.id.btn17 -> {
                showPopup(fab17)
            }
            R.id.btn18 -> {
                showPopup(fab18)
            }
            R.id.btn19 -> {
                showPopup(fab19)
            }
            R.id.btn20 -> {
                showPopup(fab20)
            }
            R.id.btn21 -> {
                showPopup(fab21)
            }
            R.id.btn22 -> {
                showPopup(fab22)
            }
            R.id.btn23 -> {
                showPopup(fab23)
            }
            R.id.btn24 -> {
                showPopup(fab24)
            }
            R.id.btn25 -> {
                showPopup(fab25)
            }
            R.id.btn26 -> {
                showPopup(fab26)
            }
            R.id.btn27 -> {
                showPopup(fab27)
            }
            R.id.btn28 -> {
                showPopup(fab28)
            }
            R.id.btn29 -> {
                showPopup(fab29)
            }
            R.id.btn30 -> {
                showPopup(fab30)
            }
            R.id.btn31 -> {
                showPopup(fab31)
            }
            R.id.btn32 ->{
                showPopup(fab32)
            }

        }
    }
    private fun showPopup( btn: FloatingActionButton) {
        alertDialog = android.app.AlertDialog.Builder(this)
        val customLayout: View = layoutInflater.inflate(R.layout.popup_layout, null)
        alertDialog.setView(customLayout)
        happyFab = customLayout.findViewById(R.id.happyColor)
        stressFab = customLayout.findViewById(R.id.stressColor)
        relaxFab = customLayout.findViewById(R.id.relaxColor)
        sadFab = customLayout.findViewById(R.id.sadColor)
        angryFab = customLayout.findViewById(R.id.angryColor)
        setPickerColor()
        happyFab.setOnClickListener {
            changeCircleColor(btn, Color.parseColor("#F5CF0B"))
            alert.dismiss()
        }
        stressFab.setOnClickListener {
            changeCircleColor(btn, Color.parseColor("#FF7A00"))
            alert.dismiss()
        }
        relaxFab.setOnClickListener {

            changeCircleColor(btn, Color.parseColor("#BEC964"))
            alert.dismiss()
        }
        sadFab.setOnClickListener {

            changeCircleColor(btn, Color.parseColor("#33B1EB"))
            alert.dismiss()
        }
        angryFab.setOnClickListener {
            changeCircleColor(btn, Color.parseColor("#F81919"))
            alert.dismiss()

        }

        alert = alertDialog.create()
        alert.setCanceledOnTouchOutside(true)
        alert.show()

    }

    private fun setPickerColor(){
        changeCircleColor(happyFab, Color.parseColor("#F5CF0B"))
        changeCircleColor(stressFab, Color.parseColor("#FF7A00"))
        changeCircleColor(relaxFab, Color.parseColor("#BEC964"))
        changeCircleColor(sadFab, Color.parseColor("#33B1EB"))
        changeCircleColor(angryFab, Color.parseColor("#F81919"))
    }
}