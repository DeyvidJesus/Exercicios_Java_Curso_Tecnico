package Exercicios;

import java.util.Scanner;

public class Nomes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escreva os nomes dos 3 participantes do seu grupo:");
		String aluno1 = teclado.nextLine();
		String aluno2 = teclado.nextLine();
		String aluno3 = teclado.nextLine();
		
		System.out.print("Os participantes são: " + aluno1 + ", " + aluno2 + " e " + aluno3);
		
		teclado.close();
	}

}
