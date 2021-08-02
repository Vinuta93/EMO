package com.example.emo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.emo.R

class MessageFragment : Fragment() {

    lateinit var  mybtn : Button


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.message_fragment, container, false)
        mybtn = view.findViewById(R.id.button2)
        return view
    }
}