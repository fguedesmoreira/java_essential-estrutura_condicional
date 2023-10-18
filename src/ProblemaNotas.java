import java.util.Locale;
import java.util.Scanner;

public class ProblemaNotas {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler as duas notas que um aluno obteve no primeiro e
		 * segundo semestres de uma disciplina anual. Em seguida, mostrar a nota final
		 * que o aluno obteve (com uma casa decimal) no ano juntamente com um texto
		 * explicativo. Caso a nota final do aluno seja inferior a 60.00, mostrar a
		 * mensagem "REPROVADO", conforme exemplos.
		 */

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();

		System.out.print("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();

		System.out.printf("\nNota final do aluno: %.1f", nota1 + nota2);

		if (nota1 + nota2 < 60) {
			System.out.printf("\nREPROVADO");
		}

		sc.close();

	}

}