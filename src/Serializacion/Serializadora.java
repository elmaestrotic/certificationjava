package Serializacion;

/**
 *
 * @author asus
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Serializadora  {

    private ObjectInputStream lectorDeObjetos;
    private ObjectOutputStream escritorDeObjetos;

    public Object LeerObjetos(String nombreDelArchivo) throws IOException, ClassNotFoundException {
        Object retorno = null;

        try {
            lectorDeObjetos = new ObjectInputStream(new FileInputStream(nombreDelArchivo));
            retorno = lectorDeObjetos.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serializadora.class.getName()).log(Level.SEVERE, null, ex);

        }
        return retorno;
    }

    public void escribirObjetos(Object objeto)  {
        try {
            //Le pasamos como parametro al objeto FileOutPutStream el nombre del archivo donde guardaremos o serializaremos el objeto
            escritorDeObjetos = new ObjectOutputStream(new FileOutputStream("objetos.dat"));
             escritorDeObjetos.writeObject(objeto);
        } catch (IOException ex) {
            Logger.getLogger(Serializadora.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }

}
