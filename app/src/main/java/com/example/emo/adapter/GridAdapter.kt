package com.example.emo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.emo.interfaces.OnGridItemClick
import com.example.emo.model.GridItem
import com.example.emo.R


class GridAdapter(ctx: Context, items: List<GridItem>?, private var clickListener: OnGridItemClick) : RecyclerView.Adapter<GridAdapter.GridViewHolder>() {
    private var context:Context? = null
    var itemList:List<GridItem>? = null
    init {
        context = ctx
        itemList = items
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.grid_item_layout,null)
        return GridViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList!!.size
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        holder.initialize(itemList!![position], clickListener)
    }

    class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView? = null
        var icon :ImageView? = null
        var imageText1: TextView? = null
        var imageText2: TextView? = null
        init {
            image = itemView.findViewById(R.id.item_image)
            imageText1 = itemView.findViewById(R.id.item_text1)
            imageText2 = itemView.findViewById(R.id.item_text2)
            icon = itemView.findViewById(R.id.icon)

        }
        fun initialize(item:GridItem, action: OnGridItemClick){

            image?.setImageResource(item.imageID)
            imageText1?.text = item.firstText
            imageText2?.text = item.secondText
            if (adapterPosition % 2 == 0)
                icon?.setImageResource(item.icon)
            else
                icon?.setImageResource(item.icon)
            itemView.setOnClickListener {
                action.onGridItemClick(item,adapterPosition)
            }




        }

    }

}
