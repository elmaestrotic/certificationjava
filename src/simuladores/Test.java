/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simuladores;

/**
 *
 * @author Alexander
 */
public class Test {
    public static void main(String[] args) {
        new Test().testMethod();
    }
    
    void testMethod(){
        try{
            System.out.println("Java");
            return;
        }
        finally{
            System.exit(0);
            System.out.println("Tiger");
        }
    }
}
