import java.util.Locale;
import java.util.Scanner;

public class ProblemaTemperatura {

	/*
	 * Deseja-se converter uma medida de temperatura da escala Celsius para
	 * Fahrenheit ou vice-versa. Para isso, você deve construir um programa que leia
	 * a letra "C" ou "F" indicando em qual escala vai ser informada uma
	 * temperatura. Em seguida o programa deve mostrar a temperatura na outra escala
	 * com duas casas decimais. A seguir é dada a fórmula para converter de
	 * Fahrenheit para Celsius (você deve deduzir a fórmula de Celsius para
	 * Fahrenheit): C = 5/9 (F - 32)
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Você vai digitar a temeratura em qual escala (C/F)? ");
		String escala = sc.nextLine();

		if (escala.toUpperCase().equals("F")) {

			System.out.print("Digite a temperatura em Fahrenheit: ");
			double temperaturaEmFahrenheit = sc.nextDouble();

			double temperaturaEmCelsius = (5.0 / 9) * (temperaturaEmFahrenheit - 32.0);

			System.out.printf("\nA Temperatura equivalente em Celsius: %.2f", temperaturaEmCelsius);

		} else {

			System.out.print("Digite a temperatura em Celsius: ");
			double temperaturaEmCelsius = sc.nextDouble();

			double temperaturaEmFahrenheit = ((9.0 / 5) * temperaturaEmCelsius) + 32.0;

			System.out.printf("\nA Temperatura equivalente em Fahrenheit: %.2f", temperaturaEmFahrenheit);

		}

		sc.close();

	}

}