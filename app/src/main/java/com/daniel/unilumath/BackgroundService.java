package com.daniel.unilumath;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.CountDownTimer;
import android.os.IBinder;

public class BackgroundService extends Service { //le service d'arriere plan
    private  BackgroundService worker;

    public BackgroundService() {
    }
    private int state=0;
    private final IBinder mBinder = new BackgroundBinder();

    public class BackgroundBinder extends Binder {
        BackgroundService getService() {
            return BackgroundService.this;
        }
    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return mBinder;
    }
    @Override
    public void onCreate() {
        super.onCreate();
// Placez ici le code qui sera exécuté lors de la création de ce service
    }

    public void working(){
        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                state++;
                //mTextField.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                //mTextField.setText("done!");
                state = 100;
            }
        }.start();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
// Placez ici le code qui sera exécuté à chaque démarrage du service
        return START_STICKY;
    }
    @Override
    public void onDestroy() {
// Placez ici le code qui sera exécuté lors de la destruction de ce service
    }

}