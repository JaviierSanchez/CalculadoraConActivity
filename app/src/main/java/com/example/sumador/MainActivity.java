package com.example.sumador;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

   public void operar(View vista) {
        int numero1 = 0;
        int numero2 = 0;
        int res = 0;
        RadioButton sum =  findViewById(R.id.radioButtonSumar);
        RadioButton restar =  findViewById(R.id.radioButtonRestar);
        RadioButton multi = findViewById(R.id.radioButtonMultiplicar);
        RadioButton divi = findViewById(R.id.radioButtonDividir);

        EditText valor1 = (EditText) findViewById(R.id.editTextValor1);
        try {
            numero1 = Integer.parseInt(valor1.getText().toString());
        } catch (NumberFormatException e) {
            Toast.makeText(this, "INTRODUCE NUMERO!!!", Toast.LENGTH_SHORT).show();
        }
        EditText valor2 = (EditText) findViewById(R.id.editTextValor2);
        try {
            numero2 = Integer.parseInt(valor2.getText().toString());
        } catch (NumberFormatException e) {
            Toast.makeText(this, "INTRODUCE NUMERO!!!", Toast.LENGTH_SHORT).show();
        }

        if (sum.isChecked()) {

            res = numero1 + numero2;
        }
        if (restar.isChecked()) {
            res = numero1 - numero2;
        }
        if(multi.isChecked()){
            res = numero1 * numero2;
        }
        if (divi.isChecked()){
            if(numero2 == 0){
                Toast.makeText(this,"No se puede dividir entre 0",Toast.LENGTH_SHORT).show();
            }else {
                res = numero1 / numero2;
            }

        }



        Intent i = new Intent(this,ResultadoOperacion.class);
        i.putExtra("resultado",res);
        startActivity(i);

    }







    public void acercaDe(View vista) {

        Intent irActivity = new Intent(MainActivity.this, AcercaDe.class);

        startActivity(irActivity);
    }

    public void salirApp(View vista) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Salir")
                .setMessage("¿Estás seguro de que quieres salir?")
                .setPositiveButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setNegativeButton("Salir", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();

                    }


                });
        AlertDialog dialog = builder.create();
        dialog.show();

    }
}