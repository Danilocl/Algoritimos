package avaliacao;


import java.util.Scanner;

public class main2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean p, q, r;
		System.out.println("Digite 'true' para verdadeiro e 'false' para falso'");
		System.out.println("                                                   ");
		System.out.println("                                                   ");
		System.out.println("Pv(q^r) <==> (p V q0 ^(pVr)");
		System.out.println("                                                   ");
		
		System.out.println("Digite o valor de r");
		r = in.nextBoolean();
		
		
		System.out.println("Digite o valor de q");
		q = in.nextBoolean();
		

		System.out.println("Digite o valor de P");
		p = in.nextBoolean();
		
		
		System.out.println("\n");
		
		boolean resultado = control.control2 (p, q, r);
        
		control.tabela2(p, q, r);
		
		System.out.println("\n O resultado � " + resultado);
		in.close();
	
	}
}