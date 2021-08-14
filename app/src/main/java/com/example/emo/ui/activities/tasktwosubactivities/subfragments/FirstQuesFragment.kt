package com.example.emo.ui.activities.tasktwosubactivities.subfragments

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.emo.R
import com.google.android.material.textfield.TextInputEditText


class FirstQuesFragment :Fragment() {

    lateinit var btn: Button
    private lateinit var editText : TextInputEditText
    lateinit var editText2 : TextInputEditText
    var allow : Boolean = false
    var allow2 : Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.tasktwofirst, container, false)
        btn = view.findViewById(R.id.nxt)
        editText = view.findViewById(R.id.editText)
        editText2 = view.findViewById(R.id.editText2)

        btn.setOnClickListener {
            if (allow && allow2)
            fragmentManager?.beginTransaction()?.replace(R.id.host_fragment2, SecondQuesFragment())?.commit()
        }

        editText.addTextChangedListener( object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                TODO("Not yet implemented")
            }

            override fun afterTextChanged(s: Editable?) {
                if (s != null) {
                    allow = s.length >10
                }
            }

        })

        editText2.addTextChangedListener( object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                TODO("Not yet implemented")
            }

            override fun afterTextChanged(s: Editable?) {
                if (s != null) {
                    allow2 = s.length >10
                }
            }

        })


        return view    }
}