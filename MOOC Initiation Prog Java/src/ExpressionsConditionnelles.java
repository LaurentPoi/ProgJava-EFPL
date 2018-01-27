import java.util.Scanner;
public class ExpressionsConditionnelles {

	public static void main(String[] args) {
		 //Scanner input = new Scanner (System.in);
		System.out.print("Entrez un réel : ");
	        Scanner clavier = new Scanner(System.in);
	        double a = clavier.nextDouble();
         
         
         if (((a>=2)&&(a<3)) 
        	 || ((a>0)&&(a<=1)) 
        	 || ((a>=-10)&&(a<=2)) ){
        	 System.out.print("x appartient à I");
         } else {
        	 System.out.print("x n'appartient pas à I");
         }
		
	}

}
