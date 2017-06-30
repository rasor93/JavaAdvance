/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Martes;
/*
sper es una palabra reservada en java como una variable referencia la cual es usada para 
servir de intermediario entre la clase padre y la subclase

usos de super
1.- se puede utilizar para referir la variable de instancia
2.- se puede utilizar para invocar el metodo de la clase padre inmediao
3.- se puede utilizar para invocar al constructor de la clase padre inmediata
*/
 class Animal {
    Animal(){
        System.out.println("he creado el animal");
    }
    String color = "Blanco";
    void eat(){
        System.out.println("Comiendo...");
        
    }
    
}
class Perro extends Animal{
    Perro(){
        super();
        System.out.println("Se ha creado el perro");
        
    }
    void eat(){
        System.out.println("Comiendo...");
        
    }
    void durmiendo(){
        System.out.println("durmiendo...");
        
    }
     void llamar(){
        System.out.println("llamando...");
        
    }
    
  
    
    
    public class SuperTest{
        public  void main(String[] args) {
            Perro p = new Perro();
        }
    }
}
