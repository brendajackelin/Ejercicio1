package com.example.ejercicio_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Inicio extends AppCompatActivity {

    EditText txtNum1;
    EditText txtNum2;
    Button btnSuma, btnResta, btnMulti, btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = (EditText) findViewById(R.id.txtNum1);
        txtNum2 = (EditText) findViewById(R.id.txtNum2);
        btnSuma = (Button) findViewById(R.id.btnSuma);
        btnResta = (Button) findViewById(R.id.btnResta);
        btnMulti = (Button) findViewById(R.id.btnMulti);
        btnDiv = (Button) findViewById(R.id.btnDiv);

        //-- S U M A --
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1 = Float.parseFloat(txtNum1.getText().toString());
                float n2 = Float.parseFloat(txtNum2.getText().toString());

                float suma = n1+n2;

                Intent intent = new Intent(getApplicationContext(),Resultado.class);
                intent.putExtra("res",suma);
                startActivity(intent);
            }
        });

        //-- R E S T A --
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1 = Float.parseFloat(txtNum1.getText().toString());
                float n2 = Float.parseFloat(txtNum2.getText().toString());

                float resta = n1-n2;

                Intent intent = new Intent(getApplicationContext(),Resultado.class);
                intent.putExtra("res",resta);
                startActivity(intent);
            }
        });

        //-- M U L T I P L I C A C I O N --
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1 = Float.parseFloat(txtNum1.getText().toString());
                float n2 = Float.parseFloat(txtNum2.getText().toString());

                float multi = n1*n2;

                Intent intent = new Intent(getApplicationContext(),Resultado.class);
                intent.putExtra("res",multi);
                startActivity(intent);
            }
        });

        //-- D I V I S I O N --
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1 = Float.parseFloat(txtNum1.getText().toString());
                float n2 = Float.parseFloat(txtNum2.getText().toString());

                float div = n1/n2;

                Intent intent = new Intent(getApplicationContext(),Resultado.class);
                intent.putExtra("res",div);
                startActivity(intent);
            }
        });
    }
}