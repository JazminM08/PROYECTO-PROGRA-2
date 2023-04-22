package com.mycompany.proyectobuses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Estacion {
    private ArrayList<Terminal>Terminales;

    public Estacion() {
        this.Terminales = new ArrayList<Terminal>();
    }
    
    public String ListadodeEstaciones(){
        String nombre = "";
        System.out.println("Cantidad de terminales: " + this.Terminales.size());
        for(int i = 0; i < Terminales.size(); i++)
        {
            nombre = this.Terminales.get(i).getNombre();
            System.out.println("Terminal: " + nombre);
        }
        return nombre;
    }
    
    public void agregarTerminal(Terminal terminal){
        this.Terminales.add(terminal);
    }
    
    public void actualizarTerminal(int index, String nombre, String Ubicacion, int maximoAutobuses, int numeroAutobuses){
        Terminal updateTerminal = new Terminal();        
        updateTerminal.setNombre(nombre);
        updateTerminal.setUbicacion(Ubicacion);
        updateTerminal.setMaximoAutobuses(maximoAutobuses);
        updateTerminal.setNumeroAutobuses(numeroAutobuses);
        
        this.Terminales.set(index, updateTerminal);
    } 
    
    public Terminal buscarTerminal (String nombre)
    {
        int index = 0;
        for (int i = 0; i < this.Terminales.size(); i++) 
        {
            if (this.Terminales.get(i).getNombre() == nombre)
            {
               index = i; 
               break;
            }
        }
        return this.Terminales.get(index);
    }
    
    public void borrarTerminal(int index){
        this.Terminales.remove(index);
    }
    
    public Terminal obtenerTerminal(int index){
        return this.Terminales.get(index);
    }
    
    public int totalTerminales(){
        return this.Terminales.size();
    }
    
    public void cargarEstaciones(String Archivo) throws FileNotFoundException {
        File file = new File(Archivo);
        Scanner scanner = new Scanner(file);
        String Terminal;
        ArrayList<String> terminal = new ArrayList<String>();
        while (scanner.hasNextLine()) {
            Terminal = scanner.nextLine().toString();
            int Index = 1;
            int InicioIndex = 0;
            int FinalIndex = 0;
            while (Index <= 4) { //para separar los valores con coma y recorre 4 veces la linea
                if (Terminal.substring(InicioIndex).contains(",")) {
                    FinalIndex = FinalIndex + Terminal.substring(InicioIndex).indexOf(",") + 1;
                    //System.out.println(Terminal.substring(InicioIndex, FinalIndex - 1));
                    terminal.add(Terminal.substring(InicioIndex, FinalIndex - 1));
                } else {
                    terminal.add(Terminal.substring(InicioIndex));
                }
                InicioIndex = FinalIndex;
                Index = Index + 1;
            }
            //System.out.println(terminal.get(0);
            Terminal miterminal = new Terminal();
            miterminal.setNombre(terminal.get(0));
            miterminal.setUbicacion(terminal.get(1));
            miterminal.setMaximoAutobuses(Integer.parseInt(terminal.get(2)));
            miterminal.setNumeroAutobuses(Integer.parseInt(terminal.get(3)));
            terminal = new ArrayList<String>();
            this.agregarTerminal(miterminal);
            //Terminales.add(miterminal);           
        }
    }   
}                    

    

