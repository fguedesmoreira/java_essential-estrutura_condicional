import java.util.Locale;
import java.util.Scanner;

public class ProblemaGlicose {

	/*
	 * Fazer um programa para ler a quantidade de glicose no sangue de uma pessoa e
	 * depois mostrar na tela a classificação desta glicose de acordo com a tabela
	 * de referência ao lado.
	 */

	// Classificação Glicose
	// Normal Até 100 mg/dl
	// Elevado Maior que 100 até 140 mg/dl
	// Diabetes Maior de 140 mg/dl

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a medida da glicose: ");
		double medidaGlicose = sc.nextDouble();

		sc.close();

		String classificacao = "";

		if (medidaGlicose <= 100.0) {
			classificacao = "Normal";
		} else if (medidaGlicose > 100.0 && medidaGlicose <= 140.0) {
			classificacao = "Elevado";
		} else {
			classificacao = "Diabetes";
		}

		System.out.printf("Classificação: %s", classificacao);

	}

}