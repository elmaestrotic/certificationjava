/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package archivos;

import java.io.File;

/**
 *
 * @author asus
 */
public class FileList {
   public static void main(String[] args) {
     String[] files=new String[100];
     File search = new File("D:");
     files=search.list();
     for(String fn : files)
	
	System.out.println("Encontrado  "+ fn);
    }  
}
