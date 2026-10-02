package com.actividad.app20;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencias a los botones de la interfaz
        Button btnWeb = findViewById(R.id.btnWeb);
        Button btnDial = findViewById(R.id.btnDial);
        Button btnEmail = findViewById(R.id.btnEmail);
        Button btnWifi = findViewById(R.id.btnWifi);
        Button btnMap = findViewById(R.id.btnMap);

        Button btnDetalle = findViewById(R.id.btnDetalle);
        Button btnConfig = findViewById(R.id.btnConfig);
        Button btnAyuda = findViewById(R.id.btnAyuda);

        // ==========================================
        // EVENTOS IMPLÍCITOS[cite: 1]
        // ==========================================

        // 1. Ver una página web específica[cite: 1]
        btnWeb.setOnClickListener(v -> {
            try {
                Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.santotomas.cl"));
                startActivity(intentWeb);
            } catch (Exception e) {
                mostrarError("No hay navegador instalado");
            }
        });

        // 2. Llamar (mostrar marcador telefónico)[cite: 1]
        btnDial.setOnClickListener(v -> {
            try {
                Intent intentDial = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+56912345678"));
                startActivity(intentDial);
            } catch (Exception e) {
                mostrarError("No hay aplicación de teléfono");
            }
        });

        // 3. Enviar correo electrónico[cite: 1]
        btnEmail.setOnClickListener(v -> {
            try {
                Intent intentEmail = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:contacto@prueba.cl"));
                intentEmail.putExtra(Intent.EXTRA_SUBJECT, "Asunto de prueba");
                startActivity(intentEmail);
            } catch (Exception e) {
                mostrarError("No hay cliente de correo instalado");
            }
        });

        // 4. Abrir configuración del dispositivo (Wi-Fi)[cite: 1]
        btnWifi.setOnClickListener(v -> {
            try {
                Intent intentWifi = new Intent(Settings.ACTION_WIFI_SETTINGS);
                startActivity(intentWifi);
            } catch (Exception e) {
                mostrarError("No se pudo abrir la configuración");
            }
        });

        // 5. Abrir ubicación en Google Maps[cite: 1]
        btnMap.setOnClickListener(v -> {
            try {
                // Coordenadas de ejemplo (Santiago)
                Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:-33.4489,-70.6693?q=Santiago"));
                startActivity(intentMap);
            } catch (Exception e) {
                mostrarError("Google Maps no está instalado");
            }
        });

        // ==========================================
        // EVENTOS EXPLÍCITOS
        // ==========================================

        // 6. MainActivity -> DetalleActivity (con datos extra)
        btnDetalle.setOnClickListener(v -> {
            Intent intentDetalle = new Intent(MainActivity.this, DetalleActivity.class);
            // Pasando datos (putExtra) para mostrar en el detalle
            intentDetalle.putExtra("MENSAJE_EXTRA", "¡Hola! Este dato viene desde MainActivity.");
            startActivity(intentDetalle);
        });

        // 7. MainActivity -> ConfigActivity (ajustes)
        btnConfig.setOnClickListener(v -> {
            Intent intentConfig = new Intent(MainActivity.this, ConfigActivity.class);
            startActivity(intentConfig);
        });

        // 8. MainActivity -> AyudaActivity (FAQ o tutorial)
        btnAyuda.setOnClickListener(v -> {
            Intent intentAyuda = new Intent(MainActivity.this, AyudaActivity.class);
            startActivity(intentAyuda);
        });
    }

    // Método auxiliar para validación y prevención de cierres inesperados
    private void mostrarError(String mensaje) {
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
    }
}