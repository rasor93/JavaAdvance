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
public class testS {

    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
            }
            catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        testS t1 = new testS();
        t1.start();
        
        HiloS t2 = new HiloS();
        Thread th1 = new Thread(t2);
        
        th1.start();
    }

    
}
class HiloS implements Runnable{

    @Override
    public void run() {
    for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(500);
                System.out.println(i);
            }
            catch (InterruptedException ie) {
                ie.printStackTrace();
            }
    }
    
    }
}

