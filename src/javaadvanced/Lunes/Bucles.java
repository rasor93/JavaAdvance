/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Lunes;

/**
 *
 * @author CC-09
 */
public class Bucles {
    public static void main(String[] args) 
    {
        /*
        simple FOR
        */
        for(int i=1; i<=10; i++ )
        {
             System.out.println("interando el elemento "+i);
        }
        /*
        FOR EACH
        se utiliza para recorere un arreglo o una coleccion en java
        */
        int arreglo[]={12,23,34,45,56,67};
        for (int a: arreglo) 
        {
            System.out.println(a);   
        }
        
        /*
        FOR LABELED
        */
        for (int i = 1; i <= 3; i++)
        {
            for (int j = 1; j <= 3; j++) 
            {
                if (i==2 && j==2) 
                {
                 break;   
                }
                System.out.println(i+" "+j);
            }
        }
    }
}

