package avaliacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean p = false, q = false, r = false;
		int resp;
		try {
			System.out.println("Digite 'true' para verdadeiro e 'false' para falso");
			System.out.println("                                                   ");
			System.out.println("                                                   ");
			System.out.println("     Pv(q^r) <==> (p V q) ^ (pVr)    ");
			System.out.println("                                                   ");

			System.out.println("Digite o valor de p");
			p = in.nextBoolean();

			System.out.println("Digite o valor de q");
			q = in.nextBoolean();

			System.out.println("Digite o valor de r");
			r = in.nextBoolean();

			System.out.println("\n");

			boolean resultado = control.calculo(p, q, r);

			System.out.println("\n O resultado é " + resultado);
			System.out.println("\n");
	
            System.out.println("Deseja ver a tabela correspondente ao seu resultado ?");
			System.out.println("\n");
            System.out.println("Digte '1' para sim e '2' para não"); 
			resp = in.nextInt();
			System.out.println("\n");
			if (resp == 1)  {
				control.tabela(p, q, r);
			} else {
				System.out.println("Fim do Programa");
			}

		} catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Valor inválido");
			System.out.println("\n");
			main.main(args);

		}

		in.close();

	}
}