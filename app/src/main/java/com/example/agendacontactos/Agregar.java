package com.example.agendacontactos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Agregar extends AppCompatActivity  {
Contactos contactos;
private EditText textU, textE, textT,textN,textF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);

        textU = (EditText)findViewById(R.id.eTUsuario);
        textE= (EditText)findViewById(R.id.eTUsuario);
        textT = (EditText)findViewById(R.id.eTUsuario);
        textN = (EditText)findViewById(R.id.eTUsuario);
        textF = (EditText)findViewById(R.id.eTUsuario);
    }

    public void Agregar(View view){
        String datoU = textU.getText().toString();
        String datoE = textU.getText().toString();
        String datoT = textU.getText().toString();
        String datoN = textU.getText().toString();
        String datoF = textU.getText().toString();
contactos =  new Contactos(datoU,datoE,datoT,datoN,datoF);


        Intent intent = new Intent(this, MainActivity.class);

        intent.putExtra("proyecto" ,contactos );
        setResult(MainActivity.RESULT_OK, intent);
        finish();

    }


}
