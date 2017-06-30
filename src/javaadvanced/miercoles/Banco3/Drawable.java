/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.miercoles.Banco3;

/**
 *
 * @author CC-09
*/
public interface Drawable {
   void draw(); 
}
class SuperHeroe implements Drawable {
    public void draw(){
        System.out.println("Dibujando a superman");
    }
}
class SuperVillano implements Drawable {
public void draw(){
    System.out.println("Dibujando Lex  Luthor");
}
}
class Historia {
    public static void main(String[] args) {
        Drawable d,e;
        d= new SuperHeroe();
        e= new SuperVillano();
        
        d.draw();
        e.draw();
    }
}