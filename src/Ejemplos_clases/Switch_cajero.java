package Ejemplos_clases;


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lizet
 */
public class Switch_cajero {
    public static void main(String[] args) {
     //Cajero
        final int saldo_i=2000;
        int opcion;
        float deposito,saldoactual,retiro;

        opcion=Integer.parseInt(JOptionPane.showInputDialog("Favor seleccionar Opcion:\n "
        + "1.Deposito\n"
        + "2.Retiro\n"
        + "3. Salir"));
        
       switch (opcion){
           case 1:
               deposito=Float.parseFloat(JOptionPane.showInputDialog("Favor ingrese un valor a depositar"));
               if(deposito>=1){
                   saldoactual=deposito+saldo_i;
                JOptionPane.showMessageDialog(null,"Su saldo actual es: "+saldoactual);
               }
                   else{
                     JOptionPane.showMessageDialog(null, "No esta permitido ingresar valores negativos");
                    }
                break;  
           case 2:
               retiro=Float.parseFloat(JOptionPane.showInputDialog("Favor ingrese la cantidad que desea retirar"));
               if (retiro>saldo_i){
                   JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
               }
               else{
                   if (retiro>=1){
                       saldoactual=saldo_i-retiro;
                       JOptionPane.showMessageDialog(null, "Su saldo actual es "+saldoactual);
                   }
                   else{
                       JOptionPane.showMessageDialog(null, "No esta permitido valores negativos.");
                   }
               }
        break ;

           case 3 : break;
           default: JOptionPane.showMessageDialog(null, "Opcion invalida");
   
    }
}
}
