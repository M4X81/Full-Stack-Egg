/*
8. Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.
 */
package ejercicio08;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        int numero;
        int contadorPar=0;
        int contadorImpar=0;
        
        do {
            System.out.println("Ingrese numero entero");
            numero= input.nextInt();
            
            if (numero % 2 == 0 && numero > 0 ) {
                contadorPar++;     
            }else if( numero %2 !=0 && numero > 0){
                contadorImpar++;
            }
        } while (numero % 5 !=0);
       
        System.out.println("La cantidad total de números ingresados fueron " + (contadorImpar+contadorPar));
        System.out.println("Los pares ingresados fueron " + contadorPar);
        System.out.println("Los impares ingresados fueron " + contadorImpar);
    }
}
