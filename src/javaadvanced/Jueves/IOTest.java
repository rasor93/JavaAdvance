/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Jueves;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 java I/O
 * entrada y salida
 * 
 * se utilza para procesa la entrada y salida.
 * en java se utiliza el concepto Stream (flujo)
 *  para hacer que las oopciones de E/S sean rapidas.
 * 
 * el paquete java.io contiene todas las clases necesarias
 * para realizar operaciones de entrada y salida.
 * 
 * podemos realizar l manejo de archivos a travez de java I/O API
 * 
 * Stream
 * es un flujo de datos que esta compuesto por byt
 * se llama stream porqeu es como el flujo del agua que sigue corriendo
 * 
 * en java existen 3 stream que se crean para nuestro uso automatico.
 * 1.- System.out: flujo de salida estandar
 * 2.-System.it: flujo de entrada estandar
 * 3.-System.err: Flujo de errores estandar
 * 
 * System.out.print("Error");
 * System.err.print("Error");
 * 
 * OutputStream vs IntputStream
 *  Intput:Lee
 *  Output:Escribe
 * 
 * 
 * 
 */
public class IOTest {
    //crear archivo txt
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Hola.txt");
            fos.write(65);
            fos.close();
        } catch (IOException ioe) {
            System.out.println(ioe);
        }

    }
}
