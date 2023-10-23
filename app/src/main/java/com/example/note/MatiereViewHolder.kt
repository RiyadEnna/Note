package com.example.note

import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
//pour construire la class matiere view holder il faut passer en parametre une var de type view
//on vas remplir chaque cellule
class MatiereViewHolder(itemView:View):ViewHolder(itemView) {
    var nameTv:TextView
    var coefTv:TextView
    var deleteIb:ImageButton

    init {
        //on lie nos differentes variable
        nameTv = itemView.findViewById(R.id.name_matiere)
        coefTv = itemView.findViewById(R.id.coef_matiere)
        deleteIb = itemView.findViewById(R.id.imageButtonDelete)
    }

    fun fill(matiere: Matiere){
        nameTv.text = matiere.name
        coefTv.text = matiere.coef.toString()
    }

}