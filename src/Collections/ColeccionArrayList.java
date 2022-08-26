/*
 * Demostración de la colección de genéricos ArrayList
 */
package Collections;


import java.util.ArrayList;


/**
 * @author Alexander Narváez
 */
public class ColeccionArrayList {

    public static void main(String[] args) {
        // ArrayList<String> elementos = new ArrayList<String>();
        ArrayList<String> elementos = new ArrayList();

        elementos.add("Rojo");//adjunta un elemento a la lista
        elementos.add(0, "Amarillo");//inserta el valor  amarillo en elsubíndice 0

        //encabezado
        System.out.print("Mostrar contenido de la lista con ciclo controlado por contador: ");
        // se muestran los colores(valores) de la lista   
        for (int i = 0; i < elementos.size(); i++) {
           // System.out.printf("%s", elementos.get(i));
             System.out.println(elementos.get(i));
        }

        // ahora mostraremos los valores usando el foreach en el métdo mostrar()
        mostrar(elementos, "\n mostrar elementos de la lista con la instrucción for Mejorada: ");
        elementos.add("Verde");//adjunta un elemento a la lista
        elementos.add("amarillo");//adjunta el elemento "amarillo" al final de la lista
        mostrar(elementos, "Lista con dos nuevo elementos (verde y Amarillo): ");

        elementos.remove("amarillo");//elimina el primer amarillo
        mostrar(elementos, "Eliminar la primera coincidencia de amarillo:  ");

        elementos.remove(1);// elimina el elemento en l subíndice 1
        mostrar(elementos, "Eliminar el segundo elemento de la lista(verde): ");

        //verificar si hay un valor en la lista
        System.out.printf("\"rojo\"%s esta en la lista\n",
                elementos.contains("rojo") ? "" : "no ");

        //muestra el número de elementos de la lista
        System.out.printf("Tamaño: %s\n", elementos.size());
    }//fin del main

    //método que mostrará los elementos del ArrayList en la consola   
    public static void mostrar(ArrayList<String> elementos, String encabezado) {

        System.out.print(encabezado);//mostrar encabezado
        //muestra cada elemento en la lista(elementos)

        for (String elemento : elementos) {
            System.out.printf("%s", elemento);
        }
        System.out.println();//muestra fin de línea

    }//fin del método mostrar

}//fin de la clase

