package strings;

import java.io.*;
import java.util.StringTokenizer;
import java.util.logging.*;

public class EjTokenizer {

    public static void main(String[] args) {
//permite crear un archivo en disco, ojo si no escriben ninja está malo
        File archivo = new File("D:/ninja.txt");

        try {
// creamos un object de la class FileWriter y le pasamos como parametro el archivo(objeto File anterior)
            FileWriter fw = new FileWriter(archivo);
//Escribimos en Buffer con un objeto de esta clase y le pasamos como parametro un objecto de la clase FileWriter
            BufferedWriter bw = new BufferedWriter(fw);

            String cadena = " Yo, soy, ninja";

            bw.write(cadena);
            bw.close();

        StringTokenizer token=new StringTokenizer(cadena,",");
        cadena="";//limpiamos la cadena
        while(token.hasMoreTokens()){//mientras haya un token válido 
            
        cadena+=token.nextToken();// lo acumulamos en cadena
            
            }//fin while
           
        System.out.println(cadena);//mostramos cadena
        
            
        } catch (IOException ex) {
            Logger.getLogger(EjTokenizer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
