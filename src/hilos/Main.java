/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hilos;

/**
 *
 * @author Alexander Narváez
 */
public class Main {
    public static void main(String[] args) {
        
    //Clase super objeto =new contructor de la clase Hija(parametro para el constructor)
   Thread hilo1 = new Proceso("proceso_hilo1");
    Proceso hilo2 = new Proceso("proceso_hilo2");
    
   hilo1.start();
   hilo2.start();
}
}