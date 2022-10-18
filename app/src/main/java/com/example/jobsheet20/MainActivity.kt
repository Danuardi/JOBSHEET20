package com.example.jobsheet20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Siswa>()
    val listnama = arrayOf(
        "ZULFA SOFIANA",
        "AHMAD ARDHI SETIAWAN",
        "ANISATUR ROFIQOH",
        "AYU FEBRIANA PUTRI",
        "BOWO SAKTI WIRATAMA",
        "DANUARDI WAHYU PAMBUDI LAKSONO",
        "DEVA BUDIANA",
        "DWI FEBRI STIYANINGRUM",
        "EVA ROHAS",
        "FELIM EDI PRABOWO",
        "FITRI RAHMAWATI"
    )

    val listnis = arrayOf(
        "3039",
        "2973",
        "2974",
        "2977",
        "2979",
        "2981",
        "2982",
        "2985",
        "2987",
        "2988",
        "2992",
        )
    lateinit var SiswaView: RecyclerView
    lateinit var siswaAdapter: siswaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SiswaView = findViewById(R.id.SiswaView)
        SiswaView.layoutManager = LinearLayoutManager(this)

        for (i in listnama.indices) {
            list.add(Siswa(listnama[i], listnis[i]))
        }

        siswaAdapter = siswaAdapter(list)
        siswaAdapter.notifyDataSetChanged()
        SiswaView.adapter = siswaAdapter
    }
}