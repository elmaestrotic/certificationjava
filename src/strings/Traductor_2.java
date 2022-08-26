package strings;

/**
 *
 * @author NARVAEZ
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Traductor_2 {

    static String diccio[] = new String[3];

    public static void main(String[] args) {
        try {
            File f = new File("D:\\words.txt");
            Scanner sc = new Scanner(f);

            int i = 0;
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] details = line.split(",");
                diccio[i] = details[0];
                diccio[i + 1] = details[1];
                i++;

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (String elemento : diccio) {
            System.out.println("La palabra actual es: " + elemento);
        }
    }
}
