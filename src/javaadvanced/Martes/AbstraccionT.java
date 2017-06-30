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

abstract class Shape{
    abstract void draw();
}
class Circle extends Shape {
  
    
    void draw(){
        System.out.println("dibijando circulo");
    }
}
public class AbstraccionT extends Circle{
    public static void main(String[] args) {
        Shape s=new AbstraccionT();
        Shape s2= new Circle();
        s.draw();
        s2.draw();
    }
    @Override
    void draw(){
        System.out.println("dibujando");
    }
}
