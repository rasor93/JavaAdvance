/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.viernes;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author CC-09
 */
public class Servidor {
    public static void main(String[] args) throws IOException{
       System.out.println("Ventana servidor");
       ServerSocket ss = new ServerSocket(6666);
       Socket s = ss.accept();
       
       DataInputStream dis = new DataInputStream(s.getInputStream());
       String str = (String)dis.readUTF();
        System.out.println("mensaje: "+str);
        
        s.close();
        ss.close();
       
    }
}
