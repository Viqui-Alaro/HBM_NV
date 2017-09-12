package com.example.valaro.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

  String tag = "Ciclo de Vida";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag,"se ha ejecutado el evento oncreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag,"se ha ejecutado el evento pausa");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag,"se ha ejecutado el evento stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag,"se ha ejecutado el evento destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag,"se ha ejecutado el evento oon pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag,"se ha ejecutado el evento resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag,"se ha ejecutado el evento oncreate");
    }
}
