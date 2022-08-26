package strings;

import java.util.StringTokenizer;
import java.util.Scanner;

public class _T1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Digite una frase");
        String cadena = lector.nextLine();

        
       
       
        
        StringTokenizer token = new StringTokenizer(cadena);
        cadena = "";//limpiamos la cadena
        while (token.hasMoreTokens()) {//mientras haya un token válido 

            cadena += token.nextToken();// lo acumulamos en cadena

        }//fin while
 //creamos un arreglo para almacenar la cadena
      char pMatriz[][] = new char[cadena.length()][cadena.length()];
        
        char[] aCaracteres = cadena.toCharArray();
        
         for (int f = 0; f < pMatriz.length; f++) {
                for (int c = 0; c < pMatriz.length; c++) {
                    if (f == c) {
                        pMatriz[f][c] = aCaracteres[f];
                        //fin si
                    } else {
                        pMatriz[f][c] = ' ';
                    }//fin del sino
                }//fin for interno

            }//fin del llenado de la diagonal ppal d la matriz
        
            for (int f = 0; f < pMatriz.length; f++) {
                for (int c = 0; c < pMatriz[f].length; c++) {
                    System.out.print(pMatriz[f][c]);

                }
                System.out.println("");
            }//fin del llenado de la matriz
         
         
System.out.println(" La frase " + cadena + " tiene " + cadena.length() + " letras");//mostramos cadena

    }

}
