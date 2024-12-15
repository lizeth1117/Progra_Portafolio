/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portafolio_programacioni;

import java.util.Scanner;

/**
 *
 * @author lizet
 */
public class RaizCuadrada {
    public static void main(String[] args) {

        //Raiz cuadrada de un numero      
       double raiz;       
       Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un Numero para calcular su raiz cuadrada");
        raiz= Math.sqrt(entrada.nextDouble());
        System.out.println("La raiz cuadrada es de "+raiz);        
           
        // Numero al cuadrado
        double base, potencia, resultado;
                
        System.out.println("Porfavor ingrese el numero de base");
        base=(entrada.nextDouble());
        System.out.println("Porfavor ingrese el numero de potencia");
        potencia=(entrada.nextDouble());
        resultado=Math.pow(base,potencia);
        System.out.println("El resultado es "+resultado);
    }
    
}
