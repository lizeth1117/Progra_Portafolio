/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos_clases;

import java.util.Scanner;

/**
 *
 * @author lizet
 */
public class Colores_doWhile {
    
    public static final String ANSI_GREEN = "\u001B[32m" ;
    public static final String ANSI_RED = "\u001B[31m" ;
    
    public static void main(String[] args) {
        
    
     String CCorrecta="Pam123@" ;
        String CClave ;
        int intentos=0 ;
        int Cintentos=4 ;
        Scanner entrada = new Scanner(System.in);       
        do{
            System.out.println("Favor ingresar una clave: ");
            CClave=entrada.nextLine();
            intentos++;
            if (!CCorrecta.equals(CClave)){
                System.out.println("Clave incorrecta, has utilizado: "+intentos+" intentos de: "+Cintentos);
                
            }
                
        } while (!CCorrecta.equals(CClave)&& (intentos <Cintentos ));
        if (CCorrecta.equals(CClave)){
            System.out.println(ANSI_GREEN+"Clave correcta.");
        }
        else{
            System.out.println(ANSI_RED+"Has exedido el numero de intentos.");}
        }
}
