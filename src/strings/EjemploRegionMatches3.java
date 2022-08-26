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
public class EjemploRegionMatches3 {
  

/*
 * This sample source code shows how to use the regionMatches method of String class
 */


    public static void main(String[] args) {
        String source = "Alexander Narváez";
        String anotherString = "Narváez el Mejor";
        System.out.println(source.regionMatches(10, anotherString, 0, 6));//busque de la cadena1 a partir del indice 10 en la cadena 2 desde le indice 0 hasta el indice 6
        //es decir que va a buscar la palabra Narváez, ya que allí comienza el  indice 10
        System.out.println(source.regionMatches(true,10, anotherString, 0, 6));
    }

}  

