package com.example.sromero.def;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button miBotoncitoAntes = (Button) findViewById(R.id.button);

        //Evento Click del botón
        miBotoncitoAntes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent3 =  new Intent(MainActivity.this, Pantallita3.class);
                //Iniciamos la nueva actividad
                startActivity(intent3);
            }
        });

        Button miBotoncitoDespues = (Button) findViewById(R.id.button2);

        //Evento Click del botón
        miBotoncitoDespues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent3 =  new Intent(MainActivity.this, Pantalla2.class);
                //Iniciamos la nueva actividad
                startActivity(intent3);
            }
        });


        Button botonGo = (Button) findViewById(R.id.button7);
        botonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v) {
                EditText texto = (EditText) findViewById(R.id.editText);
                Bundle bundleData = new Bundle();
                bundleData.putString("Nombre", texto.getText().toString());
                Intent intent = new Intent(MainActivity.this, ActividadSaludo.class);
                intent.putExtras(bundleData);

                startActivity(intent);

            }

        });


    }


}
