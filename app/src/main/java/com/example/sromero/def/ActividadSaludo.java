package com.example.sromero.def;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActividadSaludo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_saludo);

        Bundle datos = this.getIntent().getExtras();
        TextView texto = (TextView) findViewById(R.id.textView7);
        texto.setText("Hola :" + datos.getString("Nombre"));


    }
}
