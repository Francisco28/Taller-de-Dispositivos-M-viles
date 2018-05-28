package com.example.francisco.recyclerview_cardview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by francisco on 25/02/18.
 */

public class AdaptadorMusica2 extends RecyclerView.Adapter<AdaptadorMusica2.ViewHolderMusica2> {

    ArrayList<PerfilMusica> listaMusica2;

    public AdaptadorMusica2(ArrayList<PerfilMusica> listaMusica2) {
        this.listaMusica2 = listaMusica2;
    }

    @Override
    public AdaptadorMusica2.ViewHolderMusica2 onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_musica2,null,false);
        return new AdaptadorMusica2.ViewHolderMusica2(view);
    }

    @Override
    public void onBindViewHolder(AdaptadorMusica2.ViewHolderMusica2 holder, int position) {

        holder.EtGenero.setText(listaMusica2.get(position).getGenero());
        holder.EtTipo.setText(listaMusica2.get(position).getTipo());
        holder.foto.setImageResource(listaMusica2.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return  listaMusica2.size();
    }

    public class ViewHolderMusica2 extends RecyclerView.ViewHolder {

        TextView EtGenero, EtTipo;
        ImageView foto;

        public ViewHolderMusica2(View itemView) {
            super(itemView);

            EtGenero = (TextView) itemView.findViewById(R.id.idGenero);
            EtTipo = (TextView) itemView.findViewById(R.id.idTipo);
            foto = (ImageView) itemView.findViewById(R.id.idImagen);
        }
    }
}
