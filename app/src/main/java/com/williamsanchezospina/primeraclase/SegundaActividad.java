package com.williamsanchezospina.primeraclase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class SegundaActividad extends AppCompatActivity {

    TextView tvTitulo1;
    ImageView ivcondor;
    ImageView ivPrueba;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

        tvTitulo1 = findViewById(R.id.tvTitulo1);
        tvTitulo1.setText("Imagenes del Condor Herido");

        ivPrueba = findViewById(R.id.ivPrueba);

        ivcondor = findViewById(R.id.ivCondor);
        Glide.with(this).load("https://www.ecured.cu/images/thumb/7/7f/Lindo_Pulgoso.png/260px-Lindo_Pulgoso.png").into(ivPrueba);
    }
}