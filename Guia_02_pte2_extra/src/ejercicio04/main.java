/*
4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.

 */
package ejercicio04;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int num;

        do {
            System.out.println("Ingrese el número: ");
            num = input.nextInt();

            if (num >= 1 && num <= 10) {
                String[] numerosRomanos = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
                System.out.println("El número " + num + " se escribe de esta manera = " + numerosRomanos[num - 1]);
            } else if (num == 0) {
                break;
            } else {
                System.out.println("Número fuera del rango (1 al 10). Intente nuevamente.");
            }
        } while (true);
    }
}
