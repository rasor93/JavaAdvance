/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Martes;

/**
existen 3 ipos de polimorfismo
* 1.- primitivo: se implemeta gracias a la sobrecarga de metodos
* 2.- real: se implementa gracias a la redefinicion de metodos
* 3.- Generico: se implementa gracias a las clases gnericas.
* una variable es polimorfica cuando puede referirse a objetos de clases diferentes y en
* consecuencia puede adoptar distintos comportamientos
* 
* el polimorfistmo permite desplegar comportamientos distintos en las subclases de una jerarquia de herencia cuando ellas
* activas metodos con la misma firma o signatura
* 
* ejemplo
* empleado e = new Administrador();
* para manipular al empleado como si fuera administrador e snecesario modelar el tipo de la subclase
* el hecho de que una variable apuntadora a un objeto (tal como la variable e)
* pueda referirse automaticamente a tipos multiples se llaama polimorfismo
* 
 */

class Bike2{
    void run(){
        System.out.println("running");
    }
}
public class Polimorfismo extends Bike2 {
    
    void run(){
        System.out.println("running safety with 60km ");
    }
    public static void main(String[] args) {
        Bike2 b =new Polimorfismo();
        b.run();
    }
}
