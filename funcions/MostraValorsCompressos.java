import java.util.Scanner;

public class MostraValorsCompressos {

	private static Scanner teclat;

	public static int llegirEnterAmbMissatge(String Missatge) {
		int nombreLlegit;
		System.out.print(Missatge);
		nombreLlegit = teclat.nextInt();
		return nombreLlegit;
	}
	
	/* Fer una funció que rebrà dos nombres (dos paràmetres)
	 * i escrigui per pantalla tots els nombres compresos
	 * entre els dos nombres rebuts (amb els dos nombres
	 * inclosos). La funció no retorna res.
	 * */
	public static void mostraCompresos(int primerNombre, int segonNombre) {
		System.out.println("Els nombres compressos entre " + primerNombre
				+ " i " + segonNombre + " són:");
		for (int i = primerNombre; i <= segonNombre; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroLlegit1, numeroLlegit2;
		teclat = new Scanner(System.in);

		numeroLlegit1 = llegirEnterAmbMissatge("Introdueix el primer dels nombres: ");
		numeroLlegit2 = llegirEnterAmbMissatge("Introdueix el segon dels nombres: ");

		mostraCompresos(numeroLlegit1, numeroLlegit2);
	}

}
