package strings;

import java.io.*;
import java.util.StringTokenizer;
import java.util.logging.*;

public class EjemploToken {

    public static void main(String[] args) {
//Utilizamos la clase File para crear un archivo en disco
        File archivo = new File("D:/ejemplo.txt");
        try {//Se necita para controlar excepciones, como q el archivo no existe, esta bloqueado, etc
//Necesitamos la Clase FileWriter para escribir en el archivo
            FileWriter fw = new FileWriter(archivo);

 //Finalmente escribimos en un Buffe, pasando como paramentro el objeto anterior(fw)           
            BufferedWriter bw = new BufferedWriter(fw);

   //Creamos la pinche cadena con un pinche texto, ojo si no escribe Ninja está malo         
            String cadena = " Yo, soy,                         Ninja";
//Escrimos la cadena en el archivo, por medio del método write del objeto bw
            bw.write(cadena);
            bw.close();//cerramos el objeto que escribe
//Ahora vamos a procesar la cadena en tokens, por ello necesitamos la clase StringTokenizer
//al objeto token le pasamos como parametro la cadena a procesar y el delimitador, en este caso la coma            
            StringTokenizer token = new StringTokenizer(cadena, ",");
            cadena = "";//limpiamos la cadena para escribir de nuevo en ella, pero sin las comas en este caso
            while (token.hasMoreTokens()) {//mientras haya un token válido
//almacenamos cada token procesado en la cadena
                cadena += token.nextToken();
            }//fin dle ciclo
            System.out.println(cadena);//mostramos la pinche cadena

        } catch (IOException ex) {
            Logger.getLogger(EjemploToken.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
