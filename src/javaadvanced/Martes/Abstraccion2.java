/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Martes;
abstract class Bici {

    Bici() {
        System.out.println("se crea bici");
    }
abstract void run();
    void changeColor() {
        System.out.println("Color cambiado");
    }
}
class Magistroni extends Bici{
    void run(){
        System.out.println("una bici");
    }
}
public class Abstraccion2 {
    void run(){
        System.out.println("la bici esta corriendo");
    }
    public static void main(String[] args) {
        Bici bici= new Magistroni();
        bici.run();
    }
}
