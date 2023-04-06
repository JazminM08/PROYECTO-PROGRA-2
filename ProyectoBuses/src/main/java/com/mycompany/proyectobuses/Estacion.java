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
        System.out.println(this.Terminales.size());
        return "";
    }
    
    public void cargarEstaciones(String Archivo) throws FileNotFoundException {
        File file = new File(Archivo);
        StringBuilder fileContents = new StringBuilder((int) file.length());
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
            Terminales.add(miterminal);
            System.out.println(this.Terminales.size());
            
            
        }

    }   
}                    

    

