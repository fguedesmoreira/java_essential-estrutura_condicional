import java.util.Locale;
import java.util.Scanner;

public class ProblemaDardo {

	public static void main(String[] args) {

		/*
		 * No arremesso de dardo, o atleta tem três chances para lançar o dardo à maior
		 * distância que conseguir. Você deve criar um programa para, dadas as medidas
		 * das três tentativas de lançamento, informar qual foi a maior.
		 */

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite as três distâncias: ");

		double distancia1 = sc.nextDouble();
		double distancia2 = sc.nextDouble();
		double distancia3 = sc.nextDouble();

		double maiorDistancia = 0.0;

		sc.close();

		if (distancia1 > distancia2 && distancia1 > distancia3) {
			maiorDistancia = distancia1;
		} else if (distancia2 > distancia3) {
			maiorDistancia = distancia2;
		} else {
			maiorDistancia = distancia3;
		}

		System.out.printf("\nMAIOR DISTÂNCIA = %.2f", maiorDistancia);

	}

}