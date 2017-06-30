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
public class Student {
   int matricula;
    String nombre;
    static String universidad = "UAS";
    public Student()
    {
        
    } 
    public Student(int matricula,String nombre,String universidad) {
        this.matricula =matricula;
        this.nombre=nombre;
        this.universidad= universidad;
    }
    void.display()
    {
        String msg = "La matricula es: "+matricula;
        msg+="\n el nombre: "+matricula;
        msg+="\n la universidad es: "+universidad;
        System.out.println(msg);
    }
    void mensaje(){
        System.out.println("soy un mensaje");
        this.display();
    }
   
}
