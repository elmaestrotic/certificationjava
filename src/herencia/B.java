

package herencia;

public class B extends A{
    public void printNameB(){
        System.out.println("Name-B");
    }
    
     public void printName(){
        System.out.println("Name-B");
    }
     
     public int doit(){/*se sobreesribe este metodo d la base, ojo no se puede cambiar eltipo de retorno, 
         //Ejem: long doit, esto no seria permitido debe ser entero*/
         System.out.println("super doit()");
         return 0;
     }
     
}