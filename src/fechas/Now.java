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
import java.util.*;

public class Now {

    public static void main(String[] args) {

        Date now = new Date();

        long nowLong = now.getTime();

        System.out.println("El valor es: " + nowLong);

    }

}
