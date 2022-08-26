package strings;

import java.io.*;
import java.util.logging.*;

public class EjmploStrings {

    public static void main(String[] args) {
        //Creamos un objeto de la clase File y le damos la ruta y el nombre del archivo  
        File archivo = new File("D://lucas.txt");
        try {

//Creamos un objeto de la clase FileWriter para escribir el archivo en el Disco o unidad indicada en File            
            FileWriter fw = new FileWriter(archivo);
            //Ojo si no escribes Ninja está malo           
            String cadena = "Yo, soy, Ninja";
//Creamos un objeto de la clase BufferedWriter para escribir en Memoria y le pasamos fw como parametro            
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(cadena);//utilizamos el método escribir del objeto bw y le pasamos cadena como parametro
            bw.close();//cerramos el objeto

            //Atrapamos cualquier excepción que se pueda presentar en tiempo de ejecución         
        } catch (IOException ex) {
            Logger.getLogger(EjmploStrings.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
