package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		int i;
		int j;
		
		System.out.println("Digite um número para mostrar a tabuada do 1 ao 10: ");
		numero = scanner.nextInt();
		
		a = numero*1;
		b = numero*2;
		c = numero*3;
		d = numero*4;
		e = numero*5;
		f = numero*6;
		g = numero*7;
		h = numero*8;
		i = numero*9;
		j = numero*10;
		
		System.out.println(" a tabuada desse número é: " +a+", " + b +", "+ c+", "  + d + ", " + e + ", " + f +", " + g + ", " + h + ", " + i + ", " + j );
		

	}

}
