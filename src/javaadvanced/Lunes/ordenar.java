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
public class ordenar {
    
     static void bubbleSort(int[] arr) {
      int n =arr.length;
      int temp=0;
         for (int i = 0; i < n; i++) 
         {
             for (int j = 1; j < (n-1); j++) 
             {
                 if (arr[j-1]>arr[j])
                 {
                  temp=arr[j-1];
                  arr[j-1]=arr[j];
                  arr[j]=temp;
                 }
             }
         }
     }
       public static void main (String[] args)
       {
           int arr[]={10,5,20,35,17};
           System.out.println("Arreglo antes de ordenar");
           for (int i = 0; i < arr.length; i++) {
               System.out.println(arr[i]+"");
           }
           System.out.println("");
           bubbleSort(arr);
           System.out.println("Arreglo ordenado");
           for (int i = 0; i < arr.length; i++) {
               System.out.println(arr[i]+"");
           }
       }
     }
