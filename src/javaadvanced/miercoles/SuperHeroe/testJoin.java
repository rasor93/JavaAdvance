/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.miercoles.SuperHeroe;

/**
 *
 * @author CC-09
 */
public class testJoin extends Thread{
    public void run(){
        for(int i=1;i<=5; i++){
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException ie){
                System.out.println(ie);
            }
            System.out.println(i);
        }
          
                
    }
}
