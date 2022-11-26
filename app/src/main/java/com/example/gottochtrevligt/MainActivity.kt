package com.example.gottochtrevligt

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {

    //lateinit var sdf : SimpleDateFormat
    lateinit var recyclerView : RecyclerView

    @SuppressLint("SimpleDateFormat", "MissingInflatedId", "NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = PlaceRecyclerAdapter(this, HospitalPlaces.places)

        val narak = findViewById<Button>(R.id.narakutBtn)
        val apotek = findViewById<Button>(R.id.apotekBtn)
        val ckAkut = findViewById<Button>(R.id.ckBtn)
        val bkAkut = findViewById<Button>(R.id.bkBtn)
        val mava = findViewById<Button>(R.id.mavaBtn)
        val transan = findViewById<Button>(R.id.transBtn)
        val floorEight = findViewById<Button>(R.id.planBtn)
        val frys = findViewById<Button>(R.id.frysBtn)
        val report = findViewById<TextView>(R.id.reportBtn)

        narak.setOnClickListener {
            val place = Place("Närakuten", HospitalPlaces.getTime())
            HospitalPlaces.places.add(place)
            onResume()
        }

        apotek.setOnClickListener {
            val place = Place("Apoteket", HospitalPlaces.getTime())
            HospitalPlaces.places.add(place)
            onResume()
        }

        ckAkut.setOnClickListener {
            val place = Place("CK-akuten", HospitalPlaces.getTime())
            HospitalPlaces.places.add(place)
            onResume()
        }

        bkAkut.setOnClickListener {
            val place = Place("BK-akuten", HospitalPlaces.getTime())
            HospitalPlaces.places.add(place)
            onResume()
        }

        mava.setOnClickListener {
            val place = Place("MAVA", HospitalPlaces.getTime())
            HospitalPlaces.places.add(place)
            onResume()
        }

        transan.setOnClickListener {
            val place = Place("Transfusion", HospitalPlaces.getTime())
            HospitalPlaces.places.add(place)
            onResume()
        }

        floorEight.setOnClickListener {
            val place = Place("Plan 8", HospitalPlaces.getTime())
            HospitalPlaces.places.add(place)
            onResume()
        }

        frys.setOnClickListener {
            val place = Place("Frysen", HospitalPlaces.getTime())
            HospitalPlaces.places.add(place)
            onResume()
        }

        report.setOnClickListener {
            val intent = Intent(this, ReportActivity::class.java)

        }






    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onResume() {
        super.onResume()

        recyclerView.adapter?.notifyDataSetChanged()
    }




}