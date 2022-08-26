/*
 * Progama para comparar las 3 formas de concatenar:
 * Operdador +
*concat
*StringBuffer con append
 * 
 */

package strings;

public class TestCadenas {
     private static final int cantidadPrueba = 10000;
 
     public static void main(String[] args) {
         concatenacionBString();
         concatenacionConcat();
         concatenacionSuma();
         return;
     }
 
     private static void concatenacionSuma() {
         String resultado = "inicio";
         for (int i = 0; i < cantidadPrueba; i++) {
             resultado += " hola";
         }
     }
 
     private static void concatenacionConcat() {
         String resultado = "inicio";
         for (int i = 0; i < cantidadPrueba; i++) {
             resultado.concat(" hola");
         }
     }
 
     private static void concatenacionBString() {
         StringBuffer resultado = new StringBuffer("inicio");
          for (int i = 0; i < cantidadPrueba; i++) {
             resultado.append(" hola");
         }
     }
}
