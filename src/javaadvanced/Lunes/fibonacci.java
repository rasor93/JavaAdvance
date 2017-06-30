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
public class fibonacci {
    public static void main(String[] args) {
        
        int limite=50;
        int j=0;
         int i=1;
         int inicio=0;
        do
        {
            System.out.println(j);
            System.out.println(i);
            
              j=i+j;
              i=i+j;
            
        } while(j<=limite);
                
            
        }
    }
  

