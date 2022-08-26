package Collections;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListSimple {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList();

        al.add("Lunes");
        al.add(1, "Martes");
        al.add(2, 3);

        for (Object elemento : al) {
            System.out.println(elemento);
        }
        System.out.println(al.contains("Martes"));

        //al.clear();
        // Obtenemos el numero de elementos del ArrayList
        int numElementos = al.size();
        System.out.println("El ArrayList tiene " + numElementos + " elementos");

        Iterator<Object> i = al.iterator();
        while (i.hasNext()) {
            Object elemento = i.next();
            if (elemento.equals("Martes")) {
                i.remove();	// Eliminamos el Elemento que hemos enocntrado con el Iterator
            }
        }
       
     /*   while (i.hasNext()) {
            Object elemento = i.next();
            System.out.println(i.next());

        }*/
        for (Object elemento : al) {
            System.out.println(elemento);
        }
    }

}
