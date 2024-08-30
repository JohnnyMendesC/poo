package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio03 {
    public static void resolucao(){
        //3) Construa um algoritmo que leia o nome de um aluno, 
        //disciplina, quatro notas e exiba na tela a média.

        String nome, disciplina;
        int nota1, nota2, nota3, nota4;
        float media;

        System.out.println("Qual o nome do(a) aluno(a): ");
        Scanner leia = new Scanner(System.in);
        nome = leia.nextLine();

        System.out.println("Qual a disciplina deste(a) aluno(a): ");
        disciplina = leia.nextLine();

        System.out.println("Diga a primeira nota: ");
        nota1 = leia.nextInt();

        System.out.println("Diga a segunda nota: ");
        nota2 = leia.nextInt();

        System.out.println("Diga a terceira nota: ");
        nota3 = leia.nextInt();

        System.out.println("Diga a quarta nota: ");
        nota4 = leia.nextInt();

        media=((nota1+nota2+nota3+nota4)/4);

        System.out.println(nome+" da disciplina "+disciplina+", teve média "+media+".");

    }

}
