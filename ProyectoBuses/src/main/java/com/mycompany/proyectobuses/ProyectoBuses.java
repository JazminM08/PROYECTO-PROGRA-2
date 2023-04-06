

package com.mycompany.proyectobuses;
import java.io.FileNotFoundException;
import java.util.Scanner;
        
public class ProyectoBuses {
    
    public static void Estaciones() throws FileNotFoundException{
        
        Scanner miscanner = new Scanner(System.in);
        String opcion = "";
        
        while (opcion != "0") {

            System.out.println("____________________________");
            System.out.println("ESTACIONES");
            System.out.println("1. Cargar Estaciones");
            System.out.println("2. Modificar Estación");
            System.out.println("3. Borrar Estación");
            System.out.println("4. Listado de Estaciones");
            System.out.println("0. Regresar");
            
            Estacion miestacion = new Estacion();
            switch (opcion) {
                case "1":
                    System.out.println("Cargar Estaciones");
                    
                    String File = "C:\\Users\\jmong\\Documents\\NetBeansProjects\\ProyectoBuses\\Estaciones.txt";
                    miestacion.cargarEstaciones(File);

                    break;
                case "2":
                    System.out.println("Modificar Estación");
                    break;
                case "3":
                    System.out.println("Borrar Estación");
                    break;
                case "4":
                    System.out.println("Listado de Estaciones");
                    String Nombre;
                    Nombre = miestacion.ListadodeEstaciones();
                    break;
                case "0":
                    System.out.println("Regresar");
                    break;
            }

            opcion = miscanner.nextLine();

        }
    }

    public static void Autobuses() {
        System.out.println("____________________________");
        System.out.println("AUTOBUSES");
        System.out.println("1. Crear Autobuses");
        System.out.println("2. Modificar");
        System.out.println("3. Borrar");
        System.out.println("4. Listado de Autobuses");
        System.out.println("0. Regresar");
    }

    public static void Pasajeros() {
        System.out.println("____________________________");
        System.out.println("PASAJEROS");
        System.out.println("1. Subir Pasajero");
        System.out.println("2. Bajar pasajero");
        System.out.println("3. Disponibilidad");
        System.out.println("0. Regresar");
    }

    public static void Estadistica() {
        System.out.println("____________________________");
        System.out.println("ESTADISTICA");
        System.out.println("1. Cantidad de autobuses x estación");
        System.out.println("2. El autobús con mayor cantidad de Asientos Libres");
        System.out.println("3. Promedio de Edad de los Pasajeros x autobús");
        System.out.println("0. Regresar");
    }

    public static void MenúPrincipal(){
        System.out.println("____________________________");
        System.out.println("Bienvenido al sistema de Buses");
        System.out.println("MENÚ PRINCIPAL");
        System.out.println("1. Estaciones");
        System.out.println("2. Autobuses");
        System.out.println("3. Pasajeros");
        System.out.println("4. Estadísticas");
        System.out.println("0. Salir");
    }
   
    public static void main(String[] args) throws FileNotFoundException {
        Scanner miscanner = new Scanner(System.in); //CREANDO EL OBJETO DE SCANNER PARA PODER LEER DESDE LA PANTALLA
        String opcion = ""; //= miscanner.nextLine();//LEYENDO EN PANTALLA Y GUARDANDOLO EN LA VARIABLE "OPCION"
        
        while(opcion != "0"){ 
        MenúPrincipal(); //LLAMANDO AL MENÚ
    
        switch(opcion){
            case "1":
                Estaciones();
            break;
            case "2":
                Autobuses();
            break;
            case "3":
                Pasajeros();
            break;
            case "4":
                Estadistica();
            break;  
            case "0":
                System.exit(0);
            break;
        }
        
        opcion = miscanner.nextLine();
        
        }
    }
}
