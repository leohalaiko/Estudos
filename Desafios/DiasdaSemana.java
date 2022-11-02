package Desafios;

import java.util.Scanner;

public class DiasdaSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o nome do dia: ");
		
		String Dia = entrada.next();
		
		if (Dia.equalsIgnoreCase("Domingo")) {
			System.out.println(1);
		
		}else if (Dia.equalsIgnoreCase("Segunda")) {
			System.out.println(2);
		
		}else if (Dia.equalsIgnoreCase("Terça") 
				|| "Terca".equalsIgnoreCase(Dia)) {
			System.out.println(3);
		
		}else if (Dia.equalsIgnoreCase("Quarta")) {
			System.out.println(4);
		
		}else if (Dia.equalsIgnoreCase("Quinta")) {
			System.out.println(5);
		
		}else if (Dia.equalsIgnoreCase("Sexta")) {
			System.out.println(6);
		
		}else if (Dia.equalsIgnoreCase("Sábado") 
				|| "Sabado".equalsIgnoreCase(Dia)) {
			System.out.println(7);
		}
		
		else { System.out.println("Dia inválido!"); 
			
				
				
			}
		
				
		entrada.close();
	}

}
