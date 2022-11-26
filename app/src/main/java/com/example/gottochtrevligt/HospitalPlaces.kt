package com.example.gottochtrevligt

import android.annotation.SuppressLint
import android.util.Log
import java.text.SimpleDateFormat
import java.util.*

object HospitalPlaces {
    val places = mutableListOf<Place>()

//    init {
//        createData()
//    }
//
//    fun createData() {
//        places.add(Place("test2", getTime()))
//    }


    @SuppressLint("SimpleDateFormat")
    fun getTime() : String {
        val sdf = SimpleDateFormat("HH:mm")
        val time = sdf.format(Date())

        Log.d("!!!", time)
        return time
    }
}