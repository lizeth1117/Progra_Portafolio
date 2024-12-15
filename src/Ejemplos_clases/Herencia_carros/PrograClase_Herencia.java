/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplos_clases.Herencia_carros;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author lizet
 */

// Herencias y arreglos multidimensionales 12-11-24  
public class PrograClase_Herencia {

    public static turismo toyota[]= new turismo[3];
    public static turismo temp= new turismo();
    public static void presentar(){
        for (int i = 0; i < 3; i++) {
            System.out.println("El modelo es "+toyota[i].getModelo());
            System.out.println("El anio del vehiculo es: "+toyota[i].getAño());
            System.out.println("El tamano del baul es: "+toyota[i].getTan_baul());
        }
    }
    
    public static void ordenar(){
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                
             if (toyota[j-1].getAño()>toyota[j].getAño())
                 temp=toyota[j-1];
                 toyota[j-1]= toyota[j];
                
                 toyota[j]=temp ;
                }
        }
    }
    
    public static void main(String[] args) {
        
       
        toyota[0]= new turismo ();
        toyota[0].setModelo("yaris");
        toyota[0].setAño(2018);
        toyota[0].setTan_baul(2);
        
        toyota[1]= new turismo ();
        toyota[1].setModelo("corola");
        toyota[1].setAño(2020);
        toyota[1].setTan_baul(3);
        
        toyota[2]= new turismo ();
        toyota[2].setModelo("tercer");
        toyota[2].setAño(2008);
        toyota[2].setTan_baul(1);
        toyota[2].modelo="hola";
        
  presentar();
  ordenar();
        System.out.println("************ordenado*************");
    }
}
