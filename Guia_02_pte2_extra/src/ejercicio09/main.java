/*
9. Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
3.
¿Aún no lo entendiste? Recomendamos googlear división con restas
sucesivas.
 */
package ejercicio09;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese dividendo mayor a 1");
        int dividendo = input.nextInt();

        System.out.println("Ingrese divisor mayor a 1");
        int divisor = input.nextInt();
        int resto = dividendo;
        int cociente = 0;

           while (resto >= divisor) {
            resto -= divisor;
            cociente++;
        }


        System.out.println("El resto es " + resto);
        System.out.println("El cociente es " + cociente);
    }
}
