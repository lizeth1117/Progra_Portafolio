/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package portafolio_programacioni;

/**
 *
 * @author lizet
 */
public class Funciones_Recursividad {
// 30/10/24
   public static int funcion(int a){   //FUNCION
       if(a<=0){
           return 0;
       }
       else{
        System.out.println(a);
        funcion(a-1);
       }
       return 0;
   }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(funcion(10));
        
    }
    
}
