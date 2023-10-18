import java.util.Locale;
import java.util.Scanner;

public class ProblemaOperadora {

	/*
	 * Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito
	 * a 100 minutos de telefone. Cada minuto que exceder a franquia de 100 minutos
	 * custa R$ 2.00. Fazer um programa para ler a quantidade de minutos que uma
	 * pessoa consumiu, daí mostrar o valor a ser pago.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de minutos: ");
		int minutos = sc.nextInt();

		sc.close();

		double valor = 0.0;

		if (minutos > 100) {
			valor = 50 + ((minutos - 100) * 2);
		} else {
			valor = 50;
		}

		System.out.printf("Valor a pagar: R$ %.2f", valor);

	}

}