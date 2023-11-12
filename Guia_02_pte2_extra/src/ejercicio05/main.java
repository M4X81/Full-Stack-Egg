/*
Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.
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

        System.out.println("Ingrese el costo del tratamiento: ");
        double tratamiento = input.nextDouble();

        double socioA = tratamiento * 0.5;
        double socioB = tratamiento * 0.65;
        double socioC = tratamiento;
        System.out.println("Tipo de socio ( A,B,C ): ");
        String socio = input.next();

        char tipoSocio = socio.toLowerCase().charAt(0);
        System.out.println("El precio del tratamiento sin los descuentos es de $" + tratamiento);

        switch (tipoSocio) {
            case 'a':
                System.out.println("El socio de tipo A tiene un descuento del 50%. Usted abonará: $" + socioA);
                break;
            case 'b':
                System.out.println("El socio de tipo B tiene un descuento del 35%. Usted abonará: $" + socioB);
                break;
            case 'c':
                System.out.println("El socio de tipo C no tiene descuento. Usted abonará: $" + socioC);
                break;
            default:
                throw new AssertionError();
        }

    }
}
