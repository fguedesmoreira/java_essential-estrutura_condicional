import java.util.Scanner;

public class ProblemaTempoDeJogo {

	public static void main(String[] args) {

		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
		 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
		 * uma duração mínima de 1 hora e máxima de 24 horas.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Hora inicial: ");
		int horaInicial = sc.nextInt();

		System.out.print("Hora final: ");
		int horaFinal = sc.nextInt();

		sc.close();

		int tempoDeJogo = 0;

		if (horaInicial > horaFinal) {
			tempoDeJogo = (24 - horaInicial) + (0 + horaFinal);
		} else if (horaInicial == horaFinal) {
			tempoDeJogo = 24;
		} else {
			tempoDeJogo = horaFinal - horaInicial;
		}

		System.out.printf("\nO JOGO DUROU %d HORA(S).", tempoDeJogo);

	}

}