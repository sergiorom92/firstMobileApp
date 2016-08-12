package com.example.sromero.def;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pantalla2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        Button miBotoncitoAntes = (Button) findViewById(R.id.button3);

        //Evento Click del botón
        miBotoncitoAntes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent2 =  new Intent(Pantalla2.this, MainActivity.class);
                //Iniciamos la nueva actividad
                startActivity(intent2);
            }
        });

        Button miBotoncitoDespues = (Button) findViewById(R.id.button4);

        //Evento Click del botón
        miBotoncitoDespues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent3 =  new Intent(Pantalla2.this, Pantallita3.class);
                //Iniciamos la nueva actividad
                startActivity(intent3);
            }
        });

    }
}
