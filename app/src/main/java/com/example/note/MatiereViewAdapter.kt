package com.example.note

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView.Adapter

class MatiereViewAdapter(matieres: MutableList<Matiere>): Adapter<MatiereViewHolder>() {
    var matieres= mutableListOf<Matiere>()

    init {
        this.matieres =matieres
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MatiereViewHolder {
        //creer un inflater qui va permetre plus tard de creer une vue correspondant a un layout
        val inflater = LayoutInflater.from(parent.context)
        //ici on crer la vue correspondant au layout container item
        val view = inflater.inflate(R.layout.container_item, parent,false)
        return MatiereViewHolder(view)
    }

    override fun getItemCount(): Int {
        return matieres.size
    }

    override fun onBindViewHolder(holder: MatiereViewHolder, position: Int) {
        //fill les élements qui sont dans notre liste dans la vue en fonction de l'index
        holder.fill(matieres.get(position))
    }
}