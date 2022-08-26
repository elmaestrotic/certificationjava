package interfaces;

public class Ornitorrinco extends Mamifero implements Anfibio,Oviparo, Venenoso{
        
    @Override
    public void respirarBranquial() {
        System.out.println("glu, glu, glu.."); 
    }

    @Override
    public void respirarPulmonar() {
        System.out.println("El aire está muy denso parce..");
    }

    @Override
    public void ponerHuevos(int cant) {
        System.out.println("Coloque "+cant+ " huevitos"); 
    }

    @Override
    public void envenenar() {
        System.out.println("Lleve su ponsoñazo parcero..");
    }
    
}
