/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Jueves;

public interface Comic {
void draw();
      class Heroe implements Comic{
           public void draw(){
        System.out.println("soy un heroe");
    }
  }
     class Villano implements Comic{
    public void draw(){
        System.out.println("soy un villano");
    }
} 
     class Historia{
         public static void main(String[] args) {
            Comic h,v;
        h= new Heroe();
        v = new Villano();
       
        h.draw();
        v.draw();
        h.draw(); 
         }
     } 
}























