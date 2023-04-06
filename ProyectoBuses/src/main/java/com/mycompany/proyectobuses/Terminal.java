package com.mycompany.proyectobuses;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jmong
 */
public class Terminal {
    private String Nombre;
    private String Ubicacion;
    private int MaximoAutobuses;
    private int NumeroAutobuses;
    //private ArrayList<Autobuses>Buses;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public int getMaximoAutobuses() {
        return MaximoAutobuses;
    }

    public void setMaximoAutobuses(int MaximoAutobuses) {
        this.MaximoAutobuses = MaximoAutobuses;
    }

    public int getNumeroAutobuses() {
        return NumeroAutobuses;
    }

    public void setNumeroAutobuses(int NumeroAutobuses) {
        this.NumeroAutobuses = NumeroAutobuses;
    }
    
    
}
