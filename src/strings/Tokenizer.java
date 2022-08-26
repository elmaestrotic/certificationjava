/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class Tokenizer {

    public static void main(String[] args) {
        
        String cadena=" Yo, soy, Ninja";
        // Cargamos un archivo  a un objeot de la clase File  
        File fichero = new File("D:/ninja.txt");
        //creamos un objeto de tipo FileWriter, para poder escribir en el fichero
        //por ello pasamos"fiechero", como parámetro

        try {
            FileWriter fr = new FileWriter(fichero);
             //creamos un objeto de la clase BufferedWriter y le pasamos el objeto fr como parametro
            // esto se necesita para escribir en el buffer     

            BufferedWriter br = new BufferedWriter(fr);
            //escribimos la cadema en el archivo y cerramos el Buffer
            br.write(cadena);
            br.close();
            
            StringTokenizer tokens= new StringTokenizer(cadena);
            cadena="";
            while(tokens.hasMoreTokens()){
                
                cadena+=tokens.nextToken();
                               
            }
            
            System.out.println(cadena);
            
            
            
            

        } catch (IOException ex) {
            Logger.getLogger(Tokenizer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
