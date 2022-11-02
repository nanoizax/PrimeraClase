package com.williamsanchezospina.primeraclase;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

TextView tvTitulo;
TextView tvSubtitulo;
ImageView ivLogo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitulo = findViewById(R.id.tvTitulo);
        //tvTitulo.setText("Primera Clase");

        tvSubtitulo = findViewById(R.id.tvSubtitulo);
        tvSubtitulo.setText("Para la Segunda Clase Cambiar RAM de la PC");

        ivLogo = findViewById(R.id.ivLogo);
        Glide.with(this).load("https://seeklogo.com/images/A/android-logo-E109D453E3-seeklogo.com.png").into(ivLogo);

    }
}