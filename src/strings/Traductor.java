package strings;

/**
 *
 * @author NARVAEZ
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Traductor {

    static String diccio[] = new String[10];//{"dios", "god", "te", "you", "ama", "loves"};  //temp=temp.replaceAll("[\n\r]","");
    static String traducida = "";
    static int opcion = 0;

    public static void main(String[] args) throws FileNotFoundException {
        int i = 0; String temp="";
        Scanner sc = new Scanner(new File("D:\\words.txt")); //new Scanner(new File("esnumbers.txt"));
        // Scanner sc = new Scanner("amor,love,inglés,english,oso,bear");
        sc.useDelimiter("[,\\s]");
        while (sc.hasNext()) {// mientras haya una línea de texto
            diccio[i++] = sc.next();
        }

        for (String elemento : diccio) {
            System.out.println(elemento);
        }
        leerFrase();
    }
    
 static void leerFrase(){
        System.out.println("Elija una opción  para escribir la frase\n 1: Español \n 2. Inglés");
        Scanner lector = new Scanner(System.in);
        opcion = lector.nextInt();
 String peaje = lector.nextLine();// Esta línea debe de ir para evitar que nextline nos ignore la frase, asi peaje no se use

        System.out.println("Digite una frase  para traducir");
        String frase = lector.nextLine();// leemos la frase a traducir

        String[] palabras = frase.split(" ");// delimitador el espacio
        for (String palabra : palabras) {
            traducir(palabra);
        }

        System.out.println(traducida);
    }

    static void traducir(String palabra) {

        for (int i = 0; i < diccio.length; i++) {
            if (opcion == 1) {
                if (diccio[i].equals(palabra)) {
                    traducida += diccio[i + 1] + " ";
                }
            } else if (opcion == 2) {

                if (diccio[i].equals(palabra)) {
                    traducida += diccio[i - 1] + " ";
                }

            }
        }
    }
}
