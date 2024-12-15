/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos_clases;

import javax.swing.JOptionPane;

/**
 *
 * @author lizet
 */
public class PositivosyNegativos {
    public static void main(String[] args) {
        //Numeros Positivos y Negativos
  
  int numero ;
  
  numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Numero"));
       
  while (numero>0||numero<0){
       if (numero>0){
           JOptionPane.showMessageDialog(null,"El numero ingresado es positivo");
            numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Numero"));
       }
            else  {
                 JOptionPane.showMessageDialog(null,"El numero ingresado es negativo");
                numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Numero"));
               }
       
  } 
    }
            
}
