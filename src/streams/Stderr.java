
package streams;

/**
 *
 * @author Alexander Narváez
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;


public class Stderr {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //abrimos el archivo y redireccionamos la salida standard error
       FileOutputStream fos = new FileOutputStream("errores.txt");
        PrintStream stdErr= new  PrintStream(fos);
        System.setErr(stdErr);
        
        int[] arr= new int[5];
        
        for (int i=0; i< 10; i++){
            
            arr[i]=0;
        }
        //cerramos todo
        stdErr.close();
        fos.close();
    }
    
    
}
