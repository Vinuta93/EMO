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
import com.example.emo.ui.activities.tasktwosubactivities.TaskTwoSubActivity
import com.google.android.material.textfield.TextInputEditText

class FourthQuesFragment :Fragment() {

    lateinit var btn: Button
    private lateinit var editText : TextInputEditText
    var allow : Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.tasktwofourth, container, false)
        TaskTwoSubActivity.stepView.go(3,true)
        btn = view.findViewById(R.id.nxt)
        editText = view.findViewById(R.id.editText)

        btn.setOnClickListener {
            if (allow)
                fragmentManager?.beginTransaction()?.replace(R.id.host_fragment2, FifthQuesFragment())?.commit()
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


        return view    }
}