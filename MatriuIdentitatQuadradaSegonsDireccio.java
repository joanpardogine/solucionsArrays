import java.util.Scanner;

public class MatriuIdentitatQuadradaSegonsDireccio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int files, columnes;
		char direccio;
	    Scanner teclat = new Scanner(System.in);
	    boolean volSortir = false;
		
		do {
			System.out.print("Entra la quantitat de files (0 si vols sortir): ");
			files = teclat.nextInt();
			
			System.out.print("Entra la quantitat de columnes (0 si vols sortir): ");
			columnes = teclat.nextInt();
			if (files == 0 || columnes == 0) {
				System.out.println("Veig que vols sortir. Adeu!");
				volSortir = true;
				break;
			}
			
			if (files != columnes) {
				System.out.println("La quantitat de columnes i files cal"
						+ " que siguin iguals!\nTorna-hi! ");
			} 
		} while (files != columnes);
		
		
		if (!volSortir) {
			System.out.print("Com vols la diagonal (A si diagonal\n d'adalt a"
				+ "abaix o B si diagonal d'abaix a adalt");
		
			direccio = teclat.next().charAt(0);
			int matriu[][]= new int[files][columnes];
			
			if (direccio=='A') {
				// for per introduir dades
				for (int i=0; i<matriu.length;i++) {  // for per recorrer les files
					for (int j=0; j<matriu[i].length;j++) {   // for per recorrer les columnes
						if (i==j) {
							matriu[i][j]=1;	
						} else {
							matriu[i][j]=0;
						}
					}
					System.out.println();
				}
			} else  {
				// for per introduir dades
				for (int i=0; i<matriu.length;i++) {  // for per recorrer les files
					for (int j=0; j<matriu[i].length;j++) {   // for per recorrer les columnes
						if (i+j==files-1) {
							matriu[i][j]=1;	
						} else {
							matriu[i][j]=0;
						}
					}
					System.out.println();
				} 
			}	
			// for per mostrar les dades
			System.out.println("Mostra la matriu");
			for (int i=0; i<matriu.length;i++) {  // for per recorrer les files
				for (int j=0; j<matriu[i].length;j++) {   // for per recorrer les columnes
					System.out.print(matriu[i][j] + " ");
				}
				System.out.println();
			}	
					}  // FINAL (!volSortir)
		System.out.print("\nFINAL!");
	teclat.close();
	}
}
