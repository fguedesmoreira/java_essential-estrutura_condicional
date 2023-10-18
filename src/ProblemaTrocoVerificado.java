import java.util.Locale;
import java.util.Scanner;

public class ProblemaTrocoVerificado {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para calcular o troco no processo de pagamento de um
		 * produto de uma mercearia. O programa deve ler o preço unitário do produto, a
		 * quantidade de unidades compradas deste produto, e o valor em dinheiro dado
		 * pelo cliente. Seu programa deve mostrar o valor do troco a ser devolvido ao
		 * cliente. Se o dinheiro dado pelo cliente não for suficiente, mostrar uma
		 * mensagem informando o valor restante conforme exemplo.
		 */

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Preço unitário do produto: R$ ");
		double precoUnitario = sc.nextDouble();
		
		System.out.print("Quantidade comprada: ");
		int quantidadeComprada = sc.nextInt();
		
		System.out.print("Dinheiro recebido: R$ ");
		double dinheiroRecebido = sc.nextDouble();
		
		sc.close();
		
		if (dinheiroRecebido < (quantidadeComprada * precoUnitario)) {
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM R$ %.2f.", Math.abs(dinheiroRecebido - (quantidadeComprada * precoUnitario)));
		} else {
			System.out.printf("TROCO: R$ %.2f", dinheiroRecebido - (quantidadeComprada * precoUnitario));
		}
		
	}

}