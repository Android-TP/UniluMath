package com.daniel.unilumath;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.IBinder;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Etudiant extends AppCompatActivity {
    private BackgroundService worker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etudiant2);
        this.event();
        this.send("example data");
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

    public void send(String Data){
        Intent background = new Intent(Etudiant.this, BackgroundService.class);
        bindService(background, maConnexion, Context.BIND_AUTO_CREATE);
        new CountDownTimer(10000, 100) {

            @RequiresApi(api = Build.VERSION_CODES.N)
            public void onTick(long millisUntilFinished) {
                //mTextField.setText("seconds remaining: " + millisUntilFinished / 1000);
                ProgressBar  prog = (ProgressBar)findViewById(R.id.progressBar);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    prog.setProgress(prog.getProgress()+1, true);
                }else{
                    prog.setProgress(prog.getProgress()+1);
                }
                if(prog.getProgress()>=100){
                    TextView txt = (TextView)findViewById(R.id.textView76);
                    TextView academic = (TextView)findViewById(R.id.textView20);
                    academic.setText("2021-2022");
                    txt.setText("Complete");
                }
            }

            public void onFinish() {
                //mTextField.setText("done!");
                TextView txt = (TextView)findViewById(R.id.textView76);
                TextView academic = (TextView)findViewById(R.id.textView20);
                academic.setText("2021-2022");
                txt.setText("Complete");

            }
        }.start();
    }
    // L’objet ServiceConnection gère la connexion entre l’activité et le service.
    private ServiceConnection maConnexion = new ServiceConnection() {
        // Méthode appelée lorsque la connexion est établie. Récupère la référence
// vers le service associé.
        public void onServiceConnected(ComponentName className, IBinder service) {
            worker = ((BackgroundService.BackgroundBinder)service).getService();
        }
        // Méthode appelée lorsque la connexion est rompue.
        public void onServiceDisconnected(ComponentName className) {
            worker = null;
        }
    };
}