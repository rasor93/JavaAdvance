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
public class PolimorfismoT {
    public static void main(String[] args) {
        Animal a;
        a= new Animal();
        a.eat();
        a= new Dog();
        a.eat();
        a=new Cachorro();
        a.eat();
    }
}
