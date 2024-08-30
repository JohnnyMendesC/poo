package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio09 {
    public static void resolucao(){
        /*9) Fazer um algoritmo para ler a distância percorrida em km e o total gasto de combustível, 
        no final deverá ser exibido o consumo médio do carro. */

        double distancia, totalgasto, consumomedio;

        Scanner leia = new Scanner(System.in);

        System.out.println("Insira a distância percorrida em Quilomêtros");
        distancia = leia.nextDouble();

        System.out.println("Informe quanto de combustível, em litros, foi consumido pelo seu automóvel");
        totalgasto = leia.nextDouble();

        consumomedio=((totalgasto/distancia));

        System.out.println("A média de consumo deste automóvel é "+consumomedio+" litros por km rodado");
    }

}
