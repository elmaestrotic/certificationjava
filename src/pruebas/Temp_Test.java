package pruebas;
/**
 * 
 * @author asus
 * Progrmaa que muestra el uso de etiquetas(labels) en java
 */

public class Temp_Test {

    public static void main(String[] args) {

        int k = 2;
        outer://eqtiqueta outer es similar a goto en vb
        while (true) {
            ++k;
            inner:// etiqueta inner
            for (int j = 6; j > 2; j--) {
                k = 8 - j;
                if (j == 3) {
                    continue inner;//indica que debe continuar en la etiqueta "inner"
                }
                break outer;//indica que debe continuar en la etiqueta "outer"
            }
            continue outer;//indica que debe continuar en la etiqueta "outer"
        }

        System.out.println(k);
    }
}
