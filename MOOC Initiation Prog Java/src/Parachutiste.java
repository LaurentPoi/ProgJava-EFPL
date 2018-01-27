import java.util.Scanner;

class Parachutiste {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        double masse = 80.0;
        do {
            System.out.print("masse du parachutiste (>= 40) ? ");
            masse = clavier.nextDouble();
        } while (masse < 40.0);

        double h0 = 39000.0;
        do {
            System.out.print("hauteur de depart du parachutiste (>= 250) ? ");
            h0 = clavier.nextDouble();
        } while (h0 < 250.0);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        
        final double g=9.81; double v0=0, t0=0;
        double vitesse=v0, hauteur=h0, accel=g, t=t0;
        double surface=2;
        
        double s=surface/masse;
        double q=Math.exp(-s*(t-t0));
        
        do {
        
        double v;
        v = (g/s)*(1-q)+v0*q;
        double h=(h0-(g/s)*(t-t0)-((v0-(g/s))/s/(1-q)));
        double a=g-s*v;
        
       System.out.printf("%.0f, %.4f, %.4f, %.5f\n", t, hauteur, vitesse, accel);
        
       while (h>0)  {t=t+1;
       
        System.exit(1);
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}
