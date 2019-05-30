/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadejugadores;

import java.util.Scanner;

/**
 *
 * @author Jose Luis
 */
public class ListaDeJugadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String nombre;
        String apellido;
        int goles = 0;
        int totalGoles = 0;
        double sueldo = 0;
        double promedioSueldo = 0;
        int c = 0;
        String valorUsuario = "";
        boolean bandera = true;
        String cadena = "";
        cadena = String.format("%s%s\n", cadena, 
                "\n\n-----------------------LISTA DE JUGADORES"
                        + "----------------------\n");
        cadena = String.format("%s%s\t\t\t\t%s\t\t\t\t%s\t\t\t\t%s\n", cadena, 
                "NOMBRE", "APELLIDO", "GOLES", "SUELDO");
        /* Utilize el do while por que se me hace mas facil.
         * tambien utiliza un contador para ir contando las veces que se
         * ingresa un nuevo usuario con un nuevo sueldo 
         */
        do{ 
            c= c+1;
            System.out.println("Ingrese sus nombres: ");
            nombre = entrada.nextLine();
            
            System.out.println("Ingrese sus apellidos: ");
            apellido = entrada.nextLine();
            
            System.out.println("Ingrese sus goles: ");
            goles = entrada.nextInt();
            
            System.out.println("Ingrese su sueldo");
            sueldo = entrada.nextDouble();
            entrada.nextLine();
            
            System.out.println("¿Desea salir? ingrese 'si' "
                    + "en caso de que quiera salir, ingrese 'no' "
                    + "en caso de que quiera seguir.");
            valorUsuario = entrada.nextLine();
            
            cadena = String.format("%s%s\t\t\t\t%s\t\t\t\t%d\t\t\t\t%.2f\n", 
                    cadena, nombre, apellido, goles, sueldo);
            
            totalGoles = goles + totalGoles;
             promedioSueldo = sueldo + promedioSueldo;
            /* Utilize un booleano para que cuando el usuario ingrese si 
             * la bandera se transforme en false y asi salga de el ciclo 
\            * do while
            */
            if (valorUsuario.equals ("si") || valorUsuario.equals ("Si") || 
                    valorUsuario.equals ("SI")){
                bandera = false;
            }
        }while (bandera == true) ;
        
        promedioSueldo = promedioSueldo / c;
        cadena = String.format("%s%s: %d\n%s: %.2f\n", cadena, 
                "Total Goles", totalGoles, "Promedio Sueldo", 
                promedioSueldo, "Goles");
        System.out.printf("%s", cadena);
    }
}