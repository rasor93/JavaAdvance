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
public class Usuario {
    int id;
    String nombre;
    Direccion direccion;
    Usuario(int id, String nombre, Direccion direccion){
        this.id=id;
        this.nombre=nombre;
        this.direccion=direccion;
    }
    void show(){
        System.out.println(id+" "+nombre);
        System.out.println(direccion.ciudad+" \n"+direccion.estado+" \n"+
                direccion.pais);
    }
    public static void main(String[] args) {
        Direccion dir = new Direccion("culiacan","sinaloa","exico");
        Direccion dir2 = new Direccion("culiacan","sinaloa","exico");
        
        Usuario u = new Usuario(111,"adrian",dir);
        Usuario u2 = new Usuario(112,"adrian",dir2);
        
        u.show();
        u2.show();
    }
}
class Direccion{
    String ciudad, estado, pais;
    
    Direccion(){
        
    }
    Direccion (String ciudad,String estado, String pais){
        this.ciudad=ciudad;
        this.estado=estado;
        this.pais=pais;
    }
}