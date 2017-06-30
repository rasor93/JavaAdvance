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
public class Estudiante {
    int matricula;
    String nombre;
    static String universidad = "UAS";
    public Estudiante(int m, String n)
    {
        matricula = m;
        nombre = n;
    }
    void show()
    {
        System.out.println(matricula+" "+nombre+" "+universidad);
    }
    public static void main(String[] args) {
        Estudiante s1 = new Estudiante(111,"Fer");
        Estudiante s2 = new Estudiante(112,"jose");
        
        s1.show();
        s2.show();
    }
    
    
}
