package com.example.tarea;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {


    private EditText Num1 ;
    private EditText Num2;

    private TextView result;
    private Button volviste;

    private TextView Calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Num1 = (EditText) findViewById(R.id.NumA);
        Num2 = (EditText) findViewById(R.id.NumB);
        Calc = (TextView) findViewById(R.id.Calculadora);
        result = (TextView) findViewById(R.id.resultado);
        volviste = (Button) findViewById(R.id.volvi);

        volviste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentos2 = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intentos2);
            }
        });


    }

    public void Sumo(View v){
        Double Resultado1 = Double.parseDouble(Num1.getText().toString()) + Double.parseDouble(Num2.getText().toString());
        result.setText(Resultado1+"");
    }
    public void resto(View v){
        Double Resultado2 = Double.parseDouble(Num1.getText().toString()) - Double.parseDouble(Num2.getText().toString());
        result.setText(Resultado2+"");
    }
    public void multiplo (View v){
        Double Resultado3 = Double.parseDouble(Num1.getText().toString()) * Double.parseDouble(Num2.getText().toString());
        result.setText(Resultado3+"");
    }
    public void divido(View v){
        Double Resultado4 = Double.parseDouble(Num1.getText().toString()) / Double.parseDouble(Num2.getText().toString());
        result.setText(Resultado4+"");
    }

}