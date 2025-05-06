package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList();
		int numero;
		
		
		for(int i =1; i >=10; i++) {
			System.out.println("Digite alguns números para serem somados, caso deseje terminar digite 0");
			numero = scanner.nextInt();
			
			if(numero != 0) {
				numeros.add(numero);
			}
			else {
				break;
			}
			
	
		
		}
		System.out.println(numeros);

	}
}
	


