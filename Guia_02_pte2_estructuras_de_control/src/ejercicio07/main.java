/*
7. Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
 */
package ejercicio07;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese una cadena (Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo\n"
                + "de 5 caracteres de largo, el primer carácter tiene que ser X y el último\n"
                + "tiene que ser una O.)");
        
        
        String miCadena;
        int correcto = 0;
        int incorrecto = 0;
        
        do {
            System.out.println("Ingrese su cadena: ");
            miCadena = input.next();
            
            if (miCadena.length() <= 5 && miCadena.toLowerCase().substring(0, 1).equals("x") 
                    && miCadena.toLowerCase().substring(miCadena.length() - 1).equals("o")) {
                System.out.println("Correcto");
                correcto++;                 
            }else{
               System.out.println("Incorrecto");
               incorrecto++;
           }              
            } while (!miCadena.equals("&&&&&") );
           
        
        System.out.println("Lecturas correctas: " + correcto);
        System.out.println("Lecturas incorrectas: " + (incorrecto-1));
            
        }
    }
