package com.example.alejandro.simuladorfutbol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PartidoActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partido);

        ImageView imageLocal = findViewById(R.id.imgLocal);
        TextView textLocal = findViewById(R.id.nombreLocal);

        ImageView imageVisitante = findViewById(R.id.imgVisitante);
        TextView textVisitante = findViewById(R.id.nombreVisitante);

        Partido partido = (Partido) getIntent().getSerializableExtra("partido");

        imageLocal.setImageResource(partido.getImgLocal());
        textLocal.setText(partido.getNomLocal());

        imageVisitante.setImageResource(partido.getImgVisitante());
        textVisitante.setText(partido.getNomVisitante());

    }
}
