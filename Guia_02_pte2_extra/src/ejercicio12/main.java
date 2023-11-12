/*
12.Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        char[] letra = new char[3];
        
        for (int i = 0; i < letra.length; i++) {
            System.out.println("Ingrese número entre 0 y 9 ");
            int valor = input.nextInt();
            if (valor == 3) {
                letra[i] = 'E';
            } else {
                letra[i] = (char) ('0' + valor);//'0' es el carácter que representa el dígito 0 en la tabla de códigos ASCII y valor es el que ingresamos
            }
        }
        
        for (int i = 0; i < letra.length; i++) {
            System.out.print(letra[i]);           
            if (i < 2) {
                System.out.print("-");
            }
        }
        System.out.println("");
    }
}
  

