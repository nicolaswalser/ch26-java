package org.generation;
import java.util.Scanner;


public class CicleWhileDoWhile {
    public static void main (String[] args){
//        Ciclo While
//        Mientras la condicion sea verdadera,
//        se realiza un nuevo ciclo.
//        Syntax:
//
//        while(condicion) instruccion;
//        while(condicion){
//            instruccion;
//        }
        var sc = new Scanner(System.in);
        System.out.println(sc);
        // Scanner sc = new Scanner(System.in);
        boolean active = false;

        while (active){
            System.out.println("Welcome Nick");
            System.out.println("Want to stay active (y/n)?");
            char response = sc.nextLine().toLowerCase().charAt(0);
            if (response != 'y') active = false;
        }
        // with do while
        do {System.out.println("Welcome mate");
            System.out.println("Want to stay active (y/n)?");
            char response = sc.nextLine().toLowerCase().charAt(0);
            if (response == 'y') active = true;
            else active = false;
        } while(active);

        System.out.println("Thanks for your visit!");

        sc.close();
    }
}
