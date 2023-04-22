package com.mycompany.proyectobuses;

import java.util.ArrayList;

public class Terminal {
    private String Nombre;
    private String Ubicacion;
    private int MaximoAutobuses;
    private int NumeroAutobuses;
    private ArrayList<Autobus>Bus;

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
    
    public void agregarAutobus(Autobus bus){
        this.Bus.add(bus);
    }
    
    public void actualizarAutobus(int index, String nombre, String ruta, int maximoPasajeros, int numeroPasajeros)
    {
        Autobus updateAutobus = new Autobus();
        updateAutobus.setNombre(nombre);
        updateAutobus.setRuta(ruta);
        updateAutobus.setMaximoPasajeros(maximoPasajeros);
        updateAutobus.setNumeroPasajeros(numeroPasajeros);
        
        this.Bus.set(index, updateAutobus);        
    }
    
    public void listarBuses(){ 
        for (int i = 0; i < this.Bus.size(); i++)
        {
            String nombre = "";
            nombre = this.Bus.get(i).getNombre();
            System.out.println("Bus: " + nombre);
        }
    }

    public ArrayList<Autobus> obtenerBuses(){
        return this.Bus;
    }    
}
