import java.util.Locale;
import java.util.Scanner;

public class ProblemaMultiplos {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler dois números inteiros, e dizer se um número é
		 * múltiplo do outro. Os números podem ser digitados em qualquer ordem.
		 */

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite dois números inteiros: ");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();

		sc.close();

		if (numero1 >= numero2 && (numero1 % numero2 == 0)) {
			System.out.printf("Número %d É MÚLTIPLO de %d.", numero1, numero2);
		} else if (numero1 < numero2 && (numero2 % numero1 == 0)) {
			System.out.printf("Número %d É MÚLTIPLO de %d.", numero2, numero1);
		} else {
			System.out.printf("%d e %d NÃO SÃO MÚLTIPLOS.", numero2, numero1);
		}

	}

}