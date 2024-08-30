package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio04 {
    public static void resolucao(){        
        /*4) Faça um programa com duas variáveis ano_nascimento que receberá o ano que você nasceu
		 * e outra variável com o nome ano_futuro que deverá ser atribuído o valor 2035.  
		 * Criar uma variável com o nome resultado para calcular a diferença. No final escreva na tela qual será 
		 * a sua idade em 2035.*/

        int ano_nascimento;
        int ano_futuro = 2035;
        int resultado;
        
         System.out.println("Qual o ano do seu nascimento? ");

         Scanner leia = new Scanner(System.in);
         ano_nascimento = leia.nextInt();

         resultado=((ano_futuro-ano_nascimento));

         System.out.println("Em 2035 você terá "+resultado+" anos.");

    }
}
