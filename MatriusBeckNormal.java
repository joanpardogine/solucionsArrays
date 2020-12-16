import java.util.Scanner;

public class MatriusBeckNormal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclat = new Scanner (System.in);
		int m, n;
		int k = 0;
		boolean sortir = false;
		boolean becknormal = true;
		
			System.out.println("Introdueix les files"
					+ " que vols que tingui la matriu");
			m = teclat.nextInt();
			System.out.println("Introdueix les columnes"
					+ " que vols que tingui la matriu");
			n = teclat.nextInt();
			if (n%2 != 0) {
				sortir = true;
			}
			
		int numeros[][] = new int[m][n];
		 
		for (int i = 0; i < numeros.length && sortir == false; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.println("Introdueix el valor " + j + " de la fila " + i);
				numeros[i][j] = teclat.nextInt();
			}
		}
		
		/* --> k
		 * 0 1 2 3
		 * b b g f 
		 * a g j t
		 * z z t t
		 * g h l n
		*/
		for (int i = 0; i < numeros.length && sortir == false; i++) {
			for (k = 0; k < numeros[i].length - 1; k=k+2) {
				if (numeros[i][k] != numeros[i][k+1]) {
					becknormal = false;
					break;
				}
			}
			if (becknormal == true) {
				System.out.println("La fila " + i + " es becknormal");
			} else {
				System.out.println("La fila " + i + " no es becknormal");
			}
			becknormal = true;
		}
		
		for (int i = 0; i < numeros.length && sortir == false; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(" " + numeros[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Final");
		
		
		 teclat.close();
	}

}