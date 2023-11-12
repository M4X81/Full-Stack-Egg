/*
6. Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
 */
package ejercicio06;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese cantidad de personas a censar: ");
        int cantidadPersonas = input.nextInt();
        double[] altura = new double[cantidadPersonas];

//cargo el vector con las alturas
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Ingrese altura de la persona " + (i + 1));
            altura[i] = input.nextDouble();
        }

 // Calcular el promedio de estaturas en general
        double sumaAlturas = 0;

        for (double d : altura) {
            sumaAlturas += d;
        }
        double promedioAlturas = sumaAlturas / cantidadPersonas;

        // Calcular el promedio de estaturas por debajo de 1.60 mts.
        int contadorAlturasBajas = 0;
        double sumaAlturasBajas = 0;

        for (double d : altura) {
            if (d < 1.60) {
                sumaAlturasBajas += d;
                contadorAlturasBajas++;
            }
        }
        System.out.println("El promedio de las alturas en general es de : " + promedioAlturas + "mts");
        System.out.println("Promedio de estaturas por debajo de 1.60 mts.: " + (contadorAlturasBajas > 0 ? sumaAlturasBajas / contadorAlturasBajas : 0) + " mts.");
        
        /*
        contadorAlturasBajas > 0 ? sumaAlturasBajas / contadorAlturasBajas : 0
        esto es una funcion ternaria, es una especie de if-else abreviada, si se cumple una condicion(contadorAlturasBajas > 0) 
        entonces se realiza(sumaAlturasBajas / contadorAlturasBajas), si no se cumple( si el contador es igual a 0) no se podria dividir x 0,  entonces
        se pasa a la segunda opcion ( :0 ). 
        seria lo mismo que esto:
        
        if (contadorAlturasBajas > 0) {
             promedioAlturasBajas = sumaAlturasBajas / contadorAlturasBajas;
         } else {
             promedioAlturasBajas = 0;
        }
        */
    }
}
