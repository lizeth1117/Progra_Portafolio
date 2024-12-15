/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos_clases.Clases_Operaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author lizet
 */
public class Operaciones {
    // atributos 30-10-24
     int num1, num2, suma, resta, multiplicacion, division ;
     
    //metodos de operaciones
     public void ingresardatos(){
        num1=Integer.parseInt(JOptionPane.showInputDialog("Favor ingrese el num 1")) ;
        num2=Integer.parseInt(JOptionPane.showInputDialog("Favor ingrese el num 2")) ;
     }
     public void suma(){
         suma=num1+num2 ;
     }
     public void resta(){
         resta=num1-num2;
     }
     public void multiplicacion(){
         multiplicacion= num1*num2;                     
     }
     public void division(){
         division=num1/num2 ;
     }
     public void resultados(){
         JOptionPane.showMessageDialog(null, "la suma es: "+suma);
         JOptionPane.showMessageDialog(null, "la resta es: "+resta);
         JOptionPane.showMessageDialog(null, "la multiplicacion es: "+multiplicacion);
         JOptionPane.showMessageDialog(null, "la division es: "+division);
     }
             
}
