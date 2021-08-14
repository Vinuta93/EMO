package com.example.emo.ui.activities.tasktwosubactivities.subfragments

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.emo.R
import com.example.emo.ui.activities.taskthreesubactivities.subfragments.TaskCompleted
import com.example.emo.ui.activities.tasktwosubactivities.TaskTwoSubActivity
import com.google.android.material.textfield.TextInputEditText

class FifthQuesFragment : Fragment() {

    lateinit var btn: Button
    private lateinit var editText : TextInputEditText
    var allow : Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.tasktwofifth, container, false)
        TaskTwoSubActivity.stepView.go(4,true)
        btn = view.findViewById(R.id.nxt)
        editText = view.findViewById(R.id.editText)

        btn.setOnClickListener {
            if (allow)
                activity?.startActivity(Intent(activity?.applicationContext, TaskCompleted::class.java))
        }
        editText.addTextChangedListener( object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                if (s != null) {
                    allow = s.length >=3
                }
            }

        })

        return view    }
}