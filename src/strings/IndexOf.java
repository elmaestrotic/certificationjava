package strings;

/**
 *
 * @author asus
 */
public class IndexOf {

    public static void main(String[] args) {
        /*  El método indexOf devuelve la primera aparición de una cadena dentro de un String. 
         Si le pasamos dos parámetros el primero será la cadena a buscar y el segundo la posición en la que empezará a buscar.
         El método substring devolverá una subcadena del String, desde la posición de inicio hasta la posición de fin. 
         Si sólo se especifica un parámetro la subcadena contendrá desde la posición de inicio hasta el final de la cadena. 
         Se ve más claro en el siguiente ejemplo:*/

        String colores = "rojo,amarillo,verde,azul,morado,marrón";

        int inicio = colores.indexOf(","); // ,
        int fin = colores.indexOf(",", inicio + 1); //arranca desde la primera coma y busca la sgte + 1 pos  amarillo

        System.out.println(colores.substring(inicio + 1, fin));
        System.out.println(colores.substring(fin + 1));
        
      
     
                
    }

}
