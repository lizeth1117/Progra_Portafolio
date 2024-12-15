/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos_clases;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author lizet
 */
public class Arreglos {
    public static void main(String[] args) {
        // arreglos 28/10/24
           Scanner entrada = new Scanner(System.in);
        int[] numeros={1,2,3,4}; 
        System.out.println(numeros[3]);
        
        
        int nentrada;
        
        nentrada=Integer.parseInt(JOptionPane.showInputDialog("favor ingresar la cantidad de caracteres"));
        char[] letras=new char[nentrada] ; 
        System.out.println("ingrese los caracteres");
        for (int i = 0; i < nentrada; i++) {
            System.out.println((i+1)+" Favor ingresar los caracteres");
            letras[i]=entrada.next().charAt(0);             
        } // FIN DE FOR
        System.out.println("los caracteres ingresados son");
        for (int i = 0; i < nentrada; i++) {
            System.out.println(letras[i]);
        } 
    
        System.out.printf("%s%n%s%n%s%n", "1. retiro","2. deposito","3. salir");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        System.out.printf("La suma es: %d%n",num1+num2);
        
        
        
    }
}
