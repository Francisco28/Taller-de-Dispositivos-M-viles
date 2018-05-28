package com.example.francisco.recyclerview_cardview;

/**
 * Created by francisco on 25/02/18.
 */

public class PerfilMusica {

    private String genero;
    private String tipo;
    private int foto;
    private int color;

    public PerfilMusica(){

    }

    public PerfilMusica(String genero, String tipo, int foto) {
        this.genero = genero;
        this.tipo = tipo;
        this.foto = foto;

    }

    

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
