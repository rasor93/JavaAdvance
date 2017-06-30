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
public class ThreadD extends Thread{
   public void run(){
       //System.out.println
       if(Thread.currentThread().isDaemon()){
           System.out.println("Tenemos un demonio aqui");
   }
       else{
           System.out.println("Ahno es un hilo de usuario");
       }
   } 
    public static void main(String[] args) {
        ThreadD t1 =new ThreadD(),t2 = new ThreadD(),t3 = new ThreadD();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}
