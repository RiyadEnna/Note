package com.example.note

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MatiereDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matiere_detail)
        setViewItem()
    }

    fun setViewItem(){
        val name = intent.extras?.getString(ListMatiereActivity.nameKey)
        val coef = intent.extras?.getInt(ListMatiereActivity.coefKey)
        findViewById<TextView>(R.id.info_matiere).text = name.toString()
        findViewById<TextView>(R.id.nom_coef_matiere).text = coef.toString()
    }


}