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
public class ThreadP extends Thread{
    public void run(){
        System.out.println("Hilo ejecutando: "+ 
                Thread.currentThread().getName());
        System.out.println("La prioridad del Hilo: "+ 
                Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        ThreadP t1= new ThreadP(), t2 =new ThreadP(),
              t3 = new ThreadP();
         
        t1.setPriority(MIN_PRIORITY);  
        t2.setPriority(NORM_PRIORITY);  
        t3.setPriority(MAX_PRIORITY);  
        
        t1.start();
    t2.start();
    t3.start();
    }
}
