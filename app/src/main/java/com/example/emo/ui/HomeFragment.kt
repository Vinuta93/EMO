package com.example.emo.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.emo.R
import com.example.emo.adapter.GridAdapter
import com.example.emo.interfaces.OnGridItemClick
import com.example.emo.model.GridItem
import com.example.emo.ui.activities.TaskOne
import com.example.emo.ui.activities.TaskThree
import com.example.emo.ui.activities.TaskTwo

class HomeFragment : Fragment(), OnGridItemClick {

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.home_fragment, container, false)


        recyclerView = view.findViewById(R.id.rv)
        recyclerView.layoutManager = GridLayoutManager(requireActivity().applicationContext, 2)
        recyclerView.adapter = GridAdapter(requireActivity().applicationContext, generateData(), this )

        return view
    }

    private fun generateData() :List<GridItem> {
        return listOf(
            GridItem(R.drawable.image, "Activity 1", "Description..."),
            GridItem(R.drawable.image, "Activity 2", "Description..."),
            GridItem(R.drawable.image, "Activity 3", "Description..."),
            GridItem(R.drawable.image, "Activity 4", "Description..."),
            GridItem(R.drawable.image, "Activity 5", "Description..."),
            GridItem(R.drawable.image, "Activity 6", "Description..."),


        )

    }

    override fun onGridItemClick(item: GridItem, position: Int) {
        when (position){
            0 -> {
                startActivity(Intent(requireActivity().applicationContext, TaskOne::class.java))
            }
            1 -> {
                startActivity(Intent(requireActivity().applicationContext, TaskTwo::class.java))

            }
            2 -> {
                startActivity(Intent(requireActivity().applicationContext, TaskThree::class.java))

            }
            3 -> {

            }
            4 -> {

            }
            5 -> {

            }
        }
    }
}