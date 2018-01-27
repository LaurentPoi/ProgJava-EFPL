import java.util.Scanner;
public class Fondue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final int BASE=4;
          double fromage=800.0, eau=2.0, ail=2.0, pain=400.0;
            System.out.print("Quel est le nombre de convives ? ");
            Scanner input = new Scanner (System.in);
            int nbConvives = input.nextInt();




System.out.println("Pour faire cette recette pour " + nbConvives +" personnes, il vous faut :");

System.out.println("- " + ((fromage*nbConvives)/BASE) + " grammes de fromage ;");
System.out.println("- " + ((eau*nbConvives)/BASE) + " dl d'eau ;");
System.out.println("- " + ((ail*nbConvives)/BASE) + " gousses d'ail ;");
System.out.println("- " + ((pain*nbConvives)/BASE) + " grammes de pain ;");
System.out.println("- du poivre à volonté");


	}

}
