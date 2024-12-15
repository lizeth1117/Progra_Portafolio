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
public class NumCubo {
    public static void main(String[] args) {
     // numero positivo al cubo  22/10/24

int num1, cubo ;        
        num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Numero. "));
        while ( num1<0){
            num1=Integer.parseInt(JOptionPane.showInputDialog("Debe de ingrsar un numero positivo."));
        }
        if (num1>0);
                  cubo=(int)Math.pow(num1, 3);  
                  JOptionPane.showMessageDialog(null,"El resultado es "+cubo);

    
}
}
