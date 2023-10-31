/*
6. Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
menu
1-sumar
2-restar
3-multiplicar
4-dividir
5-salir
elija opcion
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

        System.out.println("Ingrese dos números enteros positivos");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        boolean confirmacion = false;

        do {
            System.out.println("                       Menú");
            System.out.println("------------------------------------");
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir ");
            System.out.println("5- Salir");
            System.out.println("------------------------------------");
            System.out.println("");
            System.out.println("Elija una opción: ");
            System.out.println("");

            int opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado suma: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado resta: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado multiplicacion: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Resultado division: " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa\n"
                            + "(S/N)? ");
                    String rta=input.next();
                    if (rta.equalsIgnoreCase("s")) {
                        confirmacion= true;                    
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        } while (!confirmacion);
    }
}
