package com.example.note

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setViewItems ()
    }

    fun setViewItems (){
        //recuperer la vue du bouton d'enrgistrement on vas ecouter si on clique dessus
        findViewById<Button>(R.id.btn_enregistrer_matiere).setOnClickListener{
            // on stocke ce que l'on à saisie dans Edit text matiere pour récuperer la valeur saisie au format chaine de car
            val name = findViewById<EditText>(R.id.txt_matiere_saisie).text.toString()
            //idem pour le coef
            val coef = findViewById<EditText>(R.id.editTextText2).text.toString().toInt()
            //instancier un objet de la class matiére
            val matiere = Matiere(name,coef)
            //je rajoute la matiere dans la list
            MatiereRepository.matiereList.add(matiere)
            //  equivalent console log
            Toast.makeText(MainActivity@this,MatiereRepository.matiereList.size.toString(),Toast.LENGTH_LONG).show()
        }

        findViewById<Button>(R.id.btn_consulter_la_liste).setOnClickListener{
            //on creer l'intent (une intention ici d'ouvrir la page liste matière activity)
            val intent = Intent(this,ListMatiereActivity::class.java)
            //la on lance l'intention d'ouvrir
            startActivity(intent)
        }
    }
}