import java.util.Scanner;

public class Degre3 {

	private	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	//d�claration des variables	:
	//int a,b,c;
	//double x, valeur;
	
	//Entr�e des donn�es :
	 System.out.println("Entrez a (int) : ");
	 
		int a = scanner.nextInt();
	 System.out.println("Entrez b (int) : ");
	    int b = scanner.nextInt();
	 System.out.println("Entrez c (int) : ");
	    int c = scanner.nextInt();
	 System.out.println("Entrez x (int) : ");
	   double x = scanner.nextDouble();
	    
	 // Calcul du r�sultat :
	    double valeur=(((a+b)/2)*(x*x*x))+((a*a) +(2*(a*b)+(b*b)*x*x))+a+b+c;
	    
	 //Affichage du r�sultat :
	 System.out.print("La valeur du polyn�me est " + valeur);
	 
	 
	 
	 
	 
	// System.out.print("Quel est votre �ge ? ");
		//Scanner input = new Scanner (System.in);
//		int age = input.nextInt();
	//	int annee = ANNEE_COURANTE - age;
		//System.out.println("Votre ann�e de naissance est : " + annee);
   //  input.close();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
     //Scanner input = new Scanner (System.in);
     //int nbConvives = input.nextInt();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
	
	
	
	
	
	
	
	
	
	}

}
