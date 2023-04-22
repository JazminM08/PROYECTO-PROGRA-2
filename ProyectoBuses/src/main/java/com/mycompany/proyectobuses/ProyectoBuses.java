

package com.mycompany.proyectobuses;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
        
public class ProyectoBuses {
    
    static Estacion miestacion = new Estacion();
    static Terminal miTerminal = new Terminal();
    static Autobus miAutobus = new Autobus(); 
    static Pasajero miPasajero;
     
    public static void Estaciones() throws FileNotFoundException{        
        Scanner miscanner = new Scanner(System.in);
        String opcion = "";    
        
        while (!"0".equals(opcion)) {

            System.out.println("____________________________");
            System.out.println("ESTACIONES");
            System.out.println("1. Cargar Estaciones");
            System.out.println("2. Modificar Estación");
            System.out.println("3. Borrar Estación");
            System.out.println("4. Listado de Estaciones");
            System.out.println("0. Regresar");
            
            switch (opcion) {
                case "1":
                    System.out.println("Cargar Estaciones");
                    String File = "C:\\Users\\USUARIO\\Documents\\code\\PROYECTO-PROGRA-2\\ProyectoBuses\\Estaciones.txt";
                    miestacion.cargarEstaciones(File);                    
                    break;
                case "2":
                    System.out.println("Modificar Estación");
                    System.out.println("Digite el numero de la estacion a actualizar!!!");
                    String indexTerminal = miscanner.nextLine();
                    System.out.println("Digite el nombre de la estacion a actualizar!!!");
                    String nombreTerminal = miscanner.nextLine();
                    System.out.println("Digite la ubicacion de la estacion a actualizar!!!");
                    String ubicacionTerminal = miscanner.nextLine();
                    System.out.println("Digite la cantidad maxima autobuses!!!");
                    int maximoAutobuses = Integer.valueOf(miscanner.nextLine());
                    System.out.println("Digite la cantidad de autobuses!!!");
                    int numeroAutobuses = Integer.valueOf(miscanner.nextLine());
                    miestacion.actualizarTerminal(Integer.valueOf(indexTerminal), nombreTerminal, ubicacionTerminal, maximoAutobuses, numeroAutobuses);
                    break;
                case "3":
                    System.out.println("Borrar Estación");
                    System.out.println("Digite el numero de estacion que deseas eliminar!!!");
                    int indexEstacion = Integer.valueOf(miscanner.nextLine());
                    miestacion.borrarTerminal(indexEstacion);
                    break;
                case "4":
                    System.out.println("Listado de Estaciones");
                    String Nombre;
                    Nombre = miestacion.ListadodeEstaciones();
                    System.out.print("El nombre es: " + Nombre);
                    break;
                case "0":
                    System.out.println("Regresar");
                    break;
            }
            opcion = miscanner.nextLine();
        }
    }

    public static void Autobuses() {
        
        Scanner miscanner = new Scanner(System.in);
        String opcion = "";
        
        System.out.println("____________________________");
        System.out.println("AUTOBUSES");
        System.out.println("1. Crear Autobuses");
        System.out.println("2. Modificar");
        System.out.println("3. Borrar");
        System.out.println("4. Listado de Autobuses");
        System.out.println("0. Regresar");
        
        while (!"0".equals(opcion)) {
            System.out.println("____________________________");
            System.out.println("ESTACIONES");
            System.out.println("1. Crear Autobuses");
            System.out.println("2. Modificar");
            System.out.println("3. Borrar");
            System.out.println("4. Listado de Autobuses");
            System.out.println("0. Regresar");
            
            switch (opcion) {
                case "1":
                    System.out.println("Crear un Autobus");
                    System.out.println("Nombre del Autobus");
                    String nombreAutobus = miscanner.nextLine();
                    System.out.println("Digite la ruta");
                    String rutaAutobus = miscanner.nextLine();
                    System.out.println("Número máximo de pasajeros");
                    int maximoPasajeros = Integer.valueOf(miscanner.nextLine());
                    System.out.println("Número de pasajeros");
                    int cantidadPasajeros = Integer.valueOf(miscanner.nextLine());
                    miAutobus.setNombre(nombreAutobus);
                    miAutobus.setRuta(rutaAutobus);
                    miAutobus.setMaximoPasajeros(maximoPasajeros);
                    miAutobus.setNumeroPasajeros(maximoPasajeros);
                    
                    miTerminal.agregarAutobus(miAutobus);
                    System.out.println("Nombre de la terminal a la que pertenece el Autobus");
                    String nombreTerminal = miscanner.nextLine();
                    Terminal miTerminal = miestacion.buscarTerminal(nombreTerminal);
                    miTerminal.agregarAutobus(miAutobus);
                    //miAutobus.
                    break;
                case "2":
                    System.out.println("Modificar Autobus");
                    System.out.println("Nombre del Autobus");
                    String nombre = miscanner.nextLine();
                    System.out.println("Digite la ruta");
                    String ruta = miscanner.nextLine();
                    System.out.println("Número máximo de pasajeros");
                    int maximo = Integer.valueOf(miscanner.nextLine());
                    System.out.println("Número de pasajeros");
                    int cantidad = Integer.valueOf(miscanner.nextLine());
                    //String File = "C:\\Users\\USUARIO\\Documents\\code\\PROYECTO-PROGRA-2\\ProyectoBuses\\Estaciones.txt";
                    //miAutobus.actualizarAutobus(nombre, ruta, maximo, cantidad);
                    break;
                case "3":
                    System.out.println("Borrar Autobus");
                    System.out.println("Digite el numero de Autobus que deseas eliminar!!!");
                    int indexAutobus = Integer.valueOf(miscanner.nextLine());
                    //miAutobus. (indexAutobus);
                    break;
                case "4":
                    System.out.println("Listado de Autobuses");
                    String nombreTerm = "";
                    System.out.println("Digite el nombre de la terminal!!!");
                    nombreTerminal = miscanner.nextLine();
                    Terminal terminal = miestacion.buscarTerminal(nombreTerm);
                    terminal.listarBuses();
                    
                    break;
                case "0":
                    System.out.println("Regresar");
                    break;
            }
            opcion = miscanner.nextLine();
        }    
    }

    public static void Pasajeros() {
        Scanner miscanner = new Scanner(System.in);
        String opcion = "";
        
        System.out.println("____________________________");
        System.out.println("PASAJEROS");
        System.out.println("1. Subir Pasajero");
        System.out.println("2. Bajar pasajero");
        System.out.println("3. Disponibilidad");
        System.out.println("0. Regresar");
        
        System.out.println("Digite el nombre del pasajero: ");
        String nombrePasajero = miscanner.nextLine();
        System.out.println("Digite la edad del pasajero: ");
        int edadPasajero = Integer.valueOf(miscanner.nextLine());
        
        miPasajero = new Pasajero(nombrePasajero, edadPasajero);
        
        while (!"0".equals(opcion)) {
            System.out.println("____________________________");
            System.out.println("PASAJEROS");
            System.out.println("1. Subir Pasajero");
            System.out.println("2. Bajar pasajero");
            System.out.println("3. Disponibilidad");
            System.out.println("0. Regresar");
            
            switch (opcion) {
                case "1":
                    miAutobus.subirPasajero(miPasajero);
                    break;
                    
                case "2":
                    miAutobus.bajarPasajero(miPasajero);
                    break;
                    
                case "3": 
                    miAutobus.obtenerDisponibilidad();
                    break;
                
                case "0":
                    System.out.println("Regresar");
                    break;
            }
            opcion = miscanner.nextLine();
        }
    }

    public static void Estadistica() {
        
        Scanner miscanner = new Scanner(System.in);
        String opcion = "";
        
        System.out.println("____________________________");
        System.out.println("ESTADISTICA");
        System.out.println("1. Cantidad de autobuses x estación");
        System.out.println("2. El autobús con mayor cantidad de Asientos Libres");
        System.out.println("3. Promedio de Edad de los Pasajeros x autobús");
        System.out.println("0. Regresar");
        
        while (!"0".equals(opcion)) {
            System.out.println("____________________________");
            System.out.println("ESTADISTICA");
            System.out.println("1. Cantidad de autobuses x estación");
            System.out.println("2. El autobús con mayor cantidad de Asientos Libres");
            System.out.println("3. Promedio de Edad de los Pasajeros x autobús");
            System.out.println("0. Regresar");
            int total = miestacion.totalTerminales();
            switch (opcion) {
                case "1":
                    
                    for (int i = 0; i < total; i++){
                        Terminal miTerminal =  miestacion.obtenerTerminal(i);
                        System.out.println("La cantidad de buses para la terminal: " + miTerminal.getNombre() + " es de: " + miTerminal.getNumeroAutobuses());
                    }                                       
                    break;
                    
                case "2":                   
                    for (int i = 0; i < total; i++){
                        Terminal miTerminal =  miestacion.obtenerTerminal(i);
                        ArrayList<Autobus> buses = miTerminal.obtenerBuses();
                        int cantidadAsientos = 0;
                        int asientosLibres = 0;
                        String nombreAutobus = "";
                        for (int y = 0;y < buses.size(); y++){
                            cantidadAsientos = buses.get(y).obtenerDisponibilidad();
                            if(cantidadAsientos > asientosLibres){
                                asientosLibres = cantidadAsientos;
                                nombreAutobus = buses.get(y).getNombre();
                            }
                        }                        
                        System.out.println("El autobus con mayor numero de asientos libres es : " + nombreAutobus + " tiene un total de: " + asientosLibres);
                    }
                    miAutobus.obtenerDisponibilidad();
                    break;
                    
                case "3": 
                    
                    break;
                
                case "0":
                    System.out.println("Regresar");
                    break;
                
            }
            opcion = miscanner.nextLine();
        }
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
