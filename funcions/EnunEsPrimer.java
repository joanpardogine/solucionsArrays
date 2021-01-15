import java.util.Scanner;

public class EnunEsPrimer {

	public static boolean comprobacioPrimer(int posiblePrimer) {
        Boolean esPrimer = true;
        if (posiblePrimer<2) {
        	esPrimer = false;
    	} else {
    		for (int x=3; x <= posiblePrimer; x++) {
    			if (posiblePrimer%x==0) {
    				esPrimer = false;
    				break;
			     }
			 }
		}
        return esPrimer;
	}
	
	public static boolean checkprimenum(int numRebut) {
		boolean prime=true;
		for(int j=2;j<numRebut;j++) {
			if(numRebut % j == 0) {
				prime=false;
				break;
			}
		}
		if (numRebut==1) {
			prime=false;
		}
		return prime;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner teclat = new Scanner(System.in);

       boolean esPrimer;
        
       System.out.print("Introdueix un número: ");
       int numero = teclat.nextInt();
       esPrimer = comprobacioPrimer(numero);
       esPrimer = checkprimenum(numero);
       if (esPrimer==false) {
    	   System.out.print("El número " + 
			   		numero + 
			   		" no és primer");
       } else {
           System.out.print("El número " +
    		   		numero +
    		   		" és primer");
       }
       teclat.close();
	}
}

