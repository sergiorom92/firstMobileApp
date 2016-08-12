package com.example.sromero.def;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pantallita3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallita3);

        Button botoncitoAnterior = (Button) findViewById(R.id.button5);
        botoncitoAnterior.setOnClickListener(new View.OnClickListener() {
                                                 @Override
                                                 public void onClick(View view){
                                                     Intent intento = new Intent(Pantallita3.this, Pantalla2.class);
                                                     startActivity(intento);
                                                 }
                                             }

        );


        Button botoncitoSiguiente = (Button) findViewById(R.id.button6);
        botoncitoSiguiente.setOnClickListener(new View.OnClickListener() {
                                                 @Override
                                                 public void onClick(View view){
                                                     Intent intento = new Intent(Pantallita3.this, MainActivity.class);
                                                     startActivity(intento);
                                                 }
                                             }

        );

    }
}
