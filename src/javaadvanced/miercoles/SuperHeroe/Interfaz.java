/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.miercoles.SuperHeroe;

/**
una interface en java es un modelo de una clase  tiene constantes estaticas y
* metodos abstractos es un mecanismo para lograr la abstraccion, solo puede 
* contener metodos abstrctos que carezcan de implementacion. 
* tambien permite la simulacion de herencia multiple, representa una relacion IS-A
* no se puede instanciar... como las clases abstractas
* 
* por que utilizar interfaces?
* para lograr la abstraccion
* por interface podemos solimular la herencia multiple
* para lograr un bajo acoplamiento
* 
* a parir de Java 8, la interface contiene metodos predeterminados y estaticos
* 
*/
interface Mostrar{
    //que hace
    void show();
}

public class Interfaz implements Mostrar {

    @Override
    public void show() {
        System.out.println("Hola");
    }
    public static void main(String[] args) {
        Interfaz i = new Interfaz();
        i.show();
    }
}
