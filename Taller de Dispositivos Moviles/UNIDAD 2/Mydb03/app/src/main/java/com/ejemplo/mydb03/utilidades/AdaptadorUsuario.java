package com.ejemplo.mydb03.utilidades;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by francisco on 5/03/18.
 */

public class AdaptadorUsuario extends RecyclerView.Adapter<AdaptadorUsuario.ViewHolderUsuario> {
    @Override
    public AdaptadorUsuario.ViewHolderUsuario onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(AdaptadorUsuario.ViewHolderUsuario holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolderUsuario extends RecyclerView.ViewHolder {
        public ViewHolderUsuario(View itemView) {
            super(itemView);
        }
    }
}
