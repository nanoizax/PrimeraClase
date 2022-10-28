package com.williamsanchezospina.primeraclase;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

TextView tvTitulo;
TextView tvSubtitulo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitulo = findViewById(R.id.tvTitulo);
        //tvTitulo.setText("Primera Clase");

        tvSubtitulo = findViewById(R.id.tvSubtitulo);
        tvSubtitulo.setText("Para la Segunda Clase Cambiar RAM de la PC");

    }
}