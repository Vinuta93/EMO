package com.example.emo.ui.activities.taskthreesubactivities.subfragments

import android.graphics.Color
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


class FirstQuesFragment : Fragment() {

    lateinit var btn: Button
    lateinit var editText : TextInputEditText
    var allow : Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.taskthreefirst, container, false)
        btn = view.findViewById(R.id.nxt)
        editText = view.findViewById(R.id.editText)
        btn.setOnClickListener {
            if (allow)
                fragmentManager?.beginTransaction()?.replace(R.id.host_fragment, SecondQuesFragment())?.commit()
        }
        editText.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {

            }

            override fun afterTextChanged(s: Editable) {
                allow = s.length >=5
            }
        })

        return view    }
}