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
                System.out.println(i + " * " + j + " = " + result);
            }
        }

    }
}
