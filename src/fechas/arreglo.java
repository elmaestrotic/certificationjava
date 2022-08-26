/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fechas;
/**
 *
 * @author asus
 */
public class arreglo {
    public static void main(String[] args) {
        int[] a={7,8,10,15,2,25,30};
        int acum=0;int i =0;
        for(; i < a.length;i++){
            acum+=a[i];
                        
        }
        
        System.out.println("posiciones recorridas :"+i);
        System.out.println(" la suma de los valores de las posiciones es: "+ acum);
float prom= acum/i;        
        System.out.println("EL promedio es "+ prom);
        
    }
    
}
