
public class TeoriaNumRomans {

/**
 *  Entra el nombre en Romans: CDXCIX

	static final int I = 1;
	static final int V = 5;
	static final int X = 10;
	static final int L = 50;
	static final int C = 100;
	static final int D = 500;
	static final int M = 1000;

********************************
arrEntersRomans[0] = 100
arrEntersRomans[1] = 500
arrEntersRomans[2] =  10
arrEntersRomans[3] = 100
arrEntersRomans[4] =   1
arrEntersRomans[5] =  10

arrEntersRomans.length = 6

Entra el nombre en Romans: CDXCIX
100 , 500 , 10 , 100 , 1 , 10
*******************************

for (int i = 0; i < arrEntersRomans.length; i++ )
for (int i = 0; i < 6 ; i++ )

x OR y   RES         
F    F     F
V    F     V
F    V     V
V    V     V

********************************
arrEntersRomans[0] = 100
arrEntersRomans[1] = 500
arrEntersRomans[2] =  10
arrEntersRomans[3] = 100
arrEntersRomans[4] =   1
arrEntersRomans[5] =  10

arrEntersRomans.length = 6

Entra el nombre en Romans: CDXCIX
100 , 500 , 10 , 100 , 1 , 10
*******************************

nombreARetornar = 0

  i=0
      if (i == 0 || arrEntersRomans[i]<=arrEntersRomans[i-1])
      if (i == 0 || arrEntersRomans[0]<=arrEntersRomans[0-1])
      if (i == 0 || 100<=error)
          
          VERITAT

          nombreARetornar = 0
            nombreARetornar += arrEntersRomans[i]
            nombreARetornar = nombreARetornar + arrEntersRomans[i]
            nombreARetornar = nombreARetornar + arrEntersRomans[0]
            nombreARetornar = 0 + 100
          nombreARetornar = 100


********************************
arrEntersRomans[0] = 100
arrEntersRomans[1] = 500
arrEntersRomans[2] =  10
arrEntersRomans[3] = 100
arrEntersRomans[4] =   1
arrEntersRomans[5] =  10

arrEntersRomans.length = 6

Entra el nombre en Romans: CDXCIX
100 , 500 , 10 , 100 , 1 , 10
*******************************

    
  i = 1
      if (i == 0 || arrEntersRomans[i]<=arrEntersRomans[i-1])
      if (1 == 0 || arrEntersRomans[1]<=arrEntersRomans[0])
      if (1 == 0 || 500<=100)
          
          FALS

        nombreARetornar = 100
            nombreARetornar += arrEntersRomans[i] - 2 * arrEntersRomans[i-1];         
            nombreARetornar = nombreARetornar + arrEntersRomans[i] - 2 * arrEntersRomans[i-1];
            nombreARetornar = nombreARetornar + arrEntersRomans[1] - 2 * arrEntersRomans[1-1];
            nombreARetornar = nombreARetornar + arrEntersRomans[1] - 2 * arrEntersRomans[0];
            nombreARetornar =       100       +          500       - 2 *    100;
            nombreARetornar =       100       + (        500       -(2 *    100)  )
            nombreARetornar =       100       + (        500       -(   200    )  )
            nombreARetornar =       100       + (        300                      )
            nombreARetornar =       400
            
        nombreARetornar = 400
    

********************************
arrEntersRomans[0] = 100
arrEntersRomans[1] = 500
arrEntersRomans[2] =  10
arrEntersRomans[3] = 100
arrEntersRomans[4] =   1
arrEntersRomans[5] =  10

arrEntersRomans.length = 6

Entra el nombre en Romans: CDXCIX
100 , 500 , 10 , 100 , 1 , 10
*******************************
  

  i=2
      if (i == 0 || arrEntersRomans[i]<=arrEntersRomans[i-1])
      if (2 == 0 || arrEntersRomans[2]<=arrEntersRomans[2-1])
      if (2 == 0 || 10 <= 500)  VERITAT
      
        nombreARetornar = 400
            nombreARetornar += arrEntersRomans[2]
            nombreARetornar = nombreARetornar + arrEntersRomans[2]
            nombreARetornar =        400      +       10
            nombreARetornar =  410

        nombreARetornar = 410

********************************
arrEntersRomans[0] = 100
arrEntersRomans[1] = 500
arrEntersRomans[2] =  10
arrEntersRomans[3] = 100
arrEntersRomans[4] =   1
arrEntersRomans[5] =  10

arrEntersRomans.length = 6

Entra el nombre en Romans: CDXCIX
100 , 500 , 10 , 100 , 1 , 10
*******************************
      
  i=3
    (i == 0 || arrEntersRomans[i]<=arrEntersRomans[i-1])
    (3 == 0 || arrEntersRomans[3]<=arrEntersRomans[3-1])
    (3 == 0 || arrEntersRomans[3]<=arrEntersRomans[2])
    (1 == 0 || 100 <= 10)  FALS

        nombreARetornar = 410
          nombreARetornar += arrEntersRomans[i] - 2 * arrEntersRomans[i-1];
          nombreARetornar = nombreARetornar + arrEntersRomans[i] -  2 * arrEntersRomans[i-1];
          nombreARetornar = nombreARetornar + arrEntersRomans[3] -  2 * arrEntersRomans[3-1];
          nombreARetornar = nombreARetornar + arrEntersRomans[3] -  2 * arrEntersRomans[2];
          nombreARetornar =      410        +        100         -  2   *  10
          nombreARetornar =      410        +      ( 100         - (2   *  10) )
          nombreARetornar =      410        +      ( 100         - (    20   ) )
          nombreARetornar =      410        +      (          80               )
        nombreARetornar = 490



********************************
arrEntersRomans[0] = 100
arrEntersRomans[1] = 500
arrEntersRomans[2] =  10
arrEntersRomans[3] = 100
arrEntersRomans[4] =   1
arrEntersRomans[5] =  10

arrEntersRomans.length = 6

Entra el nombre en Romans: CDXCIX
100 , 500 , 10 , 100 , 1 , 10
*******************************
  
  i=4

    nombreARetornar = 490
		nombreARetornar += arrEntersRomans[i]
		nombreARetornar = nombreARetornar + arrEntersRomans[4]
		nombreARetornar = 490 + 1
	nombreARetornar = 491

********************************
arrEntersRomans[0] = 100
arrEntersRomans[1] = 500
arrEntersRomans[2] =  10
arrEntersRomans[3] = 100
arrEntersRomans[4] =   1
arrEntersRomans[5] =  10

arrEntersRomans.length = 6

Entra el nombre en Romans: CDXCIX
100 , 500 , 10 , 100 , 1 , 10
*******************************

i= 5
	nombreARetornar=491
        nombreARetornar += arrEntersRomans[i] - 2 * arrEntersRomans[i-1];
		nombreARetornar = nombreARetornar + arrEntersRomans[i] - 2 * arrEntersRomans[i-1];	
		nombreARetornar = nombreARetornar + arrEntersRomans[5] - 2 * arrEntersRomans[5-1];
		nombreARetornar = 491 + 10 - (2 * 1)
		nombreARetornar = 491 + 10 - (2)
		nombreARetornar = 491 + 8

nombreARetornar=499


********************************
arrEntersRomans[0] = 100
arrEntersRomans[1] = 500
arrEntersRomans[2] =  10
arrEntersRomans[3] = 100
arrEntersRomans[4] =   1
arrEntersRomans[5] =  10

arrEntersRomans.length = 6

Entra el nombre en Romans: CDXCIX
100 , 500 , 10 , 100 , 1 , 10
*******************************



i= 5
nombreARetornar=499


I = 6 ATURA El FOR

RESUM
for (int i = 0; i < arrEntersRomans.length; i++ ){
	if (i == 0 || arrEntersRomans[i]<=arrEntersRomans[i-1]) {
		nombreARetornar += arrEntersRomans[i]
		} else {
		nombreARetornar += arrEntersRomans[i] - 2 * arrEntersRomans[i-1];
	}
}

El nombre CDXCIX que has entrat
 en nombres Romans és 499
 * 
 */
	
	
	
	
}
