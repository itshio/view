package com.example.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tvEtiqueta, resultado;
    ImageView ivimagen;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //identificar la vista
        tvEtiqueta = (TextView)findViewById(R.id.tvetiqueta);
        resultado = (TextView)findViewById(R.id.resultado);


        /*
        ivimagen = (ImageView)findViewById((R.id.maivplus));

        //evento click imagen
        ivimagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText("Has pulsado el boton");}
            }
        });

        */


        //editar el texto de un TextView

        tvEtiqueta.setText("Hola mundo");

        //obtener valor de un TextView

        String contenidoetiqueta = tvEtiqueta.getText().toString();

                resultado.setText(contenidoetiqueta);



        //ImageView












    } //fin oncreate


    //para usar una imagen como boton


    public void escribirTextView(View view){resultado.setText("Has pulsado el boton");

    }



}//fin mainactivity
