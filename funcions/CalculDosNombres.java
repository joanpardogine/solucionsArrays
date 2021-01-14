import java.util.Scanner;

public class CalculDosNombres {
	/*
	 * Escriure un programa que demani dos nombres i
	 * l'operació a realitzar sobre els dos nombres.
	 * En finalitzar, ha de mostrar el resultat de 
	 * l'operació matemàtica realitzada. El primer
	 *  nombre entrat serà el primer operand i el
	 * segon nombre el segon operand. Començat plantejament!
	 * L'operació pot ser:
	 * +   	suma
	 * -   	resta
	 * /	divisió sencera
	 * %	mòdul (residu de la divisió)
	 * *	multiplicació
	 * ^	elevat
	 * Heu de fer una funció per cada operació.
	 * */
	
	public static int suma(int num1, int num2) {
		int resultat;
		resultat = 0;
		
		return resultat;
	}
	
	public static int resta(int num1, int num2) {
		int resultat;
		resultat = 0;
		
		return resultat;
	}
	
	public static int prod(int num1, int num2) {
		int resultat;
		resultat = 0;
		
		return resultat;
	}
	
	public static int divi(int num1, int num2) {
		int resultat;
		resultat = 0;
		
		return resultat;
	}
	
	public static int modul(int num1, int num2) {
		int resultat;
		resultat = 0;
		
		return resultat;
	}
	
	public static int potencia(int num1, int num2) {
		int resultat;
		resultat = 0;
		
		return resultat;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclat = new Scanner(System.in);
		int nombre1, nombre2, resultat;
		char operacio;
		
		System.out.print("Escriu el primer dels nombres: ");
		nombre1 = teclat.nextInt();
		
		System.out.print("Escriu el segon dels nombres: ");
		nombre2 = teclat.nextInt();
		
		System.out.print("Escriu la operació que vols fer" +
				"amb els dos nombres:\n" +
				" +  suma\n" + 
				" -  resta\n" + 
				" /  divisió sencera\n" + 
				" %  mòdul (residu de la divisió)\r\n" + 
				" *  multiplicació\r\n" + 
				" ^  elevat\n");
		operacio = teclat.next().charAt(0);
		
		switch (operacio) {
		case '+':
			resultat = suma(nombre1,nombre2);
			break;
			
		case '-':
			resultat = resta(nombre1,nombre2);
			break;
			
		case '*':
			resultat = prod(nombre1,nombre2);
			break;
			
		case '/':
			resultat = divi(nombre1,nombre2);
			break;
			
		case '%':
			resultat = modul(nombre1,nombre2);
			break;
			
		case '^':
			resultat = potencia(nombre1,nombre2);
			break;
			
		default:
			System.out.print("ERROR!");
			break;
		}
		teclat.close();
	}

}
