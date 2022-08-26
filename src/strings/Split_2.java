package strings;

import java.util.Scanner;

public class Split_2 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println(" escriba alguna frase");

        String frase = lector.nextLine();

        String[] aFrase = frase.split(" ");

// En este momento tenemos un array en el que cada elemento es un color.
        for (int i = aFrase.length - 1; i >= 0; i--) {
            System.out.print(aFrase[i]);
        }//fin ciclo
        System.out.println("El arreglo tiene " + aFrase.length + " elementos");

    }
}
