/*
2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.

 */
package ejercicio02;

/**
 *
 * @author Max
 */
public class main {

    public static void main(String[] args) {

        int A = 10;//debe valer 40
        int B = 20;//debe valer 30
        int C = 30;//debe valer 10
        int D = 40;//debe valer 20
        int aux = 0;

        System.out.println("Los valores antes de la conversion son: ");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
        System.out.println("------------------");

        aux = A;
        A = D;
        D = B;
        B = C;
        C = aux;

        System.out.println("Los valores después de la conversión son: ");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
    }

}

