/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Jueves;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 *
 * @author CC-09
 */
public class IOTest8 {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("C:\\comi1.txt");
        
        FileInputStream fis2 = new FileInputStream("C:\\comi.txt");
        
        FileOutputStream fos = new FileOutputStream("C:\\todos.txt");
        SequenceInputStream sis = new SequenceInputStream(fis,fis2);
        
        
        int i;
        while((i=sis.read())!=-1)
        {
            fos.write(i);
            System.out.print((char)i);
        }
        close(fis,fis2,fos,sis);
       // System.out.println("Ya..");
    }
    
    private static void close(FileInputStream fis,
            FileInputStream fis2,FileOutputStream fos,
            SequenceInputStream sis)throws IOException {
        fis.close();
        fis2.close();
        fos.close();
        sis.close();
    }
    
}
