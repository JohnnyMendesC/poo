package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio06 {
    public static void resolucao(){
        /*6) Escreva um programa que leia a temperatura em Celsius e retorne o valor em Fahrenheit 
		F = C x 1,8 + 32
		Para que você consiga converter de grau Celsius para Fahrenheit, basta multiplicar 
		a temperatura em graus Celsius por 1,8 e somar 32.
		Exemplo:
		37º C para Fahrenheit:
		F = 37 x 1,8 + 32;
		F = 98,6;
		37 graus Celsius equivalem a 98,6 graus Fahrenheit.*/

        double C, F;

        System.out.println("Em quantos graus celsius está a temperatura? ");
        Scanner leia = new Scanner(System.in);
        C = leia.nextDouble();

        F=((C*1.8)+32);

        System.out.println("Então a temperatura está em "+F+"° Fahrenheit.");
    }

}
