import java.util.Scanner;

public class MatriuIdentitatQuadrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int files, columnes;
	    Scanner teclat = new Scanner(System.in);
		
		do {
			System.out.print("Entra la quantitat de files: ");
			files = teclat.nextInt();
			
			System.out.print("Entra la quantitat de columnes: ");
			columnes = teclat.nextInt();
			if (files == 0 || columnes == 0) {
				System.out.println("Veig que vols sortir. Adeu!");
				break;
			}
			
			if (files != columnes) {
				System.out.println("La quantitat de columnes i files cal"
						+ " que siguin iguals!\nTorna-hi! ");
			} 
		} while (files != columnes);
		
		if (files != 0 && columnes != 0) {
			int matriu[][]= new int[files][columnes];
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
			
			
			// for per mostrar les dades
			System.out.println("Mostra la matriu");
			for (int i=0; i<matriu.length;i++) {  // for per recorrer les files
				for (int j=0; j<matriu[i].length;j++) {   // for per recorrer les columnes
					System.out.print("[" + i + "][" + j + "] = " + matriu[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
			// for per mostrar les dades
			System.out.println("Mostra la matriu");
			for (int i=0; i<matriu.length;i++) {  // for per recorrer les files
				for (int j=0; j<matriu[i].length;j++) {   // for per recorrer les columnes
					System.out.print(matriu[i][j] + " ");
				}
				System.out.println();
			}
		}
		teclat.close();
		
	}

}
