package com.example.note

interface MatiereItemCallBack {
    //je lui donne toute les actions possible
    fun onDelete(matiere: Matiere)
    fun onCellClick(matiere: Matiere)
}