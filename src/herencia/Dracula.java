package herencia;

import herencia.Vampiro;

public class Dracula extends Vampiro {

    private int colmillos;

    public Dracula(String nombre, int edad, int colmillos) {
       super(nombre, edad); // lo q es del padre  

        this.colmillos = colmillos;// lo mio
    }

    public void hipnotizar() {
        System.out.println("Duermetee...");
    }

    /* @Override
    public void morder() {
        System.out.println("Lleve lo suyo");//muerde como dracula
       super.morder();//muerde como vampiro

    }*/

    public int getColmillos() {
        return colmillos;
    }

}
