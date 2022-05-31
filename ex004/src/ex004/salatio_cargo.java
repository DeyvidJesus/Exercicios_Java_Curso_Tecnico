package ex004;

import java.util.Scanner;

public class salatio_cargo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe seu cargo: ");
		String cargo = teclado.nextLine();
		int salario = 0;
		
		if (cargo.equals("Desenvolvedor Frontend") || cargo.equals("Desenvolvedor Backend")) {
			salario = 5000;
		} else if (cargo.equals("Desenvolvedor FullStack")) {
			salario = 7000;
		} else if (cargo.equals("UI/UX")) {
			salario = 5500;
		} else if (cargo.equals("Estagiário")) {
			salario = 2000;
		} else {
			System.out.println("Cargo inexistente");
			cargo = "Inexistente";
		}
		
		if (cargo != "Inexistente") {
			System.out.println("Seu salário é de R$" + salario);
		}
		
		teclado.close();
	}

}
