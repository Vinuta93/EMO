package com.example.emo.ui.activities.taskthreesubactivities.subfragments

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
import com.example.emo.ui.activities.taskthreesubactivities.TaskThreeSubActivity
import com.google.android.material.textfield.TextInputEditText

class ThirdQuesFragment : Fragment() {

    lateinit var btn: Button
    lateinit var editText : TextInputEditText
    var allow : Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.taskthreethird, container, false)
        TaskThreeSubActivity.stepView.go(2,true)
        editText = view.findViewById(R.id.editText)
        btn = view.findViewById(R.id.nxt)

        btn.setOnClickListener {
            if (allow)
                activity?.startActivity(Intent(activity?.applicationContext, TaskCompleted::class.java))
        }
        editText.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {

                // TODO Auto-generated method stub
            }

            override fun afterTextChanged(s: Editable) {
                allow = s.length >10
            }
        })
        return view    }
}

