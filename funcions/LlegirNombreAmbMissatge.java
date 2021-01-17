import java.util.Scanner;

public class LlegirNombreAmbMissatge {

	public static int llegirEnterAmbMissatge(String Missatge) {
		int nombreLlegit;
		Scanner teclatIntern = new Scanner(System.in);
		System.out.print(Missatge);
		nombreLlegit = teclatIntern.nextInt();
		teclatIntern.close();
		return nombreLlegit;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroLlegit1, numeroLlegit2;

		numeroLlegit1 = llegirEnterAmbMissatge("Introdueix un nombre: ");
		numeroLlegit2 = llegirEnterAmbMissatge("Introdueix un altre nombre: ");

		System.out.println("El primer nombre que has introduït és: " + numeroLlegit1
				+ "El segon nombre que has introduït és: " + numeroLlegit2);
		}
}
