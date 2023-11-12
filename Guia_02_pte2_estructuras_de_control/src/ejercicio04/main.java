/*
4. Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.
 */
package ejercicio04;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        
        System.out.println("Ingrese frase o palabra que comienze con la letra 'A'");
        String frase = input.next();
        
        if (frase.substring(0, 1).equalsIgnoreCase("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
       // ó
            
//        if (frase.substring(0).toLowerCase().startsWith("a")) {
//            System.out.println("CORRECTO");
//        }else{
//            System.out.println("INCORRECTO");
//        }
    }
}
