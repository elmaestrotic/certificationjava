/*
 * Programa que muestra el funcionamiento de las clases internas
 * Inner Class
 *
 */
package clases;

class Externa {
Lampara miLampara = new Lampara("Globo");// creamos una instancia de la clase Lampara que es una clase externa
Lampara.Bombilla b= miLampara.new Bombilla(125);//con esa instancia creamos otra de la clase Interna: Bombilla
//El código Anterior en una sola Línea:
Lampara.Bombilla b1= new Lampara("Phillips").new Bombilla(100);
//cómo vemos estamos creando una instancia de la clase interna llamada b1
//invocamos el constructor d ela interna luego de invocar el de la externa, ambos constructores reciben parametros
}//fin de la clase Externa

class Lampara {// clase Externa

    private String forma;
    private boolean encendida;
    private Bombilla bom;// variable tipo de la clase interna

    public Lampara(String fm) {//Método constructor de la clase externa
        forma = fm;
    }

    public void cambiarBombilla(int dePot) {
        bom = new Bombilla(dePot);
    }

    public class Bombilla {// Clase interna
        private int potencia;

        public Bombilla(int p) {// Método constructor de la Clase interna
            potencia = p;
        }//fin del método constructor de la inner class
        
    }//fin de la Clase Interna
   
}//fin de la clase externa(envolvente): Lampara



