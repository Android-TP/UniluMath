package com.daniel.unilumath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Etudiant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etudiant2);
        this.event();
    }
    protected void event(){
        Button horraire = (Button)findViewById(R.id.horaire);
        Button minerval = (Button)findViewById(R.id.button8);
        Button f_connexe = (Button)findViewById(R.id.button7);
        Button infos_button = (Button)findViewById(R.id.button2);
        Button moyenne = (Button)findViewById(R.id.button9);
        Button preuve = (Button)findViewById(R.id.button80);
        preuve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activite = new Intent(Etudiant.this, Preuve.class);
                startActivity(activite);
            }
        });

        moyenne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activity_moyenne = new Intent(Etudiant.this, Moyenne.class);
                startActivity(activity_moyenne);
                
            }
        });
        horraire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startHoraire = new Intent(Etudiant.this, Horaire.class);
                startActivity(startHoraire);

            }
        });
        infos_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent informations = new Intent(Etudiant.this, Infos.class);
                startActivity(informations);
            }
        });
        minerval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent minervale = new Intent(Etudiant.this, Minerval.class);
                startActivity(minervale);
            }
        });
        f_connexe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent minervales = new Intent(Etudiant.this, Minerval.class);
                startActivity(minervales);
            }
        });
    }
}