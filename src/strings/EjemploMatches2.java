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
public class EjemploMatches2 {
  public static void main(String[] args) {
  
   String str1 = "Collection of tutorials";
   String str2 = "Consists of different tutorials";

   /* matches characters from index 14 in str1 to characters from
   index 22 in str2 considering same case of the letters */
   boolean match1 = str1.regionMatches(14, str2, 22, 9);
   System.out.println("region matched = " + match1);
    
   /* considering different case, "true" is set which will ignore
   case when matched */
   str2 = "Consists of different Tutorials";
   match1 = str1.regionMatches(true, 14, str2, 22, 9); 
   System.out.println("region matched = " + match1);   
   }
}  

