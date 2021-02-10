/**
 * @(#)J016_4NumRomans.java
 *
 *
 * @author 
 * @version 1.00 2010/2/12
 */
 
import java.util.Scanner;

public class J016_4NumRomans {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
			I II III IV V VI VII VIII IX
			X XX XXX XL L LX LXX LXXX XC
			C CC CCC CD D DC DCC DCCC CM
			M 
			
         */
         
        Scanner teclat=new Scanner(System.in);  
        String text;
        int posicio=0;
        char car1=0,caranterior=0;
        int valordecimal=0,valorresta=0;
        int numero = 0;
        
        System.out.println("Introdueix el text");
        text = teclat.nextLine();
        
        while (posicio <text.length()){
        	car1 = text.charAt(posicio);
        	valorresta=0;

        	if (car1=='I'){
        		valordecimal=1;
        	} else if (car1=='V'){
        		if (caranterior == 'I'){
        			valordecimal=4;
        			valorresta = 1;
        		} else {
        			valordecimal=5;
        		}
        	} else if(car1=='X'){
        		if (caranterior == 'I'){
        			valordecimal=9;
        			valorresta = 1;
        		} else {
        			valordecimal=10;
        		}
        	} else if (car1=='L'){
        		if (caranterior == 'X'){
        			valordecimal=40;
        			valorresta=10;
        		} else {
        			valordecimal=50;
        		}
        	} else if (car1=='C'){
        		if (caranterior == 'X'){
        			valordecimal=90;
        		} else {
        			valordecimal=100;
        		}
        	} else if (car1=='D'){
        		if (caranterior == 'C'){
        			valordecimal=400;
        			valorresta = 100;
        		} else {
        			valordecimal=500;
        		}
        	} else if (car1=='M'){
        		if (caranterior == 'C'){
        			valordecimal=900;
        			valorresta = 100;
        		} else {
        			valordecimal=1000;
        		}
        	}
        	
        	caranterior = car1;
        	numero = numero +valordecimal-valorresta;        		
        	posicio++;	
        }
        System.out.println(numero);
        teclat.close();
    }
}