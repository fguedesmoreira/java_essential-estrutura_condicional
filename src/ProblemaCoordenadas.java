import java.util.Locale;
import java.util.Scanner;

public class ProblemaCoordenadas {

	public static void main(String[] args) {

		/*
		 * Leia os valores das coordenadas X e Y de um ponto no plano cartesiano. A
		 * seguir, determine qual o quadrante ao qual pertence o ponto (Q1, Q2, Q3 ou
		 * Q4). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o ponto
		 * estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
		 * situação.
		 */
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor de X: ");
		double x = sc.nextDouble();
		
		System.out.print("Informe o valor de Y: ");
		double y = sc.nextDouble();
		
		sc.close();
		
		String quadrante = "";
		
		if (x > 0.0 && y > 0.0) {
			quadrante = "Q1";
		} else if (x > 0.0 && y < 0.0) {
			quadrante = "Q4";
		} else if (x < 0.0 && y > 0.0) {
			quadrante = "Q2";
		} else if (x < 0.0 && y < 0.0) {
			quadrante = "Q3";
		} else if (x == 0.0 && y == 0.0) {
			quadrante = "Origem";
		} else if (x != 0.0) {
			quadrante = "Eixo X";
		} else {
			quadrante = "Eixo Y";
		}
		
		System.out.println("\n" + quadrante);

	}

}