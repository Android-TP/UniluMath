package com.daniel.unilumath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //public Button monboutopn = (Button)findViewById(R.id.connect);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil_activity);
        this.eventEmitter();
    }

   private void eventEmitter(){
       Button bat = (Button)findViewById(R.id.connexion);
       Button show_menu = (Button) findViewById(R.id.action_menu);
        show_menu.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               ItemListDialogFragment.newInstance(3).show(getSupportFragmentManager(), "dialog");
           }
       });



       bat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ecran2 = new Intent(MainActivity.this, connexion.class);
                startActivity(ecran2);
            }
        });

       Button action1 = (Button)findViewById(R.id.inscription);
       action1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent ecran3 = new Intent(MainActivity.this, inscription.class);
               startActivity(ecran3);
           }
       });

       Button preinscription = (Button)findViewById(R.id.pre_inscription);
       preinscription.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent ecran4 = new Intent(MainActivity.this, Preinscription.class);
               startActivity(ecran4);
           }
       });


    }

   
}