/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.miercoles.SuperHeroe;

/**
 Hilo; Subproceso ligero, unidad pequeña d procesamiento. es una via de
 * ejecucuion separada.
 * los hilos son independientes
 * 1.- no bloqueamos al usuario por que son tareas al mismo tiempo
 * 2.- podemos realizar muchas tareas simultaneamente ahorrando tiempo
 * 3.- los hilos al ser independientes no se afectan entre si, en caso de ocurrir, 
 * una excepcion en un hilo los demas funcionan igual
 * 
 * multitarea: proceso de ejecucion de muchas tareas simultaneamente.
 * usamos la multitarea en el CPU, se logra de dos maneras:
 * 1.-multitarea basada en procesos(multiprocesos)
 *  cada proceso tiene su propia direccion en memoria, es decir, cada proceo asigna un
 * area de memoria separada.
 * 
 * paralelismo: multihilos
 * ciclo de vida de un hilo 
 * un hilo puede encontrarse en uno de sus 5 estados....
 * de acuerdo con oracle solo hay 4 ciclos ejecutables.
 * 1.- New :
 * 2.-
 * 3.-Running: el hilo esta aqui cuando el TS lo ha seleccionado
 * 4.-Non-Runnable: (Blocked): es el estado cuando el hilo sigue activo, sin embargo no 
 * es apto para ejecutarse
 * 5.- terminated, es el estado cuando el hilo ha finalizado cuando sale del metodrun()
 * hay 2 formas de crear un hilo
 * 1.- al extender de la clase thread
 * 2.-al implementar la interface runnable
 
 * clase Thread
 * proporciona los constructores y metodos para crear y realizar operaciones en un hilo.
 * la clase Thread se extiend de la clase Object e implementa la interface runnable
 * 
 * constructores comunes de la clase Thread
 * 
 * Runnable
 *  la interface runnable debe ser implementada por cualquier clase cuyas instancias
 * esten destinada a ser ejecutadas por hilos
 */
public class HilosF extends Thread{
    @Override
    public void run(){
        System.out.println("El hilo esta corriendo");
    }
    public static void main(String[] args) {
        HilosF hilo = new HilosF();
        hilo.start(); 
        // Thread thread = new Thread(hilo);
    }
}

// ejemplo de runnable
class Hilos implements Runnable{

    @Override
    public void run() {
        System.out.println("El hilo de runnable esta "+"corriendo");
    }
    public static void main(String[] args) {
        Hilos h = new Hilos();
        Thread t = new Thread(h);
        t.start();
    }
}