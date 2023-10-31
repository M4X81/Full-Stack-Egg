/*
3. Realizar un programa que permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Lenght() en Java.
 */
package ejercicio03;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese frase o palabras de 8 caracteres ");
        
        String frase;
        String salir = "salir";
        do {
            System.out.print("Ingrese la frase o palabra. ");
            System.out.println("Escriba salir para finalizar: ");
            frase = input.nextLine();
            if (frase.length() == 8) {
                System.out.println("Correcto");
            } else if (frase.equalsIgnoreCase(salir)) {
                System.out.println("Finalizando...");
               break;
            }else{
                 System.out.println("Incorrecto");
            }

        } while (!frase.equals(salir));

    }
}
