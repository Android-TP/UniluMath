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


    }

   
}