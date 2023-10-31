/*
5. Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
 */
package ejercicio05;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese valor máximo a superar( debe ser un entero mayor a 0) ");
        int numInicial= input.nextInt();
        int numIngresado=0;
        int sumaNum=0;
        
        do {            
            System.out.println("Ingrese numero a agregar");
            numIngresado = input.nextInt();
            sumaNum+=numIngresado;
            System.out.println(sumaNum);
        } while (sumaNum<= numInicial);
        
    }
}
