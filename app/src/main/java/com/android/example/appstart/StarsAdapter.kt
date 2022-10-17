package com.android.example.appstart

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StarsViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val starsName: TextView
    val starsImage : ImageView


    init {
        starsName = view.findViewById(R.id.stars_name)
        starsImage = view.findViewById(R.id.stars_img)


    }

}

class StarsAdapter(private val stars: List<Stars>) : RecyclerView.Adapter<StarsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StarsViewHolder {

        val starsView =
            LayoutInflater.from(parent.context).inflate(R.layout.starslistitems, parent, false)
        return StarsViewHolder(starsView)
    }

    override fun onBindViewHolder(holder: StarsViewHolder, position: Int) {
        val star = stars[position]
        holder.starsName.text = "${star.name}"
        holder.starsImage.setImageDrawable(holder.itemView.context.getDrawable(star.img))
    }

    override fun getItemCount(): Int {
        return stars.size
    }
}