
public class ElsQuatrePrimersEnunciatsDeMatrius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriuA[][] = new int [5][5];
		int matriuB[][] = new int [5][5];
		int matriuC[][] = new int [5][5];
		int matriuD[][] = new int [5][5];
 
		
		//Afegir valors a una matriu
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				matriuA[i][j]=i;
				matriuB[i][j]=i+j;
				matriuC[i][j]=i*2;
				matriuD[i][j]=(i+j)*2;
			}			
		}
		System.out.println("matriuA");		
		//Mostrar valors d'una matriuA
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				if (matriuA[i][j]<10)  {
					System.out.print(" " + matriuA[i][j]+" ");
				} else {
					System.out.print(matriuA[i][j]+" ");
				}
			}
			System.out.println();
		}
		//Mostrar valors d'una matriuA
		System.out.println("matriuB");
		//Mostrar valors d'una matriuB
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				if (matriuB[i][j]<10)  {
					System.out.print(" " + matriuB[i][j]+" ");
				} else {
					System.out.print(matriuB[i][j]+" ");
				}
			}
			System.out.println();
		}
		//Mostrar valors d'una matriuB
		System.out.println("matriuC");
		//Mostrar valors d'una matriuC
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				if (matriuC[i][j]<10)  {
					System.out.print(" " + matriuC[i][j]+" ");
				} else {
					System.out.print(matriuC[i][j]+" ");
				}
			}
			System.out.println();
		}
		//Mostrar valors d'una matriuC
		System.out.println("matriuD");
		//Mostrar valors d'una matriuD
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				if (matriuD[i][j]<10)  {
					System.out.print(" " + matriuD[i][j]+" ");
				} else {
					System.out.print(matriuD[i][j]+" ");
				}
			}
			System.out.println();
		}
		//Mostrar valors d'una matriuD
	}

}
