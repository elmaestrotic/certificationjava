package herencia;
public  class Vampiro {
    private String name;
    private int edad;
    
    public Vampiro(String name, int age) {

        this.name = name;
        edad = age;
        
    }

   public  void morder() {
        System.out.println("Aurrggrr... Zuculento..");

    }
    
    public void chuparSangre(){
       System.out.println("Que diabetes tan verraca tenía esta víctima..");
      }
    
   void aguantarSol(){
        System.out.println("Sereno Moreno...");
    }

    public String getName() {
        return name;
    }

    public int getEdad() {
        return edad;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    

  

    
   




   

}
