package ex004;

import java.util.Scanner;

public class salario_por_dia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe seu sal�rio: ");
		int salario = teclado.nextInt();
		
		int dias_uteis = 22; // dias �teis de Maio
		int salario_dia = salario / dias_uteis;
		
		System.out.println("Seu sal�rio � de R$" + salario_dia + " por dia.");
		
		teclado.close();
	}

}
