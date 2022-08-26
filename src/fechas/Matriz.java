

package fechas;

import java.util.Scanner;
public class Matriz {
    public static void main(String[] args) {
        
        Scanner lector= new Scanner(System.in);
        
        int m[][]=new int[3][3];
        
         int valor =0;
       for(int fila =0;fila<m.length; fila++){
           for(int celda=0; celda<m[fila].length; celda++){
               System.out.println("Digite una valor "
                       + "para la celda m["+fila+"]["+celda+"]");
             valor= lector.nextInt();
             m[fila][celda]=valor;  
           }
       }
       
     //recorremos y mostramos la matriz  
       for(int fila =0;fila<m.length; fila++){
           for(int celda=0; celda<m[fila].length; celda++){
               System.out.println("EL valor de la matriz en la posición"
                       + "a["+fila+"]["+celda+"]"+" es :"+m[fila][celda] );
              
               
           }
       } 
        
        
    }
    
}
