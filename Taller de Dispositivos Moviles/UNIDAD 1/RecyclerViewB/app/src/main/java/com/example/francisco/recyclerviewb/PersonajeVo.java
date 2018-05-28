package com.example.francisco.recyclerviewb;

/**
 * Created by francisco on 24/02/18.
 */

public class PersonajeVo {


    private String nombre;
    private String nocontrol;
    private String carrera;
    private int foto;


    public PersonajeVo(){

    }

    public PersonajeVo(String nombre, String nocontrol, String carrera, int foto) {

        this.nombre = nombre;
        this.nocontrol = nocontrol;
        this.carrera = carrera;
        this.foto = foto;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNocontrol() {
        return nocontrol;
    }

    public void setNocontrol(String nocontrol) {
        this.nocontrol = nocontrol;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
