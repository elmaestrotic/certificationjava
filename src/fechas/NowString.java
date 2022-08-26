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
import java.text.*;

public class NowString {

    public static void main(String[] args) {
        Date now = new Date();
        DateFormat df = DateFormat.getDateInstance();
        String s = df.format(now);
        System.out.println("Hoy es " + s);
    }
}
