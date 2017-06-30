/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Jueves;

/**
 *
 * @author CC-09
 */
public class Multi extends Thread {
    public static void main(String[] args) {
Thread t1 = new Thread(){
  public void run(){
      System.out.println("tarea uno");
}
    };  
Thread t2 = new Thread(){
    public void run(){
        System.out.println("tarea dos");
    }
};
t1.start();
t2.start();
}        

    
}
