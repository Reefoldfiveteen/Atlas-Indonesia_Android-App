package com.reefii.atlasindonesia

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso


class RecyclerViewAdapter(private val context: Context, private val itemData: List<Item_data>, private val listener: (Item_data) -> Unit)
    : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(LayoutInflater.from(context).inflate(R.layout.cardview, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(itemData[position], listener)
    }

    override fun getItemCount(): Int = itemData.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        private val name = view.findViewById<TextView>(R.id.namee)
        private val urutan = view.findViewById<TextView>(R.id.uruttan)
        private val detail = view.findViewById<TextView>(R.id.detaill)
        private val imagelogodaerah = view.findViewById<ImageView>(R.id.photoo)
        //private val imagepulaudaerah = view.findViewById<ImageView>(R.id.not show in home)

        fun bindItem(items: Item_data, listener: (Item_data) -> Unit) {
            name.text = items.name
            urutan.text = items.nourut
            detail.text = items.detail
            //items.imagepulau?.let { Picasso.get().load(it).into(imagepulaudaerah) }
            items.imagelogodaerah?.let { Picasso.get().load(it).into(imagelogodaerah) }
            itemView.setOnClickListener { listener(items) }
        }

    }

}