/*
 * Clase que prueba la serialización de la clase Persona
 */
package Serializacion;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author Alexander Narváez
 */
public class PruebaPersona {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Para Serializar digite 1 "
                + "Para deserializar digite 2");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            serializar();
        } else {
            if (opcion == 2) {
                desSerializar();
            }
        }

    }

    public static void serializar() throws FileNotFoundException, IOException {
        String archivo = "personas.dat";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(archivo));
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(new Persona(10, "Pablo", "23.112.223"));
        oos.writeObject(new Persona(5, "Sophia", "5.112.223"));

        oos.close();
        bos.close();
        System.out.print("Se ha serializado el objeto con éxito!");
    }

    //una variable no estatica no puede ser referenciada desde un contexto estatico
    //por ello los métodos son estaticos y por ello creamos el objeto serio dentro de c/U
    static public void desSerializar() throws IOException, ClassNotFoundException {
        String archivo = "personas.dat";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(archivo));
        ObjectInputStream ois = new ObjectInputStream(bis);
try
{    
        Persona person = (Persona) ois.readObject();
 
        while(true){
            System.out.println(person);
            person = (Persona) ois.readObject();
        }
}    
        catch(IOException ex)
                {
        System.out.println("-EOF-");
                }
       ois.close();
       bis.close();

        /* System.out.println(person.getEdad());
         System.out.println(person.getNombre());
         System.out.println(person.getDni());*/
    
    }
}
