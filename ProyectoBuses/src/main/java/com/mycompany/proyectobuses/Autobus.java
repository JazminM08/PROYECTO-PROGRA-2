package com.mycompany.proyectobuses;

import java.util.ArrayList;

public class Autobus {
    
    private String Nombre;
    private String Ruta;
    private int MaximoPasajeros;
    private int NumeroPasajeros;
    private ArrayList<Pasajero>Pasajeros;

    public Autobus() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }

    public int getMaximoPasajeros() {
        return MaximoPasajeros;
    }

    public void setMaximoPasajeros(int MaximoPasajeros) {
        this.MaximoPasajeros = MaximoPasajeros;
    }

    public int getNumeroPasajeros() {
        return NumeroPasajeros;
    }

    public void setNumeroPasajeros(int NumeroPasajeros) {
        this.NumeroPasajeros = NumeroPasajeros;
    }
 
    public void subirPasajero(Pasajero miPasajero)
    {
        this.Pasajeros.add(miPasajero);
    }
    
    public void bajarPasajero(Pasajero miPasajero){
        this.Pasajeros.remove(miPasajero);
    }
    
    public int obtenerDisponibilidad(){
        int asientosLibres = this.getMaximoPasajeros() - Pasajeros.size();
        System.out.println("Cantidad de asientos disponibles es de: " + asientosLibres);
        System.out.println("Cantidad de asientos ocupados es de: " + Pasajeros.size());
        
        return asientosLibres;
    }
}
