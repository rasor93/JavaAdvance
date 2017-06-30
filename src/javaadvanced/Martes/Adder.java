/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Martes;

/*firma o signature de un metodo 
es lo que permite distinguir sin ambiguedad a los metodos tanto en la declaracion
como en la invocacion (Emision de mensajes) y contiene 3 elementos:

el valor de retorno (tipo): double
nombre del metodo: pow

en l aherencia ademas de producir una clase nueva basada en una antiguea 
añadiendo caracteristicas adicionales (
especializacion); puedes extender el comportamiento existente de la superclase

si el metodo se defini en la subclase de modo que el nombre, el tipo de retorno
y su lista de parametros coinciden exactamente con algun metodo de la clase 
ancestro, entonces ese nuevo metodo decimos que REDEFINE el comportamiento del 
antiguo.

los metodos con el mismo nombre, pero diferente lista de parametros dentro de la
misma clase se consideran simplemente sobrecargados.
esto provoca que el compilador utilice los argumentos proporcionados en un 
mensaje para determinar cual metodo ha de llamar.

to overload<- sobrecarga
to override <- redefinir(sobremontar)
/to overwrite <-sobreescribir

Override: metodo con la misma signatura en distintas clases (de una jerarquia de
herencia)
overload:metodos con el mismo nombre que la clase y distinta signatura.

reglas para redefinir metodos
1.- el tipo de reorno del metodo redefinido debe ser identico al del metodo que 
redefini.
2.-un metodo redefinido no pude ser menos accesible que un metodo al que redefine.
superclase es publica, el redefinido no pouede ser protected
3.-un metodo redefinido no pude lanzar excepciones diferentes al metodo que redefine

diferencia entre sobrecarga y redefinicion
1.- la sobrecarga (overload) puede codificarse en una sola clase y la redefinicion (override) 
requiere 2 o mas clases
2.- los metodos sobrecargados tienen diferente signatura
3.- los metodos redefinidos tiene la misma signatura.



*/
//sobrecarga
public class Adder {
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a,int b, int c){
        return a+b+c;
    }
    
  
    static int suma (int c,int d){
        return c+d;
    }
    static double suma(double c,double d){
        return c+d;
    }
    public static void main(String[] args) {
        
        System.out.println(Adder.add(111,222));
        System.out.println(Adder.add(111,222,444));
        //2 cambiando el tipo de dato  
        System.out.println(Adder.suma(11,22));
        System.out.println(Adder.suma(15.1,32.2));
        
    }
}
