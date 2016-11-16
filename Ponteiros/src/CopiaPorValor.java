
public class CopiaPorValor {
	public static void main(String[] args) {
		int a = 3;
		System.out.println("a:" + a);
		add(a,1);
		System.out.println("a:" + a);
	
	}

	private static void add(int a, int b) {
		a = a + b;
	}
}
