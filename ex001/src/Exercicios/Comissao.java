package Exercicios;

import java.util.Scanner;

public class Comissao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		String nome = teclado.nextLine();
		System.out.println("Agora informe a quantidade de vendas que voc� fez: ");
		int quantVendas = teclado.nextInt();
		System.out.println("Informe o valor das comiss�es: ");
		float valorComissao = teclado.nextFloat();
		
		float somaComissao = valorComissao * quantVendas;
		
		System.out.print(nome + " voc� recebe R$" + somaComissao + " por realizar " + quantVendas + " vendas.");
		
		teclado.close();
	}

}
