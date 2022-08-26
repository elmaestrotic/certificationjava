package practicas;

public class Nodo {
// Creamos los campos del nod: el contenedor(info) y el apuntador (siguiente)

    private String info;
    private String info2;
    Nodo siguiente;
// |  dato   | sgte|

    /*creamos el constructor con los paramétors para recibir los datos de sus
     *campos en el nodo, observemos que gancho es de tipo Nodo*/
    public Nodo(String dato, String dato2, Nodo gancho) {
        this.info = dato;
        this.info2 = dato2;
        this.siguiente = gancho;

    }

    // Método set Para el campo info  
    public String getInfo() {
        return info;
// observemos que String es el tipo de dato que devuelve este método
    }

    // Método set Para el campo info  
    public void setInfo(String info) {
        this.info = info;

    }

    // Método set Para el campo info  
    public String getInfo2() {
        return info2;
// observemos que String es el tipo de dato que devuelve este método
    }

    // Método set Para el campo info  
    public void setInfo2(String info2) {
        this.info2 = info2;

    }

    // Método get Para obtener la información del campo siguiente del nodo
    public Nodo getSiguiente() {
        return siguiente;
// observemos que es  "Nodo", el tipo de dato que devuelve este método        
    }

    // Método set Para el campo siguiente
    public void setSiguiente(Nodo gancho) {
        this.siguiente = gancho;
//observemos que es  "Nodo",  el tipo de dato que recibe como parámetor este método        
    }

}// fin de la clase
