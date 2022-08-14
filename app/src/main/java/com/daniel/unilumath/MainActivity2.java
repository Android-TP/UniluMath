package com.daniel.unilumath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_principale);
        this.eventEmitter();
    }
    private  void eventEmitter(){
        Button start = (Button)findViewById(R.id.about);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ecran = new Intent(MainActivity2.this, ActionPrincipale.class);
                startActivity(ecran);
            }
        });
    }
}