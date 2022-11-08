package com.example.jobsheet20mita

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<siswa>()
    val listNama = arrayOf(
        "Jihan Salwa Fitriani",
        "Khotimatus Sa'adah",
        "Lada'ardi Sachio Lawidyath",
        "Latifah Irsyadiah",
        "Maulida Intan Nur Aini",
        "Miftakhul Jannah",
        "Muh Asa Susilo Farikh Sakti",
        "Muhammad haikal",
        "Muhammad Rifqil Khanif",
        "Nabhan Aflahu Syafiq",
        "Natasya Ayu Lestanti"
    )

    val listNis = arrayOf(
        "Nis: 3000",
        "Nis: 3002",
        "Nis: 3003",
        "Nis: 3005",
        "Nis: 3008",
        "Nis: 3010",
        "Nis: 3011",
        "Nis: 3013",
        "Nis: 3015",
        "Nis: 3017",
        "Nis: 3019"
    )
    lateinit var makananView: RecyclerView
    lateinit var  makananAdapter: makananAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        makananView = findViewById(R.id.nama)
        makananView.layoutManager = LinearLayoutManager( this)

        for (i in listNama.indices){
            list.add(siswa(listNama[i], listNis[i]))
        }

        makananAdapter = makananAdapter(list)
        makananAdapter.notifyDataSetChanged()
        makananView.adapter = makananAdapter
    }
}




