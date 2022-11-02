package Desafios;

import java.util.Scanner;

public class CalculadorDeNotas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int QuantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		
		while(nota != -1) {
			System.out.println("Informe a sua nota e digite -1: ");
			nota = entrada.nextDouble();
			
			
			if(nota <= 10 && nota >= 0) {
			total  += nota;
			QuantidadeDeNotas++;
			
			}else if (nota != -1) {
				System.out.println("Informe a nota correta!");
			}
		}
		
		
		//Calcular médias
		double media = total / QuantidadeDeNotas;
		System.out.println("A média é " + media);
		
		
		entrada.close();
	}
}
