package com.example.emo


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageSwitcher
import android.widget.ImageView
import android.widget.ViewSwitcher
import androidx.appcompat.app.AppCompatActivity


class SplashScreen : AppCompatActivity() {


    private lateinit var imageSwitcher : ImageSwitcher
    private var animationCounter = 1
    private var imageSwitcherHandler: Handler? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        imageSwitcher = findViewById(R.id.imgSwitcher)
        val inn: Animation = AnimationUtils.loadAnimation(this, R.anim.transition_in)
        val out: Animation = AnimationUtils.loadAnimation(this, R.anim.transition_out)
        imageSwitcher.inAnimation = inn
        imageSwitcher.outAnimation = out


        val decorView: View = window.decorView
        val uiOption1: Int = View.SYSTEM_UI_FLAG_FULLSCREEN
        val uiOptions: Int = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN)
        decorView.setSystemUiVisibility(uiOptions)
        decorView.setSystemUiVisibility(uiOption1)

        imageSwitcherHandler = Handler(Looper.getMainLooper())

        imageSwitcher.setFactory {
            ImageView(
                applicationContext
            )
        }

        Handler().postDelayed( {
            val mainIntent = Intent(this, MainActivity::class.java)
            startActivity(mainIntent)
            finish()

        }, 3000)


        imageSwitcherHandler!!.post(object : Runnable {
            override fun run() {
                when (animationCounter++) {
                    1 -> imageSwitcher.setImageResource(R.drawable.happy)
                    2 -> imageSwitcher.setImageResource(R.drawable.angry)
                    3 -> imageSwitcher.setImageResource(R.drawable.stress)
                    4 -> imageSwitcher.setImageResource(R.drawable.sad)
                    5 -> imageSwitcher.setImageResource(R.drawable.relax)
                }
                animationCounter %= 6
                if (animationCounter == 0) animationCounter = 1
                imageSwitcherHandler!!.postDelayed(this, 400)
            }
        })



    }
}