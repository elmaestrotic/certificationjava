

package polimorfismo;

public class TestAnimals {
    public static void main(String[] args) {
        
       Animal piolin= new Pollito();
        
        piolin.expresarse();
        
        piolin = new Vaca();
        
        piolin.expresarse();
        
        piolin= new Perro();
      piolin.expresarse();
    }
}
