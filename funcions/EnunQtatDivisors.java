import java.util.Scanner;

public class EnunQtatDivisors {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		int num, contador = 0;
		String missatge = ("Introdueix el"
				+ " número d'elements");
		num = llegirEnterAmbMissatge(missatge);
	
		System.out.print("Numeros primers "
				+ "i divisors de " + num + ": ");
	
		for (int i = 2; i < num; i++) {
			if (DivisorONo(num, i) && NumPrimerONo(i)) {
				System.out.print(i + " ");
				contador++;
			}
		}
		System.out.println();
		System.out.println("Quantitat de numeros"
				+ " primers divisors de " + num 
				+ ": " + contador);
		}
	
		public static int llegirEnterAmbMissatge(String missatgeAMostrar) {
			int i;
			Scanner teclat = new Scanner(System.in);
			System.out.println(missatgeAMostrar);
			i = teclat.nextInt();
			teclat.close();
			return i;
		}
	
		public static boolean DivisorONo(int num, int posibledivisor) {
			boolean divisor = false;
			if (num % posibledivisor == 0) {
				divisor = true;
			}
			return divisor;
		}
	
		public static boolean NumPrimerONo(int num) {
			boolean primer = true;
			if (num < 2) {
				primer = false;
			} else {
				for (int i = 2; i < num; i++) {
					if (num % i == 0) {
						primer = false;
						break;
					}
				}
			}
			return primer;
		}
	}
