import java.util.Locale;
import java.util.Scanner;

public class ProblemaBaskara {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler os três coeficientes de uma equação do segundo
		 * grau. Usando a fórmula de Baskara, calcular e mostrar os valores das raízes
		 * x1 e x2 da equação com quatro casas decimais, conforme exemplo. Se a equação
		 * não possuir raízes reais, mostrar uma mensagem.
		 */

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Coeficiente a: ");
		double a = sc.nextDouble();

		System.out.print("Coeficiente b: ");
		double b = sc.nextDouble();

		System.out.print("Coeficiente c: ");
		double c = sc.nextDouble();

		double delta = (Math.pow(b, 2.0) - (4 * a * c));

		if (delta < 0) {
			System.out.print("\nA equação não possui raízes reais.");
		} else {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);

			System.out.printf("\nx1 = %.4f\nx2 = %.4f", x1, x2);
		}

		sc.close();

	}

}