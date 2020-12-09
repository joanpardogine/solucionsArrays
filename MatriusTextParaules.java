import java.util.Arrays;

public class MatriusTextParaules {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String arrayInicial[] = new String[6];

    int comptador;
    
    arrayInicial[0]="En un lugar de la Mancha, de cuyo nombre no quiero acordarme";
    arrayInicial[1]="no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero";
    arrayInicial[2]="adarga antigua, rocín flaco y galgo corredor.";
    arrayInicial[3]="Una olla de algo más vaca que carnero, salpicón las más noches";
    arrayInicial[4]="duelos y quebrantos los sábados, lantejas los viernes, algún palomino";
    arrayInicial[5]="de añadidura los domingos, consumían las tres partes de su hacienda.";

    System.out.println( "ABANS!");
    
    for (comptador = 0; comptador < arrayInicial.length; comptador++) {
        System.out.println( "La cadena de la posició " + 
      		  comptador + " és " + 
      		  arrayInicial[comptador] );  
      }    
    
    Arrays.sort(arrayInicial);
    
    System.out.println( "DESPRES!");
    
    for (comptador = 0; comptador < arrayInicial.length; comptador++) {
      System.out.println( "La cadena de la posició " + 
    		  comptador + " és " + 
    		  arrayInicial[comptador] ); 
    }
   }
}
