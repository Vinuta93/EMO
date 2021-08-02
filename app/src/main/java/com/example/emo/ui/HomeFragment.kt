package com.example.emo.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.emo.Activities
import com.example.emo.R

class HomeFragment : Fragment() {

    private lateinit var activityImg: ImageView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.home_fragment, container, false)
        activityImg = view.findViewById(R.id.activities)
        activityImg.setOnClickListener {
            startActivity(Intent(activity?.applicationContext,Activities::class.java))

        }
        return view
    }
}