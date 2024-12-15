/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portafolio_programacioni;

import java.util.Random;


//  7-11-24
// Arreglos Metodo Burbuja / ordenar arreglo de menor a mayor
public class arreglos_burbuja {
    
    static void llenar(){
        Random r=new Random();
        for (int i = 0; i < 10; i++) {
            a[i]=Math.abs(r.nextInt()%100) ; // mod %100 es para poner el rango de los numeros random
           //math.abs es para que devuelva solo numeros positivos  
        }  
    }
    static void mostrar(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i+"---"+a[i]);
        }
    }
    static void burbuja(){ // este metodo burbuja siempre trabaja con 2 for 
        for (int x = 0; x < 10; x++) {
            for (int y = 1; y < 10; y++) { // segundo for no inicializa en 0 sino en 1 
                if(a[y-1]>=a[y]){
                   int temp=a[y];
                    a[y]=a[y-1];
                    a[y-1]=temp ;
                }
                
            }
            
        }
        
    }
    
   static int a[]=new int[10] ; 
    public static void main(String[] args) {
        llenar();
        mostrar();
        burbuja();
        System.out.println("Los numeros en orden serian: ");
            mostrar();
        
    }
}
