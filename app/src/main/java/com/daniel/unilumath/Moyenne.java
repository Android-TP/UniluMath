package com.daniel.unilumath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Moyenne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moyenne);
        Button but17 = (Button)findViewById(R.id.button17);
        but17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act1 = new Intent(Moyenne.this, Recours.class);
                startActivity((act1));
            }
        });
    }
}