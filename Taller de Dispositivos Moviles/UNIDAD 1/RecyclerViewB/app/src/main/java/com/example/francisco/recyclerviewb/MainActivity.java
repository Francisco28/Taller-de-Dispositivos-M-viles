package com.example.francisco.recyclerviewb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<PersonajeVo> listaPersonajes;
    RecyclerView recyclerPersonajes;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listaPersonajes = new  ArrayList<>();
        recyclerPersonajes = (RecyclerView) findViewById(R.id.RecyclerId);
        recyclerPersonajes.setLayoutManager(new LinearLayoutManager(this));

        llenarPersonajes();

        AdaptadorPersonajes adapter = new AdaptadorPersonajes(listaPersonajes);
        recyclerPersonajes.setAdapter(adapter);

    }

    private void llenarPersonajes() {

        listaPersonajes.add(new PersonajeVo("Francisco Javier Gallegos Godinez","13400409","Ing. en Sistemas Computacionales",R.drawable.fco1));
        listaPersonajes.add(new PersonajeVo("Jose Pablo Valenzuela Miramontes","13400392","Ing. en Sistemas Computacionales",R.drawable.pablo1));
        listaPersonajes.add(new PersonajeVo("Edgar Ulises Camberos Arreola","13400393","Ing. Bioquímica",R.drawable.edgar1));
        listaPersonajes.add(new PersonajeVo("Luis Ricardo Caro López","13400412","Ing. Tecnologías de la Información y Comunicación",R.drawable.ricardo1));
        listaPersonajes.add(new PersonajeVo("Alexia Ariana Abrego Delgado","13400370","Ing. Industrial",R.drawable.ale1));
        listaPersonajes.add(new PersonajeVo("Edgar Fabrizio Gonzalez Castellanos","13400415","Ing. Química",R.drawable.fabri1));
        listaPersonajes.add(new PersonajeVo("Oscar Daniel Fonseca Flores","13400402","Ing. Eléctrica",R.drawable.oscar1));
        listaPersonajes.add(new PersonajeVo("Erika Lizbeth Martínez Bañuelos","13400380","Ing. Mecatrónica",R.drawable.liz1));


    }

}
