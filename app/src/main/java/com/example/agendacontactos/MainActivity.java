package com.example.agendacontactos;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Serializable{


Contactos contacto;
ArrayList<Contactos> conta;
private ListView listview;
private ArrayList<String> names;
private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

conta = new ArrayList<>();
tv=(TextView) findViewById(R.id.tevi);


    }


    public void  rellenar (){
        listview = (ListView) findViewById(R.id.LV);
        names = new ArrayList<String>();
        int lista = conta.size();
        for (int i =0; i< lista ;i++){
            names.add(conta.get(i).getUsuario() + "\n" +conta.get(i).getTwitter());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        listview.setAdapter(adapter);
    }


    public void siguiente(View view){
        Intent intent = new Intent(this, Agregar.class);
        startActivityForResult(intent,0);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode,resultCode,data);


          contacto = (Contactos) data.getSerializableExtra("proyecto");
          conta.add(contacto);
          rellenar();

        tv.setText("Hi" + conta.size());
    }
}
