import java.util.Scanner;

public class NombresRomans {
	// Definició de constants GLOBALS
	static final int I = 1;
	static final int V = 5;
	static final int X = 10;
	static final int L = 50;
	static final int C = 100;
	static final int D = 500;
	static final int M = 1000;

	public static void mostraArrayEnters(int[] arrayAMostrar) {
		for (int i=0; i<arrayAMostrar.length; i++) {
			System.out.println(arrayAMostrar[i]);
		}
	}
	
	public static String llegirCadenaAmbMissatge(String missAMostrar) {
		// Definició varialbes LOCALS
		String cadenaLlegida;
		Scanner teclatCadena = new Scanner(System.in);
		System.out.print(missAMostrar);
		cadenaLlegida = teclatCadena.next();
		teclatCadena.close();
		return cadenaLlegida;
	}

	public static int[] tornaCadenaNumRomans(String cadEnRoma) {
		// Definició varialbes LOCALS
		int[] arrayEnterRoma = new int[cadEnRoma.length()];
		char lletraActual;
		
		for (int i=0; i<cadEnRoma.length(); i++) {
			lletraActual = cadEnRoma.charAt(i);
			switch (lletraActual) {
				case 'I':
					arrayEnterRoma[i]= I;
					break;
				case 'V':
					arrayEnterRoma[i]= V;
					break;
				case 'X':
					arrayEnterRoma[i]= X;
					break;
				case 'L':
					arrayEnterRoma[i]= L;
					break;
				case 'C':
					arrayEnterRoma[i]= C;
					break;
				case 'M':
					arrayEnterRoma[i]= M;
					break;
				case 'D':
					arrayEnterRoma[i]= D;
					break;
				}
		}
		return arrayEnterRoma;
	}
	
	
	public static int converteixRomansADecimal(int[] arrEntersRomans) {
		int nombreARetornar = 0;
		for (int i = 0; i < arrEntersRomans.length; i++ ){
			if (i == 0 || arrEntersRomans[i]<=arrEntersRomans[i-1]) {
				nombreARetornar += arrEntersRomans[i];
			} else {
				nombreARetornar += arrEntersRomans[i] - 2 * arrEntersRomans[i-1];
			}
		}
		return nombreARetornar;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadenaEnRomans;
		int nombreEnArabic = 0;
		int[] arrayEnterRoma;

		String missatgeEntrada = "Entra el nombre en  nombres Romans: ";
		cadenaEnRomans = llegirCadenaAmbMissatge(missatgeEntrada);
	
		arrayEnterRoma = tornaCadenaNumRomans(cadenaEnRomans);
		mostraArrayEnters(arrayEnterRoma);
		
		nombreEnArabic = converteixRomansADecimal(arrayEnterRoma);
		
		/*** 		CCCXXV 325   -   CDXCIX 499  		 */

		System.out.print("El nombre " 
				+ cadenaEnRomans 
				+ " que has entrat\n"
				+ " en nombres Romans és "
				+ nombreEnArabic);

	}

}
