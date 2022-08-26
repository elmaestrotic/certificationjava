/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package certification;

/**
 *
 * @author asus
 */
public class Pruebas {
    static public  void main (String[] args){
        
        Fecha f= new Fecha();
       // f.dia=30;// esot no es posible porque el atributo día está declarado como privado en la calse Fecha
      f.setDia(30);
      System.out.println("Hoy estamos a : "+f.getDia());
      f.setMes(01);
      System.out.println("del Mes : "+f.getMes());
      f.setAño(2014);
      System.out.println("del Año : "+f.getAño());
     
      System.out.println(f.toString());
      
    }
    
}
