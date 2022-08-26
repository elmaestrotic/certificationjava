package polimorfismo;

public class Salsero extends Bailarín {

    Salsero(){
        super("Hector La Voe");//invocamos el constructor de la clase base
    }
    
    
  public void bailar() {//sobreescribimos el método abstracto bailar
        System.out.println("Sonido de las palmeras mi niño...");
    }

    /*public void cantar() {//sobreescribimos el método abstracto cantar
        System.out.println(" Asi es que se canta hp..");
    }*/
}
