package ex004;

import java.util.Scanner;

public class salario_por_dia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe seu salário: ");
		int salario = teclado.nextInt();
		
		int dias_uteis = 22; // dias úteis de Maio
		int salario_dia = salario / dias_uteis;
		
		System.out.println("Seu salário é de R$" + salario_dia + " por dia.");
		
		teclado.close();
	}

}
