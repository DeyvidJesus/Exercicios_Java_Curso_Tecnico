package Exercicios;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe suas notas:");
		System.out.print("Nota 1: ");
		int nota1 = teclado.nextInt();
		System.out.print("Nota 2: ");
		int nota2 = teclado.nextInt();
		System.out.print("Nota 3: ");
		int nota3 = teclado.nextInt();
		
		teclado.close();
		
		int media = (nota1 + nota2 + nota3) / 3;
		
		System.out.print("Sua média final é " + media);
	}

}
