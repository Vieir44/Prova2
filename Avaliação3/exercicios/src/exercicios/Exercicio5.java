package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int a;
	    int b;
	    String valorMaior;

	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("Digite um número");
	    a = scanner.nextInt();
	    
	    System.out.println("Agora digite um segundo número");
	    b = scanner.nextInt();
	    
	    valorMaior = (a>b) ? "O primeiro valor que você digitou é maior" : "O segundo valor é maior";
	    
	    System.out.println(valorMaior);

}
}