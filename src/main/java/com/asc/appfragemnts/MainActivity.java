package com.asc.appfragemnts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements EnviarMensaje{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void EnviarDato(String dato) {
    FragmentoB fb =(FragmentoB) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView);
    fb.recibir(dato);
    }
}