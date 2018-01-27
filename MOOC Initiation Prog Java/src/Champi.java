import java.util.Scanner;
public class Champi {
	public static void main(String[] args) {
	
		System.out.println("Pensez a un champignon : amanite tue mouches, pied bleu, girolle,");
		System.out.println("cèpe de Bordeaux, coprin chevelu ou agaric jaunissant.");
		
		boolean reponse;
		boolean anneau;
		boolean foret = false;
		boolean lamelles = false;
		boolean convexe = false;
		Scanner clavier = new Scanner(System.in);
		
		
		System.out.print("Est-ce que votre champignon a un anneau (true : oui, false : non) ? ");
		reponse = clavier.nextBoolean();
		anneau = reponse;
				
	if (anneau == false) 
			{ 
			System.out.print("Est-ce que votre champignon a des lamelles (true : oui, false : non) ? "); 
			reponse = clavier.nextBoolean();
			lamelles = reponse;
			}      	  
        				
				if (anneau == false && lamelles == false)
				{
				System.out.print("==> Le champignon auquel vous pensez est ");
				System.out.print("le cèpe de Bordeaux");
				System.exit(1);
				}
		
					 
						if (anneau == false && lamelles == true)
					
						{ System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
					    reponse = clavier.nextBoolean();
					    convexe = reponse;}
						
		
						if (anneau == false && lamelles == true && convexe == true)
						{
							System.out.print("==> Le champignon auquel vous pensez est ");
							System.out.print("le pied bleu");
							System.exit(1);
						}
						
							else {
								if (anneau == false && lamelles == true && convexe == false ) 
								{
								System.out.print("==> Le champignon auquel vous pensez est ");
								System.out.print("la girolle"); 
								System.exit(1);}
							
								else
									{ 
									if (anneau == true)
										{
										System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
										reponse = clavier.nextBoolean();
										convexe = reponse;
										}
							
				if (anneau == true && convexe == false) 
				{
					System.out.print("==> Le champignon auquel vous pensez est ");
										System.out.print("le coprin chevelu");
										System.exit(1);
								} 
								
					else { if ( anneau == true && convexe == true) 
						System.out.print("Est-ce que votre champignon vit en forêt (true : oui, false : non) ? ");
						reponse = clavier.nextBoolean();
						foret = reponse;
						}
								
		if (anneau == true && convexe == true && foret == true) 
		{
			System.out.print("==> Le champignon auquel vous pensez est ");
			System.out.print("l'amanite tue-mouches");	
			System.exit(1);
		}
		
		else { System.out.print("==> Le champignon auquel vous pensez est ");
			   System.out.print("l'agaric jaunissant");
			   System.exit(1);
		
		}}
clavier.close();

	}

}}
