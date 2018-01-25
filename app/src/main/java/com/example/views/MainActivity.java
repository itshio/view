package com.example.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tvEtiqueta, resultado;

    T





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //identificar la vista
        tvEtiqueta = (TextView)findViewById(R.id.tvetiqueta);
        resultado = (TextView)findViewById(R.id.resultado);


        //editar el texto de un TextView

        tvEtiqueta.setText("nino");

        //obtener valor de un TextView

        String contenidoetiqueta = tvEtiqueta.getText().toString()

                resultado.setText(contenidoetiqueta);










    }//fin oncreate





}//fin mainactivity
