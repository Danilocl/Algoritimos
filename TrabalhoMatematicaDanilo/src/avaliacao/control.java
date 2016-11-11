package avaliacao;

import java.util.ResourceBundle.Control;

public class control {
	public static boolean calculo(boolean p, boolean q, boolean r) {
			
		
		String resultado;
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
			resultado = ("verdade");
		} else if ((tabela[2] == false) && (tabela[5] == false)) {
			tabela[6] = true;
		} else {
			tabela[6] = false;
		}

		return tabela[6];

	}
	
	public static void tabela (boolean p, boolean q, boolean r) {
		System.out.println(" |p| q| r|(q ^ r)|pv(q ^ r)| <==> | (p v q) |(p v r) |(p v q)^(p v r)  |");
		 if ((p==true) && (q==true) && (r==true))  {
        System.out.println(" |V| V| V|   V   |     V   |   V  |    V    |   V    |       V         |");
		 }
		 else if ((p==true) && (q==true) && (r==false)) {
		System.out.println(" |V| V| F|   F   |     V   |   V  |    V    |   V    |       V         |");
		 }
		 else if ((p==true) && (q==false) && (r==true)) {
		 System.out.println(" |V| F| V|   F   |     V   |   V  |    V    |   V    |       V         |");
		 }
		 else if ((p==true) && (q==false) && (r==false))  {
		 System.out.println(" |V| F| F|   F   |     V   |   V  |    V    |   V    |       V         |");
		 }
		 else if ((p==false) && (q==true) && (r==true))  {
		 System.out.println(" |F| V| V|   V   |     V   |   V  |    V    |   V    |       V         |");
		 }
		 else if ((p==false) && (q==true) && (r==false))  {
		 System.out.println(" |F| V| F|   F   |     F   |   V  |    V    |   F    |       F         |");
		 }
		 else if ((p==false) && (q==false) && (r==true))  {
		 System.out.println(" |F| F| V|   F   |     F   |   v  |    F    |   V    |       F         |");
		 }
		 else if ((p==false) && (q==false) && (r==false))  {
		 System.out.println(" |F| F| F|   F   |     F   |   v  |    F    |   F    |       F         |");       
		 }
		 System.out.println("_______________________________________________________________________|");

	}

}
