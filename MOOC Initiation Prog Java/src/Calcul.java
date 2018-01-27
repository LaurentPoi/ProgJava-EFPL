import java.util.Scanner;
public class Calcul {
	private	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Combien avez-vous reçu d'argent ? ");
		int a = scanner.nextInt();
		int livres=a/4*3;
		
		int reste=a-livres;
		int divers=reste/3;
		int cafe=divers/2;
		int abo=divers/4;
		int ratp=divers/3;
		
		
		int fleurs=(reste%3)+(a%4%3)+(divers%3)+(divers%2)+(divers%4)+(divers%3);
		
		
		
		System.out.println("Livres : " +livres);
		
		System.out.println("Cafés : "+cafe);
		System.out.println("Abonnement : " +abo);
		System.out.println("Transports : "+ratp);
		System.out.println("Fleurs"+fleurs);
	}}
	
			