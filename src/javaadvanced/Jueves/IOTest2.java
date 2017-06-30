
package javaadvanced.Jueves;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest2 {
    //archivo txt con varias letras
    public static void main(String[] args) {
        try{
            FileOutputStream fos= new FileOutputStream("C:\\comics.txt");
            
            String s = "voy a derrotarte de un golpe";
            byte b[]= s.getBytes();
            fos.write(b);
            fos.close();
            System.out.println("Magia!!!");
            
        }catch(IOException ioe){
            ioe.printStackTrace();
            
        }
    }
  
}
