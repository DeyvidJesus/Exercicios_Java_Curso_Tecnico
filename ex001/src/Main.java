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
			System.out.print("Voc� est� apto a tirar sua habilita��o, compare�a ao CFC mais pr�ximo.");
		} else {
			System.out.print("Voc� ainda n�o est� apto a tirar sua habilita��o.");
		}
		
		teclado.close();
	}

}
