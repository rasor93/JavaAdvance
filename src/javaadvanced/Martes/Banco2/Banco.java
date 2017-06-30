/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Martes.Banco2;

/**
 *
 * @author CC-09
 */
public class Banco {
    double getTasaDeInteres(){
        return 7.3;
    }
}
class BanCoppel extends Banco{
    double getTasaDeInteres(){
        return 9.7;
    }
}
class Bancomer extends Banco{
    double getTasaDeInteres(){
        return 8.7;
    }
}
class HSBC extends Banco{
    double getTasaDeInteres(){
        return 6.7;
    }
}
class TestP{
    public static void main(String[] args) {
        Banco b;
        b=new Bancomer();
        System.out.println("la tasa de interes "+"de bancomer es: "+b.getTasaDeInteres());
        
        b=new HSBC();
        System.out.println("la tasa de interes "+"de HSBC es: "+b.getTasaDeInteres());
        
    }
}

    
