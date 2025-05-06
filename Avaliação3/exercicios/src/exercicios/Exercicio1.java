package exercicios;

import java.util.Random;
import java.util.Scanner;


public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Random aleatorio = new Random();
		
		int numeroSecreto = aleatorio.nextInt(100) + 1;
		int tentativa; 
	   

		
		
		for(int i=1; i<=20; i++) {
			System.out.println("Tente adivinhar o número que estou pensando do 1 ao 100, pra isso digite um número:");
			tentativa = scanner.nextInt();
			
			if(tentativa < numeroSecreto) {
				System.out.println("Mais alto");
			}
			else if(tentativa > numeroSecreto) {
				System.out.println("Mais baixo");
			}
			else {
				System.out.println("Você acertou");
			}
		}
		
		

	}

}
