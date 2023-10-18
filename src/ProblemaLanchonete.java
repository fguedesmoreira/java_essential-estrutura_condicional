import java.util.Locale;
import java.util.Scanner;

public class ProblemaLanchonete {

	public static void main(String[] args) {

		/*
		 * Uma lanchonete possui vários produtos. Cada produto possui um código e um
		 * preço. Você deve fazer um programa para ler o código e a quantidade comprada
		 * de um produto (suponha um código válido), e daí informar qual o valor a ser
		 * pago, com duas casas decimais, conforme tabela de produtos ao lado.
		 */

		// Código do produto Preço do produto
		// 1 R$ 5.00
		// 2 R$ 3.50
		// 3 R$ 4.80
		// 4 R$ 8.90
		// 5 R$ 7.32

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Código do produto comprado: ");
		int codigoProduto = sc.nextInt();

		System.out.print("Quantidade comprada: ");
		int quantidade = sc.nextInt();

		sc.close();

		double valorProduto = 0.0;

		if (codigoProduto == 1) {
			valorProduto = 5.0;
		} else if (codigoProduto == 2) {
			valorProduto = 3.5;
		} else if (codigoProduto == 3) {
			valorProduto = 4.8;
		} else if (codigoProduto == 4) {
			valorProduto = 8.9;
		} else if (codigoProduto == 5) {
			valorProduto = 7.32;
		} else {
			valorProduto = 0.0;
		}
		
		System.out.printf("\nValor a pagar: R$ %.2f", quantidade * valorProduto);

	}

}