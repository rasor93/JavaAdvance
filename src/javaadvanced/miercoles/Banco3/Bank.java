
package javaadvanced.miercoles.Banco3;

public interface Bank {
  void draw();
class Banco1 implements Bank{
    public void draw(){
        System.out.println("Mostrando Bancos");
    }
} 
class BanCoppel implements Bank{
    public void draw(){
        System.out.println("Mostrando Bancoppel");
    }
}
class Banamex implements Bank{
    public void draw(){
        System.out.println("Mostrando Banamex");
    }
}
class Bancos{
    public static void main(String[] args) {
        Bank a,s,d;
        a= new BanCoppel();
        s = new Banco1();
        d = new Banamex();
        s.draw();
        a.draw();
        d.draw();
    }
}
}
