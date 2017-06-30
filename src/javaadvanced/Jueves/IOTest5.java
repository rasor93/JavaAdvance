/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Jueves;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author CC-09
 */
public class IOTest5 {
    public static void main(String[] args) {
        try{
             FileOutputStream fos = new FileOutputStream("C:\\comi1.txt");
        
        BufferedOutputStream bout = new BufferedOutputStream(fos);
        String s = "Soy superman  \n";
        byte[]b= s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fos.close();
            System.out.println("Listo");
        
        
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
