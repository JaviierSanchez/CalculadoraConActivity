package com.example.sumador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ResultadoOperacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_operacion);

        TextView valor_resultado = findViewById(R.id.texto_resultado);


        Bundle datos = getIntent().getExtras();
        int res =datos.getInt("resultado");
        valor_resultado.setText("El resultado de la operacion es: " + res);

    }
}