package org.generation;

public class CicloFor {
    public static void main(String[] args){
        /*
        Syntax:
            for(expression_inicial ; comparacion; expresion_final)
                instruccion;
            for(expression_inicial ; comparacion; expresion_final)
                instruccion;
         */
        // Imprimir 5 veces "Hola"

        for (int i = 1; i<=5; i++){
            System.out.println("Hola"+i);
        }
        // Imprimir la tabla de multiplicar del 1 al 3
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
               // System.out.println(i + " * " + j + " = " + result);
               // System.out.printf("Tabla %d * %d = %d %n", i, j, result);
            }
        }
        int iteraciones = 1;
        for (  ; ; ) {
            if (iteraciones > 5)
                break;
                System.out.println("Iteracion: " + iteraciones ++);

        }
        outerLoop:
        for (int i = 0 ; i < 5; i++){
            for (int j = 0 ; j < 5; j++){
                System.out.println(i + " " + j);
                if (i == 2 && j == 2) break outerLoop; // or instead of break use continue to only break with 2
                // and continue with the rest.
            }

            }
        // Print the odd numbers from 1 to 20 included

        for (int i = 0; i <= 20 ; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }
}
