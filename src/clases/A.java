package clases;

class A {

    private String valora = "A";

    public void setValora(String valora) {
        this.valora = valora;
    }

}

class B extends A {

    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    class C {

        private String valorC = String.valueOf(edad);

        public String getValorC() {
            edad = 2;
            return valorC;
        }

        public void setValorC(String valorC) {
            this.valorC = valorC;
        }
    }

    class D extends C {
    }
}

class E {

    public static void main(String arg[]) {
//creamos un objeto de la clase Externa 
        B objB = new B();
//Para crear un objeto de la clase interna utilizamos la instancia 
//de la clase externa .(punto) nombre de la clase interna 
//Luego el nombre del objeto la palabra new y el Contructor de la Interna
        B.C objC = objB.new C();
//el codigo anterior en una sola linea 
        B.C objc = new B().new C();
    }
}
