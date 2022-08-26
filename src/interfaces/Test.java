package interfaces;

public class Test {
    
    public static void main(String[] args) {
        Ornitorrinco perry=new Ornitorrinco();
        perry.mamar();
        perry.ponerHuevos(3);
        perry.envenenar();
        perry.respirarPulmonar();
       
        Oviparo x;//se declara de la interface oviparo
        x= new Ornitorrinco();//se intancia de una clase
        x.ponerHuevos(5);
    }
 
}
