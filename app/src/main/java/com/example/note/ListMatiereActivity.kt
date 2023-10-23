package com.example.note

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListMatiereActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_matiere)
        setViewItem()
    }

    fun setViewItem(){
        //j'instancie l'adapter
        val adapter = MatiereViewAdapter(MatiereRepository.matiereList)
        val recyclerView = findViewById<RecyclerView>(R.id.list_matiere)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

    }
}