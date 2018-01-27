import java.util.Scanner;

public class AGE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ANNEE_COURANTE = 2017;
		System.out.print("Quel est votre âge ? ");
		Scanner input = new Scanner (System.in);
		int age = input.nextInt();
		int annee = ANNEE_COURANTE - age;
		System.out.println("Votre année de naissance est : " + annee);
        input.close();
	}

}
