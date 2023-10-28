/*
 *Ejercicio 1
Crear un proyecto de Java y definir al menos 6 variables en tu IDE de distintos
tipos de datos.
 */
package main;

/**
 *
 * @author Max
 */
public class main {

    public static void main(String[] args) {

//        //esto es del ej 1 
//        String nombre = "Max";
//        int numero = 81;
//        double numero2 = 123.45;
//        char letra = 'A';
//        boolean comprobacion = true;
//        long numero3 = 1234567898;
//        byte num4 = 1;
//
//        System.out.println("Variables: \n"
//                + nombre + "\n"
//                + numero + "\n"
//                + numero2 + "\n"
//                + numero3 + "\n"
//                + num4 + "\n"
//                + letra + "\n"
//                + comprobacion);
////ejercicio 2
//        int num1 = 5;
//        int num2 = 5;
//
//        int suma = num1 + num2;
//        double division = num1 / num2;
//        boolean logico = num2 < num1;
//        num1++;
//
//        System.out.println("Resultados: \n"
//                + "suma: " + suma + "\n"
//                + "division: " + division + "\n"
//                + "logico: " + logico + "\n"
//                + num1);
//// ejercicio 3
////Define variables donde puedas alojar los resultados y prueba usar dos
////operadores de cada tipo.
//        int num1 = 5;
//        int num2 = 10;
//        int num3 = 15;
//
//        boolean test1 = num2 == num1;
//        boolean test2 = num2 != num1;
//        boolean test3 = num2 > num3;
//        boolean test4 = num2 < num3;
//
//        int suma = num1 + num2;
//        int resta = num3 - num2;
//        num1--;
//        num2++;
//
//        System.out.println(test1);
//        System.out.println(test2);
//        System.out.println(test3);
//        System.out.println(test4);
//        System.out.println(suma);
//        System.out.println(resta);
//        System.out.println(num1);
//        System.out.println(num2);
////System.out.println("hola");
////System.out.println("mundo");
////System.out.print("hola");
////System.out.print(" mundo");

        /*
Ejercicio 4
Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime
ambas variables por pantalla.
Recomendamos que hagan el siguiente experimento: tipear en minúsculas la
palabra sout y apenas terminamos de escribirla tocar el botón tab o mejor
dicho tabular.
Esto nos va a generar un System.out.println() para poder escribir lo que
queramos.
         */
//
//String name="Max";
//int age= (int)(Math.random() * 100 ) + 1;
//        System.out.println("Nombre: " + name);
//        System.out.println("Edad: " + age + " años.");
//Metodos Clase String
        String name = "Max";
        String name2 = "max";
        String name3 = "Max";
        String lastName = "Headrom";

        //charAt
        char character = name.charAt(2);
        System.out.println("");
        System.out.println("Metodo charAt: " + character);

        //equals
        boolean compare1 = name.equals(lastName);
        System.out.println("");
        System.out.println("Metodo equals: " + compare1);
        boolean compare2 = name.equals(name2);
        System.out.println("");
        System.out.println("Metodo equals: " + compare2);
        boolean compare3 = name.equals(name3);
        System.out.println("");
        System.out.println("Metodo equals: " + compare3);

        //equalsIgnoreCase
        boolean compare4 = name.equalsIgnoreCase(name2);
        System.out.println("");
        System.out.println("Metodo equalsIgnoreCase: " + compare4);

        //compareTo
        int compare5 = name.compareTo(lastName);
        System.out.println("");
        System.out.println("copareTo: " + compare5);
        int compare6 = name.compareTo(name2);
        System.out.println("copareTo: " + compare6);

        /*
        En Unicode, las letras mayúsculas aparecen antes que las minúsculas, y la diferencia entre
        ellas es de 32 unidades en el valor numérico de los caracteres, por eso me da -32 en consola
        entonces si quiero que me de solo mayor, igual o menor(1,0,-1) tendria que usar un condicional
        (if)
         */
        //concat
        String concatenado = name.concat(lastName);
        System.out.println("");
        System.out.println("concatenacion: " + concatenado);

        //contains
        String cadena = "esto es para un ejemplo";
        String cadena2 = "para";
        boolean contiene = cadena.contains(cadena2);
        System.out.println("");
        System.out.println("Metodo contains: " + contiene);

        //endsWith
        boolean terminaCon = cadena.endsWith("ejemplo");
        boolean terminaCon2 = cadena.endsWith("plo");
        boolean terminaCon3 = cadena.endsWith("ejempl");
        System.out.println("");
        System.out.println("termina con: " + terminaCon);
        System.out.println("termina con: " + terminaCon2);
        System.out.println("termina con: " + terminaCon3);

        //indexOf
        int posicion = cadena.indexOf("para");
        System.out.println("");
        System.out.println("indexOf: " + posicion);
        //se puede buscar la incidencia de una frase o caracter y te indica la posicion 
        //tambien se podria buscar dentro de un int la primer incidencia de un numero(pasandolo a cadena)

        int num = 1234567;
        String numX = Integer.toString(num);
        int incidenciaNum = numX.indexOf("4");
        System.out.println("");
        System.out.println("indexOf en int: " + incidenciaNum);

        //isEmpty
        String cadena1 = "";
        boolean vacio1 = cadena.isEmpty();
        boolean vacio2 = cadena1.isEmpty();
        System.out.println("");
        System.out.println("isEmpty: " + vacio1);
        System.out.println("isEmpty: " + vacio2);

        //length
        int largo = cadena.length();
        int largo2 = cadena1.length();
        System.out.println("");
        System.out.println("length: " + largo);
        System.out.println("length: " + largo2);

        //replace
        String cadenaAnterior = " todo se puede reemplazar, absolutamente todo";
        String nuevaCadena = cadenaAnterior.replace("todo", "nada");
        System.out.println("");
        System.out.println("replace: " + nuevaCadena);

        //split
        String listaDeAnimales = "Perro,Gato,Canario,Tortuga,Conejo";
        String[] animales = listaDeAnimales.split(",");
        System.out.println("split:");
        System.out.println("");
        System.out.println(animales[0]);
        System.out.println(animales[1]);
        System.out.println(animales[2]);
        System.out.println(animales[3]);
        System.out.println(animales[4]);

        //tambien se puede hacer en un ciclo for o for each
        System.out.println("");
        System.out.println("split: ");
        for (String animal : animales) {
            System.out.println(animal);
        }
        // ó
        System.out.println("");
        System.out.println("split: ");
        for (int i = 0; i < animales.length; i++) {
            System.out.println(animales[i]);
        }

        //startsWith
        boolean comienzaCon1 = cadenaAnterior.startsWith(" todo ");
        boolean comienzaCon2 = cadenaAnterior.startsWith("to");
        boolean comienzaCon3 = cadenaAnterior.startsWith(" se ");
        System.out.println("");
        System.out.println("startsWith: " + comienzaCon1);
        System.out.println("startsWith: " + comienzaCon2);
        System.out.println("startsWith: " + comienzaCon3);

        //substring hay 2 tipos
        /*
        String substring(int inicio)
        String substring(int inicio, int fin)
         */
        String subcadena1 = cadenaAnterior.substring(5); // muestra desde la posición 5 hasta el final
        String subcadena2 = cadenaAnterior.substring(5, 15); // mustra desde la posición 5 hasta la 15
        System.out.println("");
        System.out.println("substring 1: " + subcadena1);
        System.out.println("substring 2: " + subcadena2);

        //toCharArray
        char[] charArray = cadenaAnterior.toCharArray();
        System.out.println("");
        System.out.println("charArray: ");
        for (char caracter : charArray) {
            System.out.print(caracter + "_");
        }

        System.out.println("");
//toLowerCase y toUpperCase

        String lowerCadena = cadenaAnterior.toLowerCase();
        String upperCadena = cadenaAnterior.toUpperCase();
        System.out.println("");
        System.out.println("toLower: " + lowerCadena);
        System.out.println("toUpper: " + upperCadena);

//-----------------------------------------------
//Métodos clase Math
//abs (valor absoluto)(int, double, long)
        System.out.println("");
        int numAbs1 = -10;
        double numAbs2 = -10.01;
        long numAbs3 = -123456789;
        System.out.println("");
        System.out.println("valores absolutos: ");
        System.out.println("Abs1: " + Math.abs(numAbs1));
        System.out.println("Abs2: " + Math.abs(numAbs2));
        System.out.println("Abs3: " + Math.abs(numAbs3));

//max - min (int, long o double)
        int n1 = 10;
        int n2 = 20;
        System.out.println("");
        System.out.println("mayor: " + Math.max(n2, n1));
        System.out.println("menor: " + Math.min(n2, n1));
        System.out.println("");
        // pow (potencia)

        System.out.println("potencia: " + Math.pow(9, 3));// (9 al cubo)
        System.out.println("");
        //random

        int numRandom = (int) (Math.random() * 10) + 1; //el x 10 es el rango(sino seria un numero random decimal entre 0 y 1) y el +1 es para excluir el 0
        System.out.println("número random: " + numRandom);

        System.out.println("");
        //round(redondeo)

        double numRound = 3.14151618;
        System.out.println("Redondeo: " + Math.round(numRound));
        System.out.println("");

//sqrt (raiz cuadrada)
        System.out.println("Raiz cuadrada: " + Math.sqrt(25));
        /*
        para el caso de otras raices se debe agregar el indice dela raiz( cubica, 4ta etc) sobre el exponente fraccional, que seria la inversa (1/x)
        El uso de 1.0 en lugar de 1 asegura que el exponente sea tratado como un número de punto flotante (double) en lugar de un número entero, 
        lo que es importante para realizar cálculos precisos de raíces.
        */
        
        System.out.println("raiz cubica: " + Math.pow(27,1.0 / 3 ));

        //floor
        System.out.println("");
        System.out.println("floor: " + Math.floor(10.598));
    }
}
