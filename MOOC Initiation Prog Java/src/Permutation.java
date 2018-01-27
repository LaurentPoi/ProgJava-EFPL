import java.util.Scanner;
public class Permutation {
	private	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Entrez a : ");
			int a = scanner.nextInt();
		System.out.println("Entrez b : ");
			int b = scanner.nextInt();
			
		
		System.out.print("Avant permutation...");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		int x=a;
		a=b;
		b=x;
		
		System.out.print("Après permutation !");
		System.out.println("a= "+a);
		System.out.println("b= "+b);	
		
		System.out.print("Je suis trop fort !!!");
		
	}

}
