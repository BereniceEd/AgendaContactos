package com.example.agendacontactos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Agregar extends AppCompatActivity  {

    //Obejoto
Contactos contactos;
//Variables para contener el texto del EditText
private EditText textU, textE, textT,textN,textF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);
// Pasamos los valores puestos  de los EditText a las variables
        textU = (EditText)findViewById(R.id.eTUsuario);
        textE= (EditText)findViewById(R.id.eT);
        textT = (EditText)findViewById(R.id.eTTwitter);
        textN = (EditText)findViewById(R.id.eTTel);
        textF = (EditText)findViewById(R.id.eTFecha);
    }

    //Metodo ara agregar un objeto nuevo con los parametros puestos
    public void Agregar(View view){
        String datoU = textU.getText().toString();
        String datoE = textE.getText().toString();
        String datoT = textT.getText().toString();
        String datoN = textN.getText().toString();
        String datoF = textF.getText().toString();
contactos =  new Contactos(datoU,datoE,datoT,datoN,datoF);


        Intent intent = new Intent(this, MainActivity.class);

        intent.putExtra("proyecto" ,contactos );
        setResult(MainActivity.RESULT_OK, intent);
        finish();

    }


}
