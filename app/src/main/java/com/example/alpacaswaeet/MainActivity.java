package com.example.alpacaswaeet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText monto;
    private Button reproducir;
    private TextView boleta;
    private TextView folio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        monto = findViewById(R.id.entrada);
        reproducir = findViewById(R.id.carga);
        boleta = findViewById(R.id.texto1);
        folio = findViewById(R.id.texto2);


    }
}