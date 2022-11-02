package Desafios;

import java.util.Scanner;

public class NotasEscola {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a sua nota! ");
		double media = entrada.nextDouble();
		
		if (media >= 7 && media <= 10) {
			System.out.println("Aprovado! Hehhe");			
		}
		
		if (media < 7 && media >= 4) {
			System.out.println("Recuperapinto!");
		}
	
		if (media < 4 && media >= 0) {
			System.out.println("Repropinto!");
		}
		
	entrada.close();
	}
	
}
