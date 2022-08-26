

package pruebas;

/**
 *
 * @author asus
 */
import java.util.Scanner;

    public class AssertionsExample{
    public static void main(String[] args) {
      /*  int x = -15;
       // DataAccess da = new DataAccess();
        assert x > 0 : "El valor debe ser positivo";
        System.out.println("Valor positivo x: " + x);*/
              
        Scanner lector = new Scanner(System.in);
        System.out.println("Digite un número entre o y 10");
       int assert=9;
        System.out.println(assert);
        int n= lector.nextInt();
        
        assert ( n >=0 && n<=10): "número no válido " + n;
        System.out.println("Ud digito "+ n);
    }
    }
    
    

    

