/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author USER
 */
    import java.io.*;
public class EjemploRegionMatches {



   public static void main(String args[]){
      String Str1 = new String("El amor todo lo puede");
      String Str2 = new String("El amor");
      String Str3 = new String("EL AMOR");

      System.out.print("Return Value :" );
      System.out.println(Str1.regionMatches(0, Str2, 0, 7));

      System.out.print("Return Value :" );
      System.out.println(Str1.regionMatches(11, Str3, 0, 9));

      System.out.print("Return Value :" );
      //Acáignora si es mayuscaula o minuscula, si son los mismos caracteres devuelve verdadero
      System.out.println(Str1.regionMatches(true,0, Str3, 0, 7));
   }
}
    

