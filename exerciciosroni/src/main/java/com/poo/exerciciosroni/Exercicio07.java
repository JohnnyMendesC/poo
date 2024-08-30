package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio07 {
    public static void resolucao(){
        /*7) Criar um algoritmo que leia dois números inteiros e imprima a seguinte saída: 
    Dividendo, Divisor, Quociente e Resto.*/

    int n1, n2;
    System.out.println("Diga o primeiro número: ");
    Scanner leia = new Scanner(System.in);
    n1 = leia.nextInt();

    System.out.println("Diga o segundo número: ");
    n2 = leia.nextInt();

    System.out.println("O dividendo é "+n1);
    System.out.println("O divisor é "+n2);
    System.out.println("O Quociente é "+(n1/n2));
    System.out.println("O resto é "+(n1%n2));


    }

}
