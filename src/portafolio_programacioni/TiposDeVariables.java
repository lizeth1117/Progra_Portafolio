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
public class TiposDeVariables {
    
    public static void main(String[] args) {
        //Tipo de Variables de java  
        
        Scanner entrada = new Scanner(System.in);     
        String nombre;
        int edad;
        double salario;
        
        System.out.println("favor ingrese un nombre:");
        nombre = entrada.next();
        
        System.out.println("favor ingrese su edad:");
        edad = entrada.nextInt(); 
        System.out.println("favor ingrese su salario:");
        salario = entrada.nextDouble();
     System.out.println("El nombre es: "+nombre);
     System.out.println("Su edad es: "+edad);
     System.out.println("El salario es de : "+salario);
     
    }
    
}
