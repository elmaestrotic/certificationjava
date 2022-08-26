
package Serializacion;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 *
 * @author ALexander Narváez
 */

//import java.io.Serializable;//interfaz serializable
public class PruebaSerializadora {
// Serializadora  serio= new Serializadora();

    public static void Main(String[] args) throws IOException, ClassNotFoundException {
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

    public static void serializar() {
        Contacto contact = new Contacto("Alexander", "Narváez");
        //Escribimos el objeto
        Serializadora serio = new Serializadora();
        serio.escribirObjetos(contact);
        System.out.print("Se ha serializado el objeto con éxito!");
    }
       //una variable no estatica no puede ser referenciada desde un contexto estatico
    //por ello los métodos son estaticos y por ello creamos el objeto serio dentro de c/U
    static public void desSerializar() throws IOException, ClassNotFoundException {
        Contacto contact = null;
        Serializadora serio = new Serializadora();
        contact = (Contacto) serio.LeerObjetos("objetos.dat");
        System.out.println(contact.getNombres());
        System.out.println(contact.getApellidos());
    }
}
