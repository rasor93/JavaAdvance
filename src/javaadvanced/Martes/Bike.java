/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Martes;

/*constructor de una clase
 */
public class Bike {
   //propiedades del objeto
    int velocidad;
    String color;
    String marca;
    //declaro constructor implicito
    //inmutable cuando su valor no durante la ejecucion del programa
    public Bike(String color,String marca, int velocidad)
    {
        this.velocidad=velocidad;
        this.color=color;
        this.marca=marca;
    }

    public int getVelocidad() { return velocidad; }
    public String getColor() { return color; }
    public String getMarca(){return marca;}
    
    
}
