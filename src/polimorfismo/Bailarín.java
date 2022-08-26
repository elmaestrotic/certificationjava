  package polimorfismo;

abstract  public class Bailarín {

    private String nombre;

    public Bailarín(String nombre) {
        this.nombre = nombre;
    }

    public abstract void bailar();

  /*  public void cantar() {
        System.out.println("Presencia y Plata...");
    }*/

    public String getNombre() {
        return nombre;
    }


}
