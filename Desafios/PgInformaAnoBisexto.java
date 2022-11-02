package Desafios;

import java.util.Scanner;

public class PgInformaAnoBisexto {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o Ano: ");
		
		int ano = entrada.nextInt();
		
		
		boolean x = (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);
			
			System.out.println(x);
		
			
			//System.out.println("Não é um ano Bissexto!");
			
					
		entrada.close();
	}

}
