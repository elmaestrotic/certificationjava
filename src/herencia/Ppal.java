package herencia;

public class Ppal {
    public static void main(String[] args) {
        Dracula oto=new Dracula("Vladimir", 666,10);
        
        System.out.println("Hola mi nombre es: "+oto.getName()+ 
                " y Tengo "+ oto.getEdad()+" años de edad");
        
        
        Vampiro cortes= new Vampiro("Santiago",17);
        
        
        oto.aguantarSol();
        oto.hipnotizar();
        //System.out.println("Acá van estos "+
               // oto.getColmillos()+ " centimetros de muelas ");     
        
        oto.morder();
        oto.chuparSangre();
        Vampiro otro= new Vampiro("Otto",2666);
        otro.aguantarSol();
        
        
        
        Vampiro otto = new Vampiro("Aurelio",1666);
     
        System.out.println("Hola mi nombre es: "+otto.getName()+ 
                " y Tengo "+ otto.getEdad()+" años de edad");
           
        otto.aguantarSol();
       
        
    }
    
}
