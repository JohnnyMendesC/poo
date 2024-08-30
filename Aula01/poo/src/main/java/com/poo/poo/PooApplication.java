package com.poo.poo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PooApplication {

	public static void main(String[] args) {
		SpringApplication.run(PooApplication.class, args);

		int num1 = 1;
		int num2 = 2;
		int num3 = 100, num4 = 180;

		if( num1>0 || num2>0 ){//se
			System.out.println("Ao menos um deles é maior que zero");
		} else {//senao
			System.out.println("Nenhum deles é maior que zero");
		}
		
		if(num3>num4){
			System.out.println("O Nº maior é: " + num3);
		}else{
			System.out.println("O Nº maior é: " + num4);
		}
		
		System.out.print("Hello World");
	}

}
