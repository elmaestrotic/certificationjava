package strings;


public class EjemploSplit {

    public static void main(String[] args) {

        String cadena = " Yo,  soy, Ninja";

        String[] ninja = cadena.split(",");

        for (int i = 0; i < ninja.length; i++) {

            System.out.print(ninja[i]);

        }

    }

}
