package avaliacao;

public class control {
	public static boolean control2 (boolean p,boolean q,boolean r) {

	boolean[] tabela = new boolean[7];

		if ((q == true) && (r == true)) {
			// Primeiro
			tabela[1] = true;
		} else {
			tabela[1] = false;
		}
		// P Disjunção q e r Segundo Parêntese
		if ((p == false) && (tabela[1] == false)) {
			// P Disjunção q e r
			tabela[2] = false;
		} else {
			tabela[2] = true;
		}
		if ((p == false) && (q == false)) {
			tabela[3] = false;
		} else {
			tabela[3] = true;
		}
		if ((p == false) && (r == false)) {
			tabela[4] = false;
		} else {
			tabela[4] = true;
		}
		if ((tabela[3] == true) && (tabela[4] == true)) {
			tabela[5] = true;
		} else {
			tabela[5] = false;
		}
		if ((tabela[2] == true) && (tabela[5] == true)) {
			tabela[6] = true;
		} else if ((tabela[2] == false) && (tabela[5] == false)) {
			tabela[6] = true;
		} else {
			tabela[6] = false;
		}

		return tabela[6];

	}

	public static void tabela2(boolean p, boolean q, boolean r) {
		System.out.println("|P|Q|R|");
	    System.out.print(   p);
	    System.out.print(   q);
	    System.out.print(   r);
	
	}
	

	public static void erro (boolean p,boolean q,boolean r) {
		if ((p != true) && (p != false)) {
			System.out.println("erro");
		}
		if ((q != true) && (q != false)) {
			System.out.println("erro");
		}
		if ((r != true) && (r != false)) {
			System.out.println("erro");
		}
		
	}
}