import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean estaApto = false;
		System.out.println("Favor informar sua data de nascimento:");
		
		int data_nasc = teclado.nextInt();
		LocalDate data_atual = LocalDate.now();
		int ano_atual = data_atual.getYear();
		
		int idade = ano_atual - data_nasc;
		
		if (idade >= 18) {
			estaApto = true;
		} else {
			estaApto = false;
		}
		
		if(estaApto == true) {
			System.out.print("Você está apto a tirar sua habilitação, compareça ao CFC mais próximo.");
		} else {
			System.out.print("Você ainda não está apto a tirar sua habilitação.");
		}
		
		teclado.close();
	}

}
