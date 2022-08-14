package com.daniel.unilumath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class connexion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.eventEmitter();
    }
    private  void eventEmitter(){
        Button bot = (Button)findViewById(R.id.connect);
        bot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ecran = new Intent(connexion.this, MainActivity2.class);
                startActivity(ecran);
            }
        });
    }
}