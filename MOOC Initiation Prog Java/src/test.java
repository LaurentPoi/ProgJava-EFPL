
public class test {

	public static void main(String[] args) {
		int m;
		int p = 4;
		int n = 10;

		boolean test1 = false;
		boolean test2 = (test1 && (p < n));

		for(m = n/2; m < n ; ++m) {
			if (test1 || test2) {
				System.out.print( (p + m) + " ");
				test2 = false;
			}
			else {
				System.out.print( (n + m) + " ");
		    /* code manquant */
			}
		}

		if (test1 && test2) {
			System.out.print( 1 + " ");
		}
		else {
			System.out.print( 2 + " ");
		}
		}
}