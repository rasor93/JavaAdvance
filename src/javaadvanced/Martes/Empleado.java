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
public class Empleado {
    double salario = 40000;
}
class Programador extends Empleado{
    int bono=1000;
    public  void main() {
        Programador p = new Programador();
        System.out.println("El salario del porgramador es: "+p.salario);
        System.out.println("el bono del programador es: "+p.bono);
    }
    void mensaje(){
        System.out.println("soyun programador");
        main();
    }
    class Web extends Programador{
        public  void main(String[] args) {
            Web w = new Web();
           w.mensaje();
        }
    }
}
