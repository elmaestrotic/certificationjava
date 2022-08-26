package herencia;

public class Fecha {

    private int dia;
    private int mes;
    private int anyo;

    public Fecha(int día, int mes, int anyo) {
        dia = día;
        this.mes = mes;
        this.anyo = anyo;
    }
public Fecha(){
    this(30,01,2014);
}
protected void escribir(){
    System.out.println("\n" + dia+ "/"+mes+"/"+anyo);
}

}
