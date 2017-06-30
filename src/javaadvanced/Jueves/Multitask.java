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
public class Multitask extends Thread{
    public void run(){
        System.out.println("Tarea uno");
    }
    public static void main(String[] args) {
        Multitask t1= new Multitask();
        Multitask t2= new Multitask();
        Multitask t3= new Multitask();
    }
}
class M implements Runnable{
    @Override
    public void run(){
        System.out.println("Tarae uno");
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new M());
        Thread t2 = new Thread(new M());
        trueM t1m = new trueM(),t2m=new trueM();
        t1m.start();
         t2m.start();
        t1.start();
        t2.start();
    }
}
class trueM extends Thread{
    public void run(){
        System.out.println("tarea b");
    }
}