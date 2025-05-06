package exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		int opcao;
		int opcao2;
		int opcao3;
		int opcao4;
		int deposito;
		int saque;
		int saldo;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bem-Vindo, o que você deseja fazer, digite 1 para depositar, 2 para sacar, 3 para ver seu saldo e 4 para encerrar sessão");
		opcao = scanner.nextInt();
		
		if(opcao == 1) {
			System.out.println("Qual o valor que você deseja depositar?");
			deposito = scanner.nextInt();
			System.out.println("Você depositou: " + deposito );
			System.out.println("2 - Sacar  3 - Ver saldo   4 - Encerrar sessão"   );
			opcao2 = scanner.nextInt();
			
			if(opcao2 == 2) {
				System.out.println("Qual o valor que você deseja sacar");
				saque = scanner.nextInt();
				
				if(saque < deposito) {
					System.out.println("Você sacou:" + saque);
				}
				else {
					System.out.println("Valor de Saque inválido");
				}
				saldo = deposito-saque;
				
				System.out.println("3 - Ver saldo   4 - Encerrar sessão");
				opcao3 = scanner.nextInt();
				
				if(opcao3 == 3) {
					System.out.println("Saldo: " + saldo);
					
				}
				else {
					System.out.println("Sessão encerrada");
				}
				
				
				
				
			}
			
			
		}
		else if(opcao == 2) {
			
		}
	

	}

}
