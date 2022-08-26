/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author asus
 */
// hacemos que nuestra clase herede(extienda) de la clase Thread(hilo),debemos sobrescribir el método "run"
public class HilosSimples extends Thread {
//le declaramos un atributo privado
    private String nombre;

    //El constructor recibira el valor para el atributo nombre cada vez que se crea un objeto
    public HilosSimples(String nombre) {
    //con this le pasamos el valor al atributo nombre, este valor llega como parametro al método constructor    
        this.nombre = nombre;

    }

    //Sobreescribimos el método void de la clase Thread
    public void run() {
        try {
//Generamos un valor x de manera aleatoria en milisegundos
            int x = (int) (Math.random() * 5000);
  //EL valor anterior será lo que dormirá cada hilo de forma aleatoria          
            Thread.sleep(x);
            
            System.out.println("Soy el " + nombre + " y he dormido " + x +" milisegundos");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
         System.out.println("---Hilos con la Clase Thread---");
     //Clase super objeto =new constructor de la clase Hija(parametro para el constructor)   
        Thread h1 = new HilosSimples("Hilo 1");//así no muestra nada  Thread h1 = new Thread("Hilo 1");
        Thread h2 = new Thread("Hilo 2");//Así tampoco muestra nada;
        HilosSimples h3 = new HilosSimples("Hilo 3");//Así también da

        h1.start();// cada hilo arraca con el método start e invoca el método run
        h2.start();// el método run al ser invocado x cada hilo lo pone a dormir de maner aleatoria en milis
        h3.start();//luego el método hilo despertará y nos dira su nombr ey cuanto tiempo durmió
    }

}
