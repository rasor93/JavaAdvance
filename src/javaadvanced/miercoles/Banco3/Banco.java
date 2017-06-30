/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.miercoles.Banco3;


abstract class Banco {
   abstract int getTasaDeInteres();
}
class HSBC extends Banco{
    int getTasaDeInteres(){
        return 7;
    }
}
class BanCoppel extends Banco{
    @Override
    int getTasaDeInteres(){
        return 9;
    }
}
class Bancomer extends Banco{
    @Override
    int getTasaDeInteres(){
        return 8;
    }
}
class PruebaBanco{
    public static void main(String[] args) {
        Banco b;
        b=new HSBC();
        System.out.println("Tasadeinteres: "+b.getTasaDeInteres());
        
        b=new BanCoppel();
        System.out.println("Tasadeinteres: "+b.getTasaDeInteres());
        
        b=new Bancomer();
        System.out.println("Tasadeinteres: "+b.getTasaDeInteres());
    }
}
