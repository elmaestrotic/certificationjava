package polimorfismo;

public class Ppal {

    public static void main(String[] args) {

        Bailarín querubín = new Salsero();

        querubín.bailar();

        querubín = new Merenguero();
        querubín.bailar();

        

    }

}
