package com.example.medicina2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }

    public void LavadoManos(View view){
        Intent intent = new Intent(this, LavadoManos.class);
        startActivity(intent);
    }

    public void PosturaGuantes(View view){
        Intent intent = new Intent(this, PosturaGuantes.class);
        startActivity(intent);
    }

    public void LesionesMusculares(View view){
        Intent intent = new Intent(this, LesionesMusculares.class);
        startActivity(intent);
    }

    public void Estres(View view){
        Intent intent = new Intent(this, Estres.class);
        startActivity(intent);
    }

    public void Movilidad(View view){
        Intent intent = new Intent(this, ProblemasMovilidad.class);
        startActivity(intent);
    }

    public void Referencias(View view){
        Intent intent = new Intent(this, Referencias.class);
        startActivity(intent);
    }

    public void Manual(View view){
        Intent intent = new Intent(this, Manual.class);
        startActivity(intent);
    }

    public void Duelo(View view){
        Intent intent = new Intent(this, Duelo.class);
        startActivity(intent);
    }

    public void Videos(View view){
        Intent intent = new Intent(this, Videos.class);
        startActivity(intent);
    }
}
