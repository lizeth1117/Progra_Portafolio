/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos_clases;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lizet
 */
public class AdivinaNumero {
    
    public static void main(String[] args) {
   //  21.10.24 lunes  Juego de adivina el numero
   Scanner entrada = new Scanner(System.in);
      Random x=new Random();
      int naleatorio=x.nextInt(6);
       
      System.out.println(naleatorio);
      int numero ;
      
        System.out.println("ingrese un numero entre o y 5");
      numero=entrada.nextInt();
      while (naleatorio!=numero){
          System.out.println("Intenta de nuevo.");
          numero=entrada.nextInt();
          if (naleatorio>numero) 
              System.out.println("El numero aleatorio es mayor.");
          
          else {
              if (naleatorio==numero){
              System.out.println("adivinaste");
              }
                  else{
                  System.out.println("El numero aleatorio es menor");
                  }
              }
      }
}
}
