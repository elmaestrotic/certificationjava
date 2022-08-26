/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // LinkedList
        List lista1 = new LinkedList();
 
        // Añadimos nodos y creamos un Iterator
        lista1.add("Madrid");
        lista1.add("Sevilla");
        lista1.add("Valencia");
        Iterator iterador = lista1.iterator();
 
        // Recorremos y mostramos la lista
        while (iterador.hasNext()) {
            String elemento = (String) iterador.next();
            System.out.print(elemento + " ");
        }
        System.out.println("--LinkedList--");
 
        // ArrayList
        List lista2 = new ArrayList();
 
        // Añadimos nodos y creamos un Iterator
        lista2.add("Madrid");
        lista2.add("Sevilla");
        lista2.add("Valencia");
        Iterator iterador2 = lista2.iterator();
 
        // Recorremos y mostramos la lista
        while (iterador2.hasNext()) {
            String elemento = (String) iterador2.next();
            System.out.print(elemento + " ");
        }
        System.out.println("--ArrayList--");
    }
}