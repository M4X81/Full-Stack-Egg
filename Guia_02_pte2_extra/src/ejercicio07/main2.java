/*
7. Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
 */
package ejercicio07;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class main2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Determine cuantos números desea ingresar: ");
        int n = input.nextInt();

        double[] lista = new double[n];
        double sumaTotal = 0;
        //cargo el vector
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el número: ");
            lista[i] = input.nextInt();
            sumaTotal += lista[i];
        }
////leo el vector 
//System.out.println("Números ingresados");
//for (int i = 0; i < n; i++) {
//           System.out.println("Número "+ (i+1) + ": " + lista[i]);
//        }

        double maximo = lista[0];
        double minimo = lista[0];
        int i = 1;

        do {
            maximo = Math.max(maximo, lista[i]);
            minimo = Math.min(minimo, lista[i]);
            i++;
        } while (i < n);
        System.out.println("El mayor número ingresado es: " + maximo);
        System.out.println("El menor número ingresado es: " + minimo);
        System.out.println("El promedio de los números ingresados es: " + (sumaTotal / n));

    }
}
