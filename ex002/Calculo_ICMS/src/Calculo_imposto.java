import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Calculo_imposto {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
		 Locale br = new Locale("pt", "BR");
		 NumberFormat realFormat = NumberFormat.getCurrencyInstance(br);
		 
		 System.out.println("Informe qual imposto você deseja calcular: ");
		 System.out.println("01 - ICMS");
		 System.out.println("02 - IOF (Para compra de moeda estrangeira)");
		 int tipo_imposto = teclado.nextInt();
		 
		 switch (tipo_imposto) {
		 	case 01: 
		 		 float ICMS;
				 float aliquota;
				 
				 System.out.println("Informe o dígito da sua região: ");
				 System.out.println("01 - Sudeste");
				 System.out.println("02 - Sul");
				 System.out.println("03 - Centro-oeste");
				 System.out.println("04 - Nordeste");
				 System.out.println("05 - Norte");
				 int codigoRegiao = teclado.nextInt();
				 
				 if (codigoRegiao == 03 || codigoRegiao == 04 || codigoRegiao == 05) {
					 aliquota = (float) .18;
				 } else if (codigoRegiao == 02) {
					 aliquota = (float) .17;
				 } else {
					 aliquota = (float) .19;
				 }
				 
				 System.out.println("Informe o valor da mercadoria: ");
				 float valor_mercadoria = teclado.nextFloat();
				 
				 ICMS = valor_mercadoria * aliquota;
				 
				 System.out.print("O valor de ICMS a ser pago é de " + realFormat.format(ICMS));
				 
				 break;
		 	case 02:
		 		float IOF;
		 		float alíquota = (float) .011;
		 		
				System.out.println("Informe o valor comprado de moeda: ");
		 		float valor_compra = teclado.nextFloat();
		 		
		 		IOF = valor_compra * alíquota;
		 		
		 		System.out.print("O valor de IOF a ser pago é de " + realFormat.format(IOF));
		 		
		 		break;
		 }
		 
		 teclado.close();
	}
}