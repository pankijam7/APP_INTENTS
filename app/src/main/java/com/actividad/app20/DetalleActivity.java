package com.actividad.app20;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetalleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        TextView tvDatos = findViewById(R.id.tvDatos);

        // Validación para evitar caídas (nulls) al recibir datos
        if (getIntent() != null && getIntent().hasExtra("MENSAJE_EXTRA")) {
            String mensajeRecibido = getIntent().getStringExtra("MENSAJE_EXTRA");
            tvDatos.setText(mensajeRecibido);
        } else {
            tvDatos.setText("No se recibieron datos.");
        }
    }
}