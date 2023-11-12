/*
8. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package ejercicio08;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingresa tamaño de lado del cuadrado");
        int n = input.nextInt();

        if (n < 2) {
            System.out.println("El tamaño del cuadrado debe ser igual o mayor a 2.");
        } else {

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == 1 || i == n || j == 1 || j == n) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  "); // Espacio en blanco para el interior
                    }
                }
                System.out.println(); // salto de linea
            }
        }
    }

}
