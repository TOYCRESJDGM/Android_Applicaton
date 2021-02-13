package com.example.kilocalorias_application;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private EditText peso, estatura, edad;
    private TextView resultado;
    private RadioButton rbHombre,rbMujer;
    private Spinner Spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peso = (EditText) findViewById(R.id.et_peso);
        estatura = (EditText) findViewById(R.id.et_estatura);
        edad = (EditText) findViewById(R.id.et_edad);
        resultado = (TextView) findViewById(R.id.tv_resultado);
        rbHombre = (RadioButton) findViewById(R.id.rB_Hombre);
        rbMujer = (RadioButton) findViewById(R.id.rB_Mujer);
        Spinner1 = (Spinner) findViewById(R.id.spinner);

        String [] opciones ={ "Sedentario", "Ligera", "Moderada", "Intensa", "Muy intensa", "Accion Dinamica"};
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,opciones);
        Spinner1.setAdapter(adapter);

    }

    public void calcular(View view){
        String valor1 = peso.getText().toString();
        String valor2 = estatura.getText().toString();
        String valor3 = edad.getText().toString();
        double peso = Double.parseDouble(valor1);
        double estatura = Double.parseDouble(valor2);
        int edad = Integer.parseInt(valor3);
        if(rbHombre.isChecked() == true){
            String selec = Spinner1.getSelectedItem().toString();
            if(selec.equals("Sedentario")){
                double GET = 66.5+(13.7*peso)+(5*estatura)-(6.8*edad);
                    double GET1 = (GET*0.20)+ GET;
                    String Resultado = String.valueOf(GET1);
                    resultado.setText(Resultado);
            }
            if(selec.equals("Ligera")){
                double GET = 66.5+(13.7*peso)+(5*estatura)-(6.8*edad);
                double GET1 = (GET*0.30)+ GET;
                String Resultado = String.valueOf(GET1);
                resultado.setText(Resultado);
            }
            if(selec.equals("Moderada")){
                double GET = 66.5+(13.7*peso)+(5*estatura)-(6.8*edad);
                double GET1 = (GET*0.40)+ GET;
                String Resultado = String.valueOf(GET1);
                resultado.setText(Resultado);
            }
            if(selec.equals("Intensa")){
                double GET = 66.5+(13.7*peso)+(5*estatura)-(6.8*edad);
                double GET1 = (GET*0.50)+ GET;
                String Resultado = String.valueOf(GET1);
                resultado.setText(Resultado);
            }
            if(selec.equals("Muy intensa")){
                double GET = 66.5+(13.7*peso)+(5*estatura)-(6.8*edad);
                double GET1 = (GET*0.70)+ GET;
                String Resultado = String.valueOf(GET1);
                resultado.setText(Resultado);
            }
            if(selec.equals("Accion Dinamica")){
                double GET = 66.5+(13.7*peso)+(5*estatura)-(6.8*edad);
                double GET1 = (GET*0.10)+ GET;
                String Resultado = String.valueOf(GET1);
                resultado.setText(Resultado);
            }


        }else if(rbMujer.isChecked() == true){
            String selec = Spinner1.getSelectedItem().toString();
            if(selec.equals("Sedentario")){
                double GET = 65.5+(13.7*peso)+(5*estatura)-(6.8*edad);
                double GET1 = (GET*0.20)+ GET;
                String Resultado = String.valueOf(GET1);
                resultado.setText(Resultado);
            }
            if(selec.equals("Ligera")){
                double GET = 65.5+(13.7*peso)+(5*estatura)-(6.8*edad);
                double GET1 = (GET*0.30)+ GET;
                String Resultado = String.valueOf(GET1);
                resultado.setText(Resultado);
            }
            if(selec.equals("Moderada")){
                double GET = 65.5+(13.7*peso)+(5*estatura)-(6.8*edad);
                double GET1 = (GET*0.40)+ GET;
                String Resultado = String.valueOf(GET1);
                resultado.setText(Resultado);
            }
            if(selec.equals("Intensa")){
                double GET = 65.5+(13.7*peso)+(5*estatura)-(6.8*edad);
                double GET1 = (GET*0.50)+ GET;
                String Resultado = String.valueOf(GET1);
                resultado.setText(Resultado);
            }
            if(selec.equals("Muy intensa")){
                double GET = 65.5+(13.7*peso)+(5*estatura)-(6.8*edad);
                double GET1 = (GET*0.70)+ GET;
                String Resultado = String.valueOf(GET1);
                resultado.setText(Resultado);
            }
            if(selec.equals("Accion Dinamica")){
                double GET = 65.5+(13.7*peso)+(5*estatura)-(6.8*edad);
                double GET1 = (GET*0.10)+ GET;
                String Resultado = String.valueOf(GET1);
                resultado.setText(Resultado);
            }

        }

        }

        public void salir(View view){
            finish();
        }
    }
