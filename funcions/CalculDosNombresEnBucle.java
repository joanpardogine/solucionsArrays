import java.util.Scanner;

public class CalculDosNombresEnBucle {
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
		resultat = num1 + num2;
		return resultat;
	}
	
	public static int resta(int num1, int num2) {
		int resultat;
		resultat = 0;
		resultat = num1 - num2;
		return resultat;
	}
	
	public static int prod(int num1, int num2) {
		int resultat;
		resultat = 0;
		resultat = num1 * num2;
		return resultat;
	}
	
	public static double divi(int num1, int num2) {
		float resultat;
		resultat = 0;
		if (num2==0) {
			resultat = -1;
		} else {
			resultat = num1 / num2;
		}
		return resultat;
	}
	
	public static int modul(int num1, int num2) {
		int resultat;
		resultat = 0;
		resultat = num1 % num2;
		return resultat;
	}
	
	public static double potencia(int num1, int num2) {
		double resultat;
		resultat = 0;
		resultat = Math.pow(num1,num2);
		return resultat;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclat = new Scanner(System.in);
		int nombre1, nombre2, resultat;

		double resDecimal;

		String resText;
		char operacio, seguir;
		
		resultat = 0;
		resDecimal = 0;
		resText = "";
		
		do {
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
				resText = "El resultat de sumar "
				+ nombre1
				+ " i "
				+ nombre2
				+ " és "
				+ resultat;
				break;
				
			case '-':
				resultat = resta(nombre1,nombre2);
				resText = "El resultat de restar "
				+ nombre1
				+ " i "
				+ nombre2
				+ " és "
				+ resultat;
				break;
				
			case '*':
				resultat = prod(nombre1,nombre2);
				resText = "El resultat de multiplicar "
				+ nombre1
				+ " i "
				+ nombre2
				+ " és "
				+ resultat;
				break;
				
			case '/':
				resDecimal = divi(nombre1,nombre2);
				resText = "El resultat de dividir "
				+ nombre1
				+ " i "
				+ nombre2
				+ " és "
				+ resDecimal;
				break;
				
			case '%':
				resultat = modul(nombre1,nombre2);
				resText = "El mòdul (la resta) de dividr "
				+ nombre1
				+ " i "
				+ nombre2
				+ " és "
				+ resultat;
				break;
				
			case '^':
				resDecimal = potencia(nombre1,nombre2);
				resText = "El resultat de elevar "
				+ nombre1
				+ " a "
				+ nombre2
				+ " és "
				+ resDecimal;
				break;
				
			default:
				resultat = -1;
				System.out.print("ERROR!");
				break;
			}
			teclat.close();
			if (resDecimal == -1) {
				System.out.print("La operació no es pot fer!");
			} else {
				System.out.print(resText);
			}
			do {
				System.out.print("Vols tornara fer una operació (S/N)?");
				seguir = Character.toLowerCase(teclat.next().charAt(0));
			} while ((seguir!='n') && (seguir!='s'));
		} while (seguir!='n');
	}

}
