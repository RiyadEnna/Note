package com.example.note

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListMatiereActivity : AppCompatActivity() {
    companion object{
        val nameKey = "nom"
        val coefKey = "coef"
    }
    lateinit var adapter:MatiereViewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_matiere)
        setViewItem()
    }

    fun setViewItem(){
        //j'instancie l'adapter
        adapter = MatiereViewAdapter(MatiereRepository.matiereList,object:MatiereItemCallBack{
            override fun onDelete(matiere: Matiere) {
                MatiereRepository.matiereList.remove(matiere)
                adapter.setMatierList(MatiereRepository.matiereList)
            }

            override fun onCellClick(matiere: Matiere) {
                gotoDetailActivity(matiere)
            }

        })
        val recyclerView = findViewById<RecyclerView>(R.id.list_matiere)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

    }

    private fun gotoDetailActivity(matiere: Matiere) {
        val intent = Intent(this,MatiereDetailActivity::class.java)
        intent.putExtra(nameKey,matiere.name)
        intent.putExtra(coefKey,matiere.coef)
        startActivity(intent)
    }
}