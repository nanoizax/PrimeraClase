package com.williamsanchezospina.primeraclase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class SegundaActividad extends AppCompatActivity {

    TextView tvTitulo1;
    ImageView ivcondor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

        tvTitulo1 = findViewById(R.id.tvTitulo1);
        tvTitulo1.setText("Imagenes del Condor Herido");

        ivcondor = findViewById(R.id.ivCondor);
        Glide.with(this).load("https://www.google.com/search?q=pilgoso&oq=pilgoso&aqs=chrome..69i57j46i10i433i512j0i10i512l6.2703j0j1&client=ms-android-americamovil-co-revc&sourceid=chrome-mobile&ie=UTF-8#imgrc=lt7rDf3oAe6A1M").into(ivcondor);
    }
}