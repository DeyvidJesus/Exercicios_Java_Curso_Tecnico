package ex004;

import java.util.Scanner;

public class salario_cargo_switch {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe seu cargo: ");
		String cargo = teclado.nextLine();
		int salario = 0;
		
		switch (cargo) {
		case "Desenvolvedor Frontend":
			salario = 5000;
			break;
		case "Desenvolvedor Backend":
			salario = 5000;
			break;
		case "Desenvolvedor FullStack":
			salario = 7000;
			break;
		case "UI/UX":
			salario = 5500;
			break;
		case "Estagiário":
			salario = 2000;
			break;
		default:
			System.out.println("Cargo inexistente");
			cargo = "Inexistente";
		}

		if (cargo != "Inexistente") {
			System.out.println("Seu salário é de R$" + salario);
		}
		
		teclado.close();
	}

}
