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
public class CicloWhile {
    public static void main(String[] args) {
        //Ciclo while 24/10/24
       Scanner entrada = new Scanner(System.in);
        String CCorrecta="Pam123@" ;
        String CClave ;
        int intentos=0 ;
        int Cintentos=4 ;
                
        do{
            System.out.println("Favor ingresar una clave: ");
            CClave=entrada.nextLine();
            intentos++;
            if (!CCorrecta.equals(CClave)){
                System.out.println("Clave incorrecta, has utilizado: "+intentos+"intentos de: "+Cintentos);
                
            }
                
        } while (!CCorrecta.equals(CClave)&& (intentos <Cintentos ));
        if (CCorrecta.equals(CClave)){
            System.out.println("Clave correcta.");
        }
        else{
            System.out.println("Has exedido el numero de intentos.");} 
        
        for (int i = 0; i < 10; i++) {    
        } 
         
    }
}
