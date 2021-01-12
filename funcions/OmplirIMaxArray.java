import java.util.Scanner;

public class OmplirIMaxArray {
/* *Dissenyar dues funcions:
omplir_taula(): funció per omplir una taula (array)
de n elements. Els paràmetres que rebrà la funció són
la taula (array) a omplir i un enter que és el nombre
d'elements. La funció no retorna res.
maxim_taula(): funció que calculi i retorni el nombre
més gran (màxim). El paràmetre que rebrà la funció és
la taula (array). I retornarà el màxim (el nombre més
 gran) de la taula que li hem passat.
  */
	public static void omplir_taula(int[] arrayRebut, int nombreElements) {
		for (int i=0; i<nombreElements; i++) {
			arrayRebut[i]=i*2;
		}
	}  // FINAL public static void omplir_taula(int [] arrayRebut)
	

	public static int maxim_taula(int [] arrayRebut) {
		int valorMaxim;
		valorMaxim = 0;
		for (int j=0; j<arrayRebut.length; j++) {
			if(arrayRebut[j]>valorMaxim) {
				valorMaxim = arrayRebut[j];
			}
		}
		
		return valorMaxim;
	}  // FINAL public static int maxim_taula(int [] arrayRebut)

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclat = new Scanner(System.in);
		int midaTaula, valorMaxTaula;
		
		System.out.print("Escriu la mida de la taula: ");
		midaTaula = teclat.nextInt();
		
		int[] taulaAOmplir = new int[midaTaula];
		omplir_taula(taulaAOmplir, midaTaula);
	
		valorMaxTaula = maxim_taula(taulaAOmplir);
		
		System.out.print("El valor màxim de la taula és: " + valorMaxTaula);
		
		teclat.close();
	} // FINAL public static void main(String[] args)
	
	

}
