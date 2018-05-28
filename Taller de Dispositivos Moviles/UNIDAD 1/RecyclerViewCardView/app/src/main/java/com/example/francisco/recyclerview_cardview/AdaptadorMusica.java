package com.example.francisco.recyclerview_cardview;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by francisco on 25/02/18.
 */

public class AdaptadorMusica extends RecyclerView.Adapter<AdaptadorMusica.ViewHolderMusica> {

    ArrayList<PerfilMusica> listaMusica;

    public AdaptadorMusica(ArrayList<PerfilMusica> listaMusica) {
        this.listaMusica = listaMusica;
    }

    @Override
    public ViewHolderMusica onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_musica1,null,false);
        return new ViewHolderMusica(view);

    }




    @Override
    public void onBindViewHolder(ViewHolderMusica holder, int position) {

        holder.EtGenero.setText(listaMusica.get(position).getGenero());
        holder.EtTipo.setText(listaMusica.get(position).getTipo());
        holder.foto.setImageResource(listaMusica.get(position).getFoto());
       // holder.layout.setBackgroundColor(listaMusica.get(position).getColor());


    }

    @Override
    public int getItemCount() {
        return listaMusica.size();
    }

    public class ViewHolderMusica extends RecyclerView.ViewHolder {

        TextView EtGenero, EtTipo;
        ImageView foto;
       // CardView layout;


        public ViewHolderMusica(View itemView) {
            super(itemView);
            EtGenero = (TextView) itemView.findViewById(R.id.idGenero);
            EtTipo = (TextView) itemView.findViewById(R.id.idTipo);
            foto = (ImageView) itemView.findViewById(R.id.idImagen);
           // layout = (CardView) itemView.findViewById(R.id.idLayout);

        }
    }
}
