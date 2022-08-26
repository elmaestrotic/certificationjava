package strings;
/**
 *
 * @author Alexánder Narváez
 */
public class Split {

    public static void main(String[] args) {

        /*El método split devuelve un array de String. 
         Es muy útil cuando tenemos un conjunto de elementos 
         separados por comas. Por ejemplo*/
        String colores = "rojo,amarillo,verde,azul,morado,marrón";
        String[] arrayColores = colores.split(",");

// En este momento tenemos un array en el que cada elemento es un color.
        for (int i = 0; i < arrayColores.length; i++) {
            System.out.println(arrayColores[i]);
        }

    }
}
