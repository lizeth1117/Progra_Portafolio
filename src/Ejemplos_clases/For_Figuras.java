/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos_clases;

/**
 *
 * @author lizet
 */
public class For_Figuras {
     public static final String ANSI_RED = "\u001B[31m" ;
     
    public static void main(String[] args) {
        //Figuras y Ciclo for 24/10/24 
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(ANSI_RED+"* ");   
             }
            System.out.println(" ");


}
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            
        }
    }
}
