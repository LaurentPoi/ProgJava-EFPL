import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de d�but de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        {    //Constante location 7-17
		    int journee = 10;
		    double prix=0;
		    int dureeTarif1=0;
		    int dureeTarif2=0;
		 
		       		    
		    //Contr�le de la validit� des donn�es
		    if (fin == debut) {System.out.println("Bizarre, vous n'avez pas lou� votre v�lo bien longtemps !") ;
		        System.exit(1);}
		    else if (debut > fin) {System.out.println("Bizarre, le d�but de la location est apr�s la fin ...");
		             System.exit(1);}
		    	else if (debut<0 || debut> 24 || fin <0 || fin > 24) {System.out.println("Les heures doivent �tre comprises entre 0 et 24 !");
		    	System.exit(1);}
		    		else 
		    		{
		  
		    
		    if 
		    /* Cas 1 : */ ((debut >= 0 && debut <7) && (fin > 0 && fin <= 7)) 
		    
		    	//Calcul du prix 
		    	dureeTarif1 = (fin - debut);
		    	dureeTarif2 = 0;
		    	prix = dureeTarif1;
		    	
		    
		   // else 
		    {
		    	if 
		    	/* Cas 2 : */ ((debut >= 0 && debut <7) && (fin > 7 && fin <= 17))
		    	{
		    	//Calcul du prix
		        dureeTarif1 = (7 - debut);
		        dureeTarif2 = (fin - 7);
		        prix = dureeTarif1 + (2*dureeTarif2);
		    	}
		        else 
		        {	
		          if
		          /* Cas 3 */((debut >= 0 && debut <7) && (fin > 17 && fin <= 24))
		        	  
		          {  //Calcul du prix
		        	  dureeTarif1 = ((7 - debut) + (fin - 17));
		              dureeTarif2 = journee;
		              prix = (dureeTarif1 + (dureeTarif2*2));
		          }
		          else
		          { if
		        	  /* Cas 4 */ ((debut >= 7 &&debut< 17) && (fin > 7 && fin <= 17))
		        	  {
		        	  /*calcul du prix*/ 
		        	  dureeTarif2 = (fin - debut);
		        	  dureeTarif1 = 0;
		        	  prix = (dureeTarif2*2);
		        	  }
		            else
		               {
		            	if 
		            	/*Cas 5*/ ((debut >= 7 && debut < 17) && (fin > 17 && fin <= 24))
		            	{
		            		//calcul du prix
		            		dureeTarif2 = (17 - debut);
		            		dureeTarif1 = (fin - 17);
		            		prix = (dureeTarif1 + (dureeTarif2*2));
		            	}
		            	else
		            	    {
		            		    //cas 6 
		            		    //calcul du prix
		            		    dureeTarif1 = (fin - debut);
		            		    prix = (dureeTarif1 + (dureeTarif2*2));
		            		}
		            
		            	}
		        	
		        }		
		    }	
		    		
		    
		    
    
		    
		        
		    
		  /*   donn� dans le sujet de d�part*/
		        
		        
		        
		    	 System.out.println("Vous avez lou� votre v�lo pendant");
		    	 /* je compl�te */ if (dureeTarif1 == 0)
		    	 						{System.out.println((dureeTarif2)+ " heure(s) au tarif horaire de 2.0 franc(s)");
		    	 						System.out.print("Le montant total � payer est de " + prix);
		    	 				        System.out.println(" franc(s).");}
		    	 					else { if (dureeTarif2 == 0)
		    	 					{System.out.println((dureeTarif1)+ " heure(s) au tarif horaire de 1.0 franc(s)");
	    	 						System.out.print("Le montant total � payer est de " + prix);
	    	 				        System.out.println(" franc(s).");}
		    	 						else {
		        /* je compl�te */ System.out.println((dureeTarif1)+ " heure(s) au tarif horaire de 1.0 franc(s)");
		        /* je compl�te */ System.out.println((dureeTarif2)+ " heure(s) au tarif horaire de 2.0 franc(s)");
		        System.out.print("Le montant total � payer est de " + prix);
		        System.out.println(" franc(s).");}}}}
  		}
    
    	 /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}
