package com.example.francisco.webservices_alumnos;

/**
 * Created by francisco on 11/04/18.
 */

public class Alumno {

    private String nombre;
    private String direccion;
    private int id;


    public Alumno(String nombre, String direccion, int id) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.id = id;
    }

    public Alumno (){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
