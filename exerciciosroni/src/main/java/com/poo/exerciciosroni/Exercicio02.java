package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio02 {
    public static void resolucao(){
        //2)Construir um algoritmo que leia um número e exiba na tela o seu 
        //sucessor e antecessor.
        int n1;

        System.out.print("Digite um número: \n");
        Scanner leia = new Scanner(System.in);
        n1 = leia.nextInt();

        System.out.print("O antecessor é: "+(n1-1)+"\nE o sucessor é: "+(n1+1));
    }
}
