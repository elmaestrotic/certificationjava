
package herencia;

 class FechaJuliana extends Fecha {
     private int numDias;
      public FechaJuliana(int dia, int mes, int anyo) {
          super(dia, mes, anyo);
         // ...;
      }
      
      
      public void escribir(){
          
          super.escribir();
          System.out.println("Días transcurridos: "+ numDias);
          
      }
      
}
