/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.viernes.Socket3;

import java.net.MalformedURLException;
import java.net.URL;


public class URLD {
    public static void main(String[] args) {
        try{
        URL url = new URL("https://codigofacilito.com:8080/articulos");
            System.out.println("Protocolo: "+url.getProtocol());
            System.out.println("Host: "+url.getHost());
             System.out.println("Host: "+url.getPort());
             System.out.println("File Name: "+url.getFile());
             
             
        }catch(MalformedURLException mur){
            mur.printStackTrace();
        }
    }
    
}
