package com.example.sumador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int Resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

public void sumar(View vista){

        EditText valor = (EditText)findViewById(R.id.editTextNumberValor1);
        int numero1 = Integer.parseInt(valor.getText().toString());

        EditText valor2 = (EditText) findViewById(R.id.editTextNumberSegundoValor);
        int numero2 = Integer.parseInt(valor2.getText().toString());



        Resultado = numero1 + numero2;

        TextView myTextView = (TextView) findViewById(R.id.textView8);
        String cadena = String.valueOf(Resultado);
        myTextView.setText(cadena);
}



}