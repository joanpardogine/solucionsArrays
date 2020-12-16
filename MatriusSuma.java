import java.util.Scanner;

public class MatriusSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclat = new Scanner(System.in);
		int files = 0;
		int columnes = 0;

		System.out.print("Escriu el nombre\n"
				+ "de files de la matriu   : ");
		files = teclat.nextInt();
		
		System.out.print("Escriu el nombre\n"
				+ "de columnes de la matriu: ");
		columnes = teclat.nextInt();
		
		int[][] matriuA=new int [files][columnes];
		int[][] matriuB=new int [files][columnes];
		int[][] matriuR=new int [files][columnes];
		
		// for per introduir dades matriuA
		System.out.println("--   matriuA  --");
		for (int i=0; i<matriuA.length; i++) {  // for per recorrer les files
			for (int j=0; j<matriuA[i].length;j++) {   // for per recorrer les columnes
				System.out.print("Entra el valor de la matriuA[" + i + "][" + j + "]= ");
				matriuA[i][j] = teclat.nextInt();
			}
			System.out.println();
		}
		
		System.out.println();
		// for per introduir dades matriuB
		System.out.println("--   matriuB  --");
		for (int i=0; i<matriuB.length; i++) {  // for per recorrer les files
			for (int j=0; j<matriuB[i].length;j++) {   // for per recorrer les columnes
				System.out.print("Entra el valor de la matriuB[" + i + "][" + j + "]= ");
				matriuB[i][j] = teclat.nextInt();
			}
			System.out.println();
		}		
	
		System.out.println();
		// for per crear matriu Suma de matriuA + matriuB
		for (int i=0; i<matriuR.length; i++) {  // for per recorrer les files
			for (int j=0; j<matriuR[i].length;j++) {   // for per recorrer les columnes
				matriuR[i][j] = matriuA[i][j] + matriuB[i][j];
			}
			System.out.println();
		}
		
		
		// for per mostrar la matriuA
		System.out.println("--   matriuA  --");
		for (int i=0; i<matriuA.length;i++) {  // for per recorrer les files
			for (int j=0; j<matriuA[i].length;j++) {   // for per recorrer les columnes
				System.out.print(matriuA[i][j]+ " ");
			}
			System.out.println();
		}	
		System.out.println();
		
		// for per mostrar la matriuB
		System.out.println("--   matriuB  --");
		for (int i=0; i<matriuB.length;i++) {  // for per recorrer les files
			for (int j=0; j<matriuB[i].length;j++) {   // for per recorrer les columnes
				System.out.print(matriuB[i][j]+ " ");
			}
			System.out.println();
		}	
		
		System.out.println();
		// for per mostrar la matriuR
		System.out.println("--   matriuR  --");
		for (int i=0; i<matriuR.length;i++) {  // for per recorrer les files
			for (int j=0; j<matriuR[i].length;j++) {   // for per recorrer les columnes
				System.out.print(matriuR[i][j]+ " ");
			}
			System.out.println();
		}	
		teclat.close();
	}

}
