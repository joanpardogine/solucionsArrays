import java.util.Scanner;

public class EnunTornaDoble {

	
	public static int tornaDoble(int nombreRebut) {
		int doble;
		
		doble = nombreRebut * 2;
		return doble;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nombre, nombreDoble;
		Scanner teclat = new Scanner(System.in);
		
		System.out.print("Escriu el nombre del qual vols el doble: ");
		nombre = teclat.nextInt();
		
		nombreDoble = tornaDoble(nombre);
		
		System.out.print("El dobre de " + nombre +
				" és " + nombreDoble);
		
		teclat.close();
	}

}
