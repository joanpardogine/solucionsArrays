public class BuscaParaules {

	public static void main(String[] args) {
		char[] lletres = {'f','g','n',
				'p','r','o','g','r','a','m','a','c','i','o',
				'u','u','g','n','p','r',
				'b','a','s','e','d','e','d','a','d','e','s','i','o'};
		String paraula = "programacio";
		//String[] paraules = {"programacio", "basededades"};
		
		String par = "";
		int x = 0, primeraPos, darreraPos;
		boolean trobada;
		
		for (int j=0; j<paraules.length; j++) {
			par = "";
			trobada = false;
			primeraPos = 0;
			darreraPos = 0;
			for (int i = 0; i<lletres.length; i++) {
				if (lletres[i] == paraules[j].charAt(0)) {
					primeraPos = i;
					for (x = 0; x<paraules[j].length();) {
						if(lletres[x+i]== paraules[j].charAt(x)) {
							par = par+paraules[j].charAt(x);
							x++;
							if (x == paraules[j].length()) {
								trobada = true;
								darreraPos = x + i - 1;
							}
						}else {
							par = "";
							break;
						}
					}
				}
				if (trobada == true) { // for (int i = 0; i<lletres.length; i++)
					break;
				}
			}
			if (trobada == true) {
			System.out.println("La paraula " + par + "\ncomença" +
					" a l\'index " + primeraPos + "\ni acaba a l\'index " + 
					darreraPos);
			} else {
				System.out.println("-1 No s'ha trobat la paraula " + paraules[j] );
			}
			System.out.println();
		}
	}

}
