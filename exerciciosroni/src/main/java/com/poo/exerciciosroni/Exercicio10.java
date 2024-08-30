package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio10 {
    public static void resolucao(){
        /*10) Criar um algoritmo para ler um tempo em segundos e fazer a impressão no
        console no seguinte formato: hora:minuto:segundos */

        int hora, min, seg, segtotal;

        System.out.println("Insira o tempo em segundos: ");
        Scanner leia = new Scanner(System.in);
        segtotal = leia.nextInt();

        hora = (segtotal/3600);
        min = ((segtotal%3600)/60);
        seg = (segtotal%60);

        System.out.println("O tempo no formato hora:minuto:segundos ficou assim "+hora+":"+min+":"+seg);
        System.out.println("Hora:"+hora+" Minuto:"+min+" Segundo:"+seg);
    }

}
