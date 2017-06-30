/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.viernes.Socket3;

import java.net.InetAddress;

/**
 *
 * @author CC-09
 */
public class InetD {
    public static void main(String[] args) {
        
        try{
            InetAddress ip = InetAddress.getByName("www.oracle.com");
            System.out.println("Nombre del Host: "+ip.getHostName());
            System.out.println("Direccion: "+ip.getHostAddress());
                    
        }catch(Exception e){
            System.out.println("e");
        }
    }

    
}
