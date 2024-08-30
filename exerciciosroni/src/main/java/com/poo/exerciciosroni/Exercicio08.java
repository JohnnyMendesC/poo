package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio08 {
    public static void resolucao(){
    /*8) Calcule a área e o preço de um terreno
    area = largura x comprimento
    preco = área x preco do metro quadrado */

    double largura, comprimento, area, precom2;
    
    System.out.println("Qual a largura do terreno? ");
    Scanner leia = new Scanner(System.in);
    largura = leia.nextDouble();

    System.out.println("Qual o comprimento do terreno? ");
    comprimento = leia.nextDouble();

    area = (largura*comprimento);

    System.out.print("Qual o valor do m² nesta região? R$");
    precom2 = leia.nextDouble();

    System.out.println("O terreno tem "+area+"m² e custa R$"+(area*precom2));
    }

}
