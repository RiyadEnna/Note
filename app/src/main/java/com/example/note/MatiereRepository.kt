package com.example.note

class MatiereRepository {
    //permet de le rendre visible équivalent static
    companion object{
        //list que l'on peut modifier
        var matiereList = mutableListOf<Matiere>()
    }
}