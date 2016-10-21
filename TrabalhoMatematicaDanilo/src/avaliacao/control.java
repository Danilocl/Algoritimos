package avaliacao;

public class control {
	public static String control2(String p, String q, String r) {

	String[] tabela = new String[7];

		if ((q == "true") && (r == "true")) {
			// Primeiro
			tabela[1] = "true";
		} else {
			tabela[1] = "false";
		}
		// P Disjunção q e r Segundo Parêntese
		if ((p == "false") && (tabela[1] == "false")) {
			// P Disjunção q e r
			tabela[2] = "false";
		} else {
			tabela[2] = "true";
		}
		if ((p == "false") && (q == "false")) {
			tabela[3] = "false";
		} else {
			tabela[3] = "true";
		}
		if ((p == "false") && (r == "false")) {
			tabela[4] = "false";
		} else {
			tabela[4] = "true";
		}
		if ((tabela[3] == "true") && (tabela[4] == "true")) {
			tabela[5] = "true";
		} else {
			tabela[5] = "false";
		}
		if ((tabela[2] == "true") && (tabela[5] == "true")) {
			tabela[6] = "true";
		} else if ((tabela[2] == "false") && (tabela[5] == "false")) {
			tabela[6] = "true";
		} else {
			tabela[6] = "false";
		}

		return tabela[6];

	}

	public static void tabela2(boolean p, boolean q, boolean r) {
		if (r == true) {
			System.out.println("V");
		} else {
			System.out.println("F");
		}
		if (q == true) {
			System.out.println("V");
		} else {
			System.out.println("F");
		}
		if (p == true) {
			System.out.println("V");
		} else {
			System.out.println("F");
		}
	}

	public static String erro (String x) {
		String y;
		if (x=="true") {
		y = "true";
		 } else if (x=="false") {
			 y ="false";
		} else {
			System.out.println("O valor digitado é invalido ");
			System.out.println("Favor digite false para (Falso) e true para (verdadeiro) ");
		}
		return x;
	}
}
