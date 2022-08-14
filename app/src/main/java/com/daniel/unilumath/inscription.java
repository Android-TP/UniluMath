package com.daniel.unilumath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class inscription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        this.eventEmitter();
    }
    private  void eventEmitter(){
        Button bot = (Button)findViewById(R.id.inscrire);
        bot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ecran = new Intent(inscription.this, MainActivity2.class);
                startActivity(ecran);
            }
        });
    }
}