import java.util.Locale;
import java.util.Scanner;

public class ProblemaAumento {

	public static void main(String[] args) {

		/*
		 * Uma empresa vai conceder um aumento percentual de salário aos seus
		 * funcionários dependendo de quanto cada pessoa ganha, conforme tabela ao lado.
		 * Fazer um programa para ler o salário de uma pessoa, daí mostrar qual o novo
		 * salário desta pessoa depois do aumento, quanto foi o aumento e qual foi a
		 * porcentagem de aumento.
		 */

		// Salário atual Aumento
		// Até R$ 1000.00 20%
		// Acima de R$ 1000.00 até R$ 3000.00 15%
		// Acima de R$ 3000.00 até R$ 8000.00 10%
		// Acima de R$ 8000.00 5%

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o salário da pessoa: R$ ");
		double salario = sc.nextDouble();

		sc.close();

		double percentualAumento = 0.0;

		if (salario <= 1000) {
			percentualAumento = 20.0;
		} else if (salario > 1000 && salario <= 3000) {
			percentualAumento = 15.0;
		} else if (salario > 3000 && salario <= 8000) {
			percentualAumento = 10.0;
		} else {
			percentualAumento = 5.0;
		}

		System.out.printf("\nNovo salário = R$ %.2f", salario * (1 + percentualAumento / 100));
		System.out.printf("\nAumento = R$ %.2f", salario * (percentualAumento / 100));
		System.out.printf("\nPorcentagem = %.0f %%", percentualAumento);

	}

}