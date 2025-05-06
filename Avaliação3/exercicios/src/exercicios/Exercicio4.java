package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite a sua idade:");
		idade = scanner.nextInt();
		
		if(idade <= 12) {
			System.out.println("Você é uma Criança");
		}
		
		else if(idade == 17) {
			System.out.println("Você é um adolescente");
		}
		else if(idade == 16) {
			System.out.println("Você é um adolescente");
		}
		else if(idade == 15) {
			System.out.println("Você é um adolescente");
		}
		else if(idade == 14) {
			System.out.println("Você é um adolescente");
		}
		else if(idade == 13) {
			System.out.println("Você é um adolescente");
		}
		else if(idade >= 60) {
			System.out.println("Você é um idoso");
			
		}
		else {
			System.out.println("Você é um adulto");
		}

	}

}
