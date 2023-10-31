/*
1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.

 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese cantidad de minutos a convertir: ");
        int min= input.nextInt();
        int hora= min/60;
        int dia = hora/24;
        
        int horasResto= hora % 24;
        int minResto= min % 60;
        
        System.out.println(min + " minutos son equivalentes a " + dia + " día/s , " + horasResto + " hora/s y " + minResto + " minuto/s.");
     
        
    }
}
