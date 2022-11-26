package com.example.gottochtrevligt

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.text.SimpleDateFormat
import java.util.*



class PlaceRecyclerAdapter(val context : Context, val places : List<Place>) : RecyclerView.Adapter<PlaceRecyclerAdapter.ViewHolder>() {

    val layoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.item_layout, parent, false)
        return ViewHolder(itemView)
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val place = HospitalPlaces.places[position]

        holder.placeTextView.text = place.name
        holder.timeTextView.text = place.time

    }

    override fun getItemCount(): Int = HospitalPlaces.places.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val placeTextView = itemView.findViewById<TextView>(R.id.placeView)
        val timeTextView = itemView.findViewById<TextView>(R.id.timeView)
        val deleteButton = itemView.findViewById<ImageView>(R.id.deleteBtn)
        var placePosition = 0

        init {
            deleteButton.setOnClickListener {
                removePlace(placePosition)
            }
        }


    }

    @SuppressLint("NotifyDataSetChanged")
    fun removePlace(position : Int) {
        HospitalPlaces.places.removeAt(position)
        notifyDataSetChanged()
    }

    fun getTime() : String {
        val sdf = SimpleDateFormat("HH:mm")
        val time = sdf.format(Date())

        Log.d("!!!", time)
        return time
    }


}