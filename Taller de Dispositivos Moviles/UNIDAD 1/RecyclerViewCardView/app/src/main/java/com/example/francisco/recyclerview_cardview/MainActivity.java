package com.example.francisco.recyclerview_cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<PerfilMusica> listaMusica;
    //ArrayList<PerfilMusica> listaMusica2;
    RecyclerView recyclerMusica;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaMusica = new ArrayList<>();
        //listaMusica2 = new ArrayList<>();
        recyclerMusica = (RecyclerView) findViewById(R.id.RecyclerId);
        recyclerMusica.setLayoutManager(new LinearLayoutManager(this));

        llenarMusica();

        AdaptadorMusica adapter = new AdaptadorMusica(listaMusica);
        recyclerMusica.setAdapter(adapter);

        //AdaptadorMusica2 adapter2 = new AdaptadorMusica2(listaMusica2);
        //recyclerMusica.setAdapter(adapter2);

    }

    private void llenarMusica() {

        listaMusica.add(new PerfilMusica("Folclórica","Sones de la Huasteca",R.drawable.folclorica1));
        listaMusica.add(new PerfilMusica("Rock Alter","Urbano Argentino",R.drawable.rock1));
        listaMusica.add(new PerfilMusica("Acústicos","Conciertos de Trova",R.drawable.acusticos1));
        listaMusica.add(new PerfilMusica("Ejercicios","Para entrenar bien",R.drawable.pesa1));
        listaMusica.add(new PerfilMusica("Relajación","Descanso Infinito",R.drawable.relajacion1));



    }


}
