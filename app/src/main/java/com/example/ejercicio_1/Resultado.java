package com.example.ejercicio_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        recibirDatos();
    }

    public void recibirDatos(){
        Bundle extras = getIntent().getExtras();
        float r = extras.getFloat("res");

        Resultado = (TextView) findViewById(R.id.txtResultado);
        Resultado.setText(""+r);
    }
}