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

public class StyleDemo {

    public static void main(String[] args) {
        Date now = new Date();
        DateFormat df = DateFormat.getDateInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
        String s = df.format(now);
        String s1 = df1.format(now);
        String s2 = df2.format(now);
        String s3 = df3.format(now);
        String s4 = df4.format(now);
        System.out.println("(Default) Hoy es:" + s);
        System.out.println("(SHORT)   Hoy es:" + s1);
        System.out.println("(MEDIUM)  Hoy es:" + s2);
        System.out.println("(LONG)    Hoy es:" + s3);
        System.out.println("(FULL)    Hoy es:" + s4);
    }
}
