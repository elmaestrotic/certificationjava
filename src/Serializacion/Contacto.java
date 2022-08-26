/*
 * Ejemplo de una serialización en java.
 * Este programa utiliza 3 clases: Contacto que será la clase serializable
 * Serializadora, que será la case de los métodos de streams.
 *Y prueba serializadoraque será la clase orquestadora
 */

package Serializacion;

/**
 *
 * @author Alexander NArváez
 */
import java.io.Serializable;
public class Contacto implements Serializable{
    private String nombres;
    private String apellidos;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Contacto(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }


}
