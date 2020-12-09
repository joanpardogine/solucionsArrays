import java.util.Scanner;

public class MatriuMaximElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for per introduir dades
	    int files, columnes, maxElement = 0;
	    Scanner teclat = new Scanner(System.in);
	    
		System.out.print("Entra la quantitat de files: ");
		files = teclat.nextInt();
		
		System.out.print("Entra la quantitat de files: ");
		columnes = teclat.nextInt();
		System.out.println();
		
		int matriu[][]= new int[files][columnes];		
		
		// for per introduir dades
		for (int i=0; i<matriu.length;i++) {  // for per recorrer les files
			for (int j=0; j<matriu[i].length;j++) {   // for per recorrer les columnes
				System.out.print("Entra el valor de [" + i + "][" + j + "] = ");
				matriu[i][j]=teclat.nextInt();
			}
			System.out.println();
		}
		
		// for per procesar les dades
		for (int i=0; i<matriu.length;i++) {  // for per recorrer les files
			for (int j=0; j<matriu[i].length;j++) {   // for per recorrer les columnes
				if (maxElement < matriu[i][j]) {
					maxElement = matriu[i][j];
				};
			}
		}
		System.out.print("El màxim element de la matriu és: " + maxElement);
		teclat.close();
	}

}
