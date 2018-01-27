import java.util.Scanner;
public class PairImpair {

	public static void main(String[] args) {
		 System.out.print("Entrez un nombre entier : ");
		 Scanner input = new Scanner (System.in);
         int x = input.nextInt();
	     
	     if (x==0) {
	    	 System.out.print(x+" est égal à 0");
	     }
	     else if (x<0) {
	    	 if (x%2==0) {
	    	 System.out.print(x+" est négatif et pair");
	       } else {
	    	 System.out.print(x+" est négatif et impair");
	}}
	     else {
	    	 if (x%2==0) {
	    		 System.out.print(x+" est positif et pair");
	    	 }
	    	 else {
	    		 System.out.print(x+" est positif et impair");
	    	 }
	     }


}}
