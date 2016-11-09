import java.util.Scanner;

public class MediaAritmeticaSimples {

	public static void main( String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
				
		System.out.println("Qual a priemeira nota? ");
		double n1 = scanner.nextDouble();

		
		System.out.println("Qual a segunda nota? ");
		double n2 = scanner.nextDouble();
		
		double media = (n1+n2)/2;
		
		System.out.println("Média Aritmética: "+ media);		
		
	}
}
