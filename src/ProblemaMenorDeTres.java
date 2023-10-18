import java.util.Scanner;

public class ProblemaMenorDeTres {

	/*
	 * Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o
	 * menor dentre os três números lidos. Em caso de empate, mostrar apenas uma
	 * vez.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Primeiro valor: ");
		int a = sc.nextInt();

		System.out.print("Segundo valor: ");
		int b = sc.nextInt();

		System.out.print("Terceiro valor: ");
		int c = sc.nextInt();

		if (a < b && a < c) {
			System.out.printf("\nMENOR = %d", a);
		} else if (b < c) {
			System.out.printf("\nMENOR = %d", b);
		} else {
			System.out.printf("\nMENOR = %d", c);
		}

		sc.close();

	}

}