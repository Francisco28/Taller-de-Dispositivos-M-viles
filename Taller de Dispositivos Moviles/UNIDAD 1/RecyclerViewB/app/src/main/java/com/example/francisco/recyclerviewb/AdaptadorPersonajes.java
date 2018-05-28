package com.example.francisco.recyclerviewb;

import android.speech.tts.TextToSpeech;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by francisco on 24/02/18.
 */

public class AdaptadorPersonajes extends RecyclerView.Adapter<AdaptadorPersonajes.ViewHolderPersonajes> {

    ArrayList<PersonajeVo> listaPersonajes;

    public AdaptadorPersonajes(ArrayList<PersonajeVo> listaPersonajes) {
        this.listaPersonajes = listaPersonajes;
    }

    @Override
    public ViewHolderPersonajes onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_personajes,null,false);
        return new ViewHolderPersonajes(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderPersonajes holder, int position) {

        holder.EtNombre.setText(listaPersonajes.get(position).getNombre());
        holder.EtNoControl.setText(listaPersonajes.get(position).getNocontrol());
        holder.EtCarrera.setText(listaPersonajes.get(position).getCarrera());
        holder.foto.setImageResource(listaPersonajes.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return listaPersonajes.size();
    }

    public class ViewHolderPersonajes extends RecyclerView.ViewHolder {

        TextView EtNombre, EtNoControl, EtCarrera;
        ImageView foto;

        public ViewHolderPersonajes(View itemView) {
            super(itemView);
            EtNombre = (TextView) itemView.findViewById(R.id.idNombre);
            EtNoControl = (TextView) itemView.findViewById(R.id.idNoControl);
            EtCarrera = (TextView) itemView.findViewById(R.id.idCarrera);
            foto = (ImageView) itemView.findViewById(R.id.idImagen);
        }
    }
}
