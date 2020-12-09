import java.util.Scanner;

public class MatriuTrasposta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int files, columnes, maxElement = 0;
	    Scanner teclat = new Scanner(System.in);
	    
		System.out.print("Entra la quantitat de files: ");
		files = teclat.nextInt();
		
		System.out.print("Entra la quantitat de files: ");
		columnes = teclat.nextInt();
		System.out.println();
		
		int matriu[][]= new int[files][columnes];	
		int matriuTras[][]= new int[columnes][files];
		
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
				matriuTras[j][i]=matriu[i][j];
			}
		}

		// for per mostrar les dades
		System.out.println("Mostra la matriu");
		for (int i=0; i<matriu.length;i++) {  // for per recorrer les files
			for (int j=0; j<matriu[i].length;j++) {   // for per recorrer les columnes
				System.out.print("[" + i + "][" + j + "] = " + matriu[i][j] + " ");
			}
			System.out.println();
		}	
		// for per mostrar les dades
		System.out.println("Mostra la matriuTras");
		for (int i=0; i<matriuTras.length;i++) {  // for per recorrer les files
			for (int j=0; j<matriuTras[i].length;j++) {   // for per recorrer les columnes
				System.out.print("[" + i + "][" + j + "] =" + matriuTras[i][j] + " ");
			}
			System.out.println();
		}	
		teclat.close();
	}

}
