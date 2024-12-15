/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portafolio_programacioni;

/**
 *
 * @author lizet
 */
public class Random {
    public static void main(String[] args) {
        //Random y numero menor de un arreglo
        // 10 num aleatorios
         
        
        java.util.Random x=new java.util.Random();
        int [] numerosran= new int[10];
        int nmenor=49 ;
        for (int i = 0; i < 10; i++) {
           // numerosran[i]= (int)(Math.random()*50+1); // yo
        numerosran[i]= x.nextInt(50);
        System.out.println(i+1+"...."+numerosran[i]);  // inge
        }
        
       
        for (int i = 0; i < 10; i++) {
           if  (numerosran[i]<nmenor){
                    nmenor=numerosran[i];
           }
        }
           
        System.out.println("el numero menor es "+nmenor);
        }
    }

