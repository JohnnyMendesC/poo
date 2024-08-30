package com.poo.exerciciosroni;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciciosroniApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciciosroniApplication.class, args);

		int n;
		System.out.println("Boas vindas ao exerciciosroni!\nQual exercício deseja executar?");
		Scanner leia = new Scanner(System.in);
		n = leia.nextInt();

		switch(n){
			case 1:
				System.out.println("EXERCÍCIO 1:");
				Exercicio01.resolucao();//É como se fosse "funcao resolucao()" do portugol
				break;
			case 2:
				System.out.println("EXERCÍCIO 2:");
				Exercicio02.resolucao();//É como se fosse "funcao resolucao()" do portugol
				break;
			case 3:
				System.out.println("EXERCÍCIO 3:");
				Exercicio03.resolucao();//É como se fosse "funcao resolucao()" do portugol
				break;
			case 4:
				System.out.println("EXERCÍCIO 4:");
				Exercicio04.resolucao();//É como se fosse "funcao resolucao()" do portugol
				break;			
			case 5:
				System.out.println("EXERCÍCIO 5:");
				Exercicio05.resolucao();//É como se fosse "funcao resolucao()" do portugol
				break;
			case 6:
				System.out.println("EXERCÍCIO 6:");
				Exercicio06.resolucao();//É como se fosse "funcao resolucao()" do portugol
				break;
			case 7:
				System.out.println("EXERCÍCIO 7:");
				Exercicio07.resolucao();//É como se fosse "funcao resolucao()" do portugol
				break;
			case 8:
				System.out.println("EXERCÍCIO 8:");
				Exercicio08.resolucao();//É como se fosse "funcao resolucao()" do portugol
				break;
			case 9:
				System.out.println("EXERCÍCIO 9:");
				Exercicio09.resolucao();//É como se fosse "funcao resolucao()" do portugol
				break;
			case 10:
				System.out.println("EXERCÍCIO 10:");
				Exercicio10.resolucao();//É como se fosse "funcao resolucao()" do portugol
				break;
			default:
				System.out.println("Digite um número entre 1 e 10");
				}
	}

}
