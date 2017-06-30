/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Lunes.Poo;

/**
 *
 * @author CC-09
 */
public class Bike 
{
    public static void main(String[] args) {
        MountainBike bici= new MountainBike();
        bici.show();
    }
 
}
class MountainBike
{
    int velocidad;
    String color;

    public int getVelocidad() {
        return velocidad;
    }

    protected boolean setVelocidad(int velocidad) {
        if (velocidad > 0) {
            this.velocidad = velocidad;
            return true;
        } else {
        return false;
        }
    }
           
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
        
    public void show() {
         MountainBike bici= new MountainBike();
         bici.setColor("Azul");
        bici.setVelocidad(6);
         String msg="Soy una bici de montaña";
         msg +="y mi color es: "+bici.getColor();
         msg +="y tengo: "+bici.getVelocidad();
         msg += " velocidades";
         System.out.println(msg);
    }
}
