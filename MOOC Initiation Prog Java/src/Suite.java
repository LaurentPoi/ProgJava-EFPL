import java.util.Scanner;

class Suite {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        int debut;
        do {
            System.out.print("de (>= 1) ? ");
            debut = clavier.nextInt();
        } while (debut < 1);

        int fin;
        do {
            System.out.print("a (>= " + debut + ") ? ");
            fin = clavier.nextInt();
        } while (fin < debut);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        
        int j=debut, n=j, iter=0, div3=0, div4=0;  
        
        for (j=debut; j <= fin; j = j+1)

        { n=j;

                
       do {++iter;
       
    //   System.out.println(n+" "+iter);
    	   
    	   div3=n%3; div4=n%4; 
        
     	   if (div3==0)  {n=n+4;}

     	   else if (div4==0) {n=n/2;}
        	  
     	   else n=n-1;} 
       
    	while (n > 0); 
       
     	   
   //   System.out.println("valeur traitée : "+j + " Résultat : " + n + " Itération(s) " + iter);
       
         System.out.println(j+" -> "+iter); 
          if(n==0)iter=0;
                    
    
         }

        
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}
