/*
 14.Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese cantidad de familias a censar");
        int familias = input.nextInt();
        double edades=0;
        double hijos=0;

        for (int i = 1; i <= familias; i++) {
            System.out.println("Ingrese cantidad de hijos de familia " + i );
            double cantidadHijos = input.nextInt();
            hijos+=cantidadHijos;
         
            for (int j = 1; j <= cantidadHijos ; j++) {
                System.out.println("Ingrese edad del hijo número " + j);
                int edad=input.nextInt();
                edades+=edad;
            }
        }
        
        double mediaEdades = edades / hijos;

       //System.out.println("La media de edad de los hijos de todas las familias es: " + mediaEdades);
        System.out.println("La media de edad de los hijos de todas las familias es: " + String.format("%.1f", mediaEdades));

    }
}
