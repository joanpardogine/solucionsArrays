import java.util.*;

public class DecimaltoBinari {
	
	public static String convertDecimaltoBinari(int n) {
		String resultat = "";
		
		while (n>1) {
			resultat = (n%2) +resultat;
			n= n/2;
		}
		resultat = n + resultat;
		return resultat;				
		
	}
	
	public static int convertBinaritoDecimal(String b) {
		int comptador = 0;
		int resultat=0;
		char caracter;
		int pes = b.length()-1;
		while (comptador<b.length()) {
			caracter = b.charAt(comptador);			
			resultat = (int) (resultat +(Integer.parseInt(String.valueOf(caracter))* Math.pow(2, pes)));
			pes--;
			comptador++;
		}
		return resultat;

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclat = new Scanner(System.in);
		System.out.println("Introdueix el número");
		int numero = teclat.nextInt();
		String numbinari = convertDecimaltoBinari(numero);
		System.out.println("El número "+numero+" en binari és "+numbinari);
		System.out.println ("El número " + numbinari+" en decimal és "+convertBinaritoDecimal(numbinari));
		

	}

}