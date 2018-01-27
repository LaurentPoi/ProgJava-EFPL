import java.util.Scanner;

public class Degre3 {

	private	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	//déclaration des variables	:
	//int a,b,c;
	//double x, valeur;
	
	//Entrée des données :
	 System.out.println("Entrez a (int) : ");
	 
		int a = scanner.nextInt();
	 System.out.println("Entrez b (int) : ");
	    int b = scanner.nextInt();
	 System.out.println("Entrez c (int) : ");
	    int c = scanner.nextInt();
	 System.out.println("Entrez x (int) : ");
	   double x = scanner.nextDouble();
	    
	 // Calcul du résultat :
	    double valeur=(((a+b)/2)*(x*x*x))+((a*a) +(2*(a*b)+(b*b)*x*x))+a+b+c;
	    
	 //Affichage du résultat :
	 System.out.print("La valeur du polynôme est " + valeur);
	 
	 
	 
	 
	 
	// System.out.print("Quel est votre âge ? ");
		//Scanner input = new Scanner (System.in);
//		int age = input.nextInt();
	//	int annee = ANNEE_COURANTE - age;
		//System.out.println("Votre année de naissance est : " + annee);
   //  input.close();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
     //Scanner input = new Scanner (System.in);
     //int nbConvives = input.nextInt();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
	
	
	
	
	
	
	
	
	
	}

}
