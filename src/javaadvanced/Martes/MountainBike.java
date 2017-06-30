/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Martes;

/**
 *
 * @author CC-09
 */
public class MountainBike {
    
    public static void main(String[] args) {
       
       // showBici();
    }
   
    public static void showBici(String[] args) {
       Bike b2 = new  Bike("Azul","Magistroni",6);
        System.out.println(b2.getColor());
        System.out.println(b2.getMarca());
        System.out.println(b2.getVelocidad());
    }
}

