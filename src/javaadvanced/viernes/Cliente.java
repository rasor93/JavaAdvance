/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.viernes;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;


public class Cliente {
    public static void main(String[] args) {
        try{
            System.out.println("Ventana cliente");
            Socket s = new Socket("localhost",6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
                    
         dout.writeUTF("Hola Servidor");
         dout.flush();
         dout.close();
         s.close();
                    
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
    
}
