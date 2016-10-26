package avaliacao;

import java.util.Scanner;

public class main2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean p, q, r = false;
		int b = 20;
		int c = 10;
		System.out.println("Digite 'true' para verdadeiro e 'false' para falso'");
		System.out.println("                                                   ");
		System.out.println("                                                   ");
		System.out.println("     Pv(q^r) <==> (p V q) ^ (pVr)    ");
		System.out.println("                                                   ");

		try {
			System.out.println("Digite o valor de r");
			r = in.nextBoolean();

			System.out.println("Digite o valor de q");
			q = in.nextBoolean();

			System.out.println("Digite o valor de P");
			p = in.nextBoolean();

			System.out.println("\n");

			control.tabela2(p, q, r);

			boolean resultado = control.control2(p, q, r);

			System.out.println("\n O resultado é " + resultado);
			in.close();

		} catch (Exception ex) {
			System.out.println("Erro: Valor diference de false/true.");
		}

	}
}