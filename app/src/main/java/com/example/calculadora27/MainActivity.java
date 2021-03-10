package com.example.calculadora27;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    EditText main_numero1,main_numero2;
    TextView main_resultado;
    Button main_btnsuma,main_btnresta, main_btndivision,main_btnmultiplicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_numero1= findViewById(R.id.main_numero1);
        main_numero2= findViewById(R.id.main_numero2);
        main_resultado= findViewById(R.id.main_respuesta);
        main_btnsuma= findViewById(R.id.main_btnsuma);
        main_btnresta=findViewById(R.id.main_btnresta);
        main_btndivision=findViewById(R.id.main_btndivision);
        main_btnmultiplicacion=findViewById(R.id.main_btnmultiplicar);
    }
    public void sumar(View v) {
        int valor1= Integer.parseInt(main_numero1.getText().toString());
        int valor2= Integer.parseInt(main_numero2.getText().toString());
        int r= valor1+valor2;
        main_resultado.setText("La suma es: "+r);
    }
    public void restar(View v){
        int valor1= Integer.parseInt(main_numero1.getText().toString());
        int valor2= Integer.parseInt(main_numero2.getText().toString());
        int r= valor1-valor2;
        main_resultado.setText("La resta es: "+r);
    }
    public void multiplicar(View v){
        int valor1= Integer.parseInt(main_numero1.getText().toString());
        int valor2= Integer.parseInt(main_numero2.getText().toString());
        int r= valor1*valor2;
        main_resultado.setText("La multiplicación es: "+r);
    }
    public void division(View v){
        double valor1= Double.parseDouble(main_numero1.getText().toString());
        double valor2= Double.parseDouble(main_numero2.getText().toString());
        double r= valor1/valor2;
        main_resultado.setText("La división es: "+r);
    }

}

