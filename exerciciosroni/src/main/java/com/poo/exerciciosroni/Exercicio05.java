package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio05 {
    public static void resolucao(){
    /*5) Uma empresa paga R$10.00 por hora normal trabalhada e R$ 15.00 por hora extra. 
	Escreva um algoritmo que leia o total de horas normais trabalhadas e o total de 
	horas extras trabalhadas por um empregado em um ano e calcule o salário anual deste trabalhador.
	
	Exemplo :   Entrada :   Digite o número de horas trabalhadas no ano : 1760 
	                        Digite o número de horas extras trabalhadas no ano : 400 
                Saída :     Seu salário anual é de : R$ 23600 */
    
    int horas_trabalhadas;
    int valor_hora_normal = 10;

    int horas_extras;
    int valor_hora_extra = 15;

    System.out.println("Digite o número de horas trabalhadas no ano: ");
    Scanner leia = new Scanner(System.in);
    horas_trabalhadas = leia.nextInt();

    System.out.println("Digite o número de horas extras trabalhadas no ano: ");
    horas_extras = leia.nextInt();

    System.out.println("Seu salário anual é de: R$"+((horas_trabalhadas*valor_hora_normal)+(horas_extras*valor_hora_extra)));
    }

}
