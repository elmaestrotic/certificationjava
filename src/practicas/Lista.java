package practicas;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Esta clase contendrá los métodos para trabajar con nodos como: insertar,
 * eliminar, buscar, etc
 *
 * @author Alexánder Narváez
 */
public class Lista {

    Nodo inicio;//declaro nodo inicial
    Nodo fin;//declaro nodo final

    
     private String usuario, res;
//constructor de la clase
    public Lista() {
        inicio = null;
        fin = null;
        /*observar que apuntan a null porque cuando se crea una lista solo hay un nodo
         despues de ese nodo no hay nada, por ello inicio y in apuntan a null, porque
         es el primer bloque, se acaba de crear la lista y sólo hay un elemento
         */

    }

    //Método que insertará un nuevo nodo al inicio de la lista
    public void insertarInicio(String info, String info2) {
        //Creamos entonces el nodo que irá al inicio
        //Observemos que pasamos inicio que es de tipo Nodo como segundo parámetro,es decir para que nuevo apunte al inicio
        Nodo nuevo = new Nodo(info, info2,inicio);//info es el primer parámetro es String

        inicio = nuevo;//hacemos una asignación, el nuevo nodo va a ser el inicio de la lista
        if (fin == null) {//preguntamos q si el último nodo es igual a null entonces
            fin = inicio;//el nodo final sera igual al inicio
        }

    }

    //Método que insertará un nueov nodo al fina de la lista
    public void insertarFinal(String info, String info2) {
        //Creamos entonces el nodo que irá al inicio
        //Observemos que pasamos inicio que es de tipo Nodo como segundo parámetro
        Nodo nuevo = new Nodo(info,info2, null);//null porq el último nodo tiene que apuntar a null

        if (inicio == null) {//si la lista se acaba de crear, ya q solo es null cuando recien se crea la lista
            fin = nuevo;//el nodo final sera igual al nuevo nodo
            inicio = fin;// como se acaba de crear la lista los 2 están en el mismo lugar(sólo hay un nodo)
        } else {// pero en caso de que la lista ya contenga algunos elementos
            fin.setSiguiente(nuevo);//entoces enviamos el nuevo nodo a continuación del fin como gancho de este
            fin = nuevo;//el nuevo nodo se ubica al final, fin = nodo;
        }

    }

    public void eliminarInicio() {
        inicio = inicio.siguiente;
        //simplemente con esta instrucción saltamos directo al siguiente nodo ignorando la cabeza
    }

    public String extraerInicio() {
        String info = inicio.getInfo();
        inicio = inicio.getSiguiente();//esta linea reemplaza inicio con siguiente, es decir lo elimina
        if (inicio == null) {//si la lista se acaba de crear
            fin = null;
        }
        return info;
    }

    public int encontrarNodo(String buscado) {
        boolean encontrado=false;
        int c=1;
        Nodo temp = inicio;//guardamos el nodo cabecera en temp al iniciara
        while (temp != null) {//mientras haya informaicón válida en el nodo
            if (temp.getInfo().equals(buscado)) {
                System.out.println(" Se ha encontrado " + temp.getInfo());
                encontrado=true;
                 return c;
            }
                       
            temp = temp.siguiente;//avanzamos al siguient enodo y lo cargamos en temp
            c++;
            }
        if (encontrado)
            System.out.println("Parcero esa vuelta no se halló en esta lista, mi niño");
        return c;
    }

    public int encontrarNodo2(String buscado1, String buscado2) {
        boolean encontrado=false;
        int c=1;
        Nodo temp = inicio;//guardamos el nodo cabecera en temp al iniciara
        while (temp != null) {//mientras haya informaicón válida en el nodo
            if ((temp.getInfo().equals(buscado1))&& (temp.getInfo2().equals(buscado2))) {
                System.out.println(" Se ha encontrado " + temp.getInfo());
                encontrado=true;
                 return c;
            }
                       
            temp = temp.siguiente;//avanzamos al siguient enodo y lo cargamos en temp
            c++;
            }
        if (encontrado)
            System.out.println("Parcero esa vuelta no se halló en esta lista, mi niño");
        return c;
    }
    
    
     public void validarUsuario(String user, String clave, int intentos) {
        // public void validarUsuario(String datos[], String user, String clave, int intentos) {
        boolean encontrado = false;
        Nodo temp = inicio;//guardamos el nodo cabecera en temp al iniciara
        while (temp != null) {//mientras haya informaicón válida en el nodo
            if ((temp.getInfo().equals(user)) &&(temp.getInfo2().equals(clave))) {
                res = "bienvenido " + user;
                javax.swing.JOptionPane.showMessageDialog(null, res);
                System.out.println(" Se ha encontrado " + temp.getInfo() + " clave: " + temp.getInfo());
                encontrado = true;
                // return c;
            }

            temp = temp.siguiente;//avanzamos al siguiente nodo y lo cargamos en temp

        }
    

        if (encontrado == false) {
            res = "clave y/o usuario erroneos van " + intentos + " fallidos";
            javax.swing.JOptionPane.showMessageDialog(null, res);
        }
        if (intentos > 2) {
            javax.swing.JOptionPane.showMessageDialog(null, " 3 intentos fallidos, chao");
            System.exit(0);
        }
    }
    
    
    
    
    
    //a-b-c-d
    //temp=a
    public void listar() {
        Nodo temp = inicio;//guardamos el nodo cabecera en temp al iniciara
        while (temp != null) {//mientras haya informaicón válida en el nodo
            System.out.println("usuario: " +temp.getInfo()+  " clave: "+temp.getInfo2());//cargamos la info del nodo actual en temp
            temp = temp.siguiente;//avanzamos al siguiente nodo y lo cargamos en temp
        }

    }
    
    
     private static void ordenarEmpleados(String tipOrden, List<Empleado> empList) {
    if ("1".equals(tipOrden)) {
      Collections.sort(empList, new Comparator<Empleado>() {
        @Override
        public int compare(Empleado e1, Empleado e2) {
          // toUpperCase() se convierte a mayusculas para que no importe el case
          return e1.getApellido().toUpperCase().compareTo(e2.getApellido().toUpperCase());
        }
      });
    } else {
      Collections.sort(empList, new Comparator<Empleado>() {
        @Override
        public int compare(Empleado e1, Empleado e2) {
          // toUpperCase() se convierte a mayusculas para que no importe el case
          return e1.getTipoContrato().toUpperCase().compareTo(e2.getTipoContrato().toUpperCase());
        }
      });
    }
  }
    
    

}
