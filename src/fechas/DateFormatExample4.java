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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormatExample4 {

    public static void main(String[] args) {
        Date now = new Date();
        String dateString = now.toString();
        System.out.println(" 1. " + dateString);
        SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
        System.out.println(" 3. " + format.format(now));
    }
}
