/*
10.Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.

 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int n1 = (int) (Math.random() * 11);
        int n2 = (int) (Math.random() * 11);
        int resultado = n1 * n2;
        int respuesta;

        System.out.println("Adivine el resultado de la multiplicacion de : " + n1 + " y " + n2);
        do {
            System.out.println("Ingrese el resultado: ");
            respuesta = input.nextInt();
            if (respuesta == resultado) {
                System.out.println("Correcto!!");
                break;
            } else {
                System.out.println("Incorrecto!!!");
            }
        } while (respuesta != resultado);
    }
}
