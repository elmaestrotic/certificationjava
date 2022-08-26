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

public class Flight {

    public static void main(String[] args) {
        GregorianCalendar finDelMundo = new GregorianCalendar(2012, Calendar.DECEMBER, 21);
        Date d = finDelMundo.getTime();
        DateFormat df = DateFormat.getDateInstance();
        String s = df.format(d);
        System.out.println("El fin del mundo llegaría el:" + s);
    }
}
