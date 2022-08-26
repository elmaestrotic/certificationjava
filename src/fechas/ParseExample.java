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

public class ParseExample {

    public static void main(String[] args) {
        String ds = "November 1, 2012";
        DateFormat df = DateFormat.getDateInstance();
        try {
            Date d = df.parse(ds);
        } catch (ParseException e) {
            System.out.println("Unable to parse " + ds);
        }
    }
}
