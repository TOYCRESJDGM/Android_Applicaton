package com.example.imc_application;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    private EditText peso, estatura;
    private TextView imc, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        peso = (EditText)findViewById(R.id.et_Peso);
        estatura = (EditText)findViewById(R.id.et_Estatura);
        imc  = (TextView)findViewById(R.id.tv_imc);
        resultado = (TextView)findViewById(R.id.tv_result);
    }

    public void calcular(View view){
        String valor1 = peso.getText().toString();
        String valor2 = estatura.getText().toString();
        double peso1 = Double.parseDouble(valor1);
        double estatura1 = Double.parseDouble(valor2)/100;
        double operacion = peso1/(estatura1*estatura1);
        String calculo = String.valueOf(operacion);
        imc.setText(calculo);
        if(operacion <= 18.5){
            resultado.setText("Desnutrición");
        }
        if((operacion >= 18.5) && (operacion < 25)){
            resultado.setText("Bajo Peso");
        }
        if ((operacion >= 25) && (operacion < 30)) {
            resultado.setText("Peso normal");
        }
        if(operacion>=30 && operacion< 40){
            resultado.setText("Sobre Peso");
        }
        if(operacion>=40){
            resultado.setText("Obesidad");
        }
        }
    }
