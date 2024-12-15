/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplos_clases;

import java.util.Scanner;

/**
 *
 * @author lizet
 */
public class FuncionesOperaciones {
    // metodos o procedimientos y funciones 29/10/24
   
    public static void suma(){                // METODO
    int n1, n2;
    Scanner sc=new Scanner(System.in);
        System.out.println("Favor ingresar numero 1: ");
        n1=sc.nextInt();
        System.out.println("Favor ingresar numero 2: ");
        n2=sc.nextInt();
        System.out.println("La suma de los numeros es: "+(n1+n2));
    }
    public static void resta(){              // METODO
    int n1, n2;
    Scanner sc=new Scanner(System.in);
        System.out.println("Favor ingresar numero 1: ");
        n1=sc.nextInt();
        System.out.println("Favor ingresar numero 2: ");
        n2=sc.nextInt();
        System.out.println("La suma de los numeros es: "+(n1-n2));
        
    }
    public static int multiplicacion(){        //FUNCION PORQUE HACE RETURN
        Scanner sc=new Scanner(System.in);
        int n1, n2;
        System.out.println("Favo ingresar un numero:");
        n1=sc.nextInt();
        System.out.println("Favo ingresar otro numero:");
        n2=sc.nextInt();
        return n1*n2 ;
    }
      
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int op;
       do{
        System.out.println("Menu");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicacion");
        System.out.println("4. salir");
        op=sc.nextInt() ;
            switch(op){
                case 1:
                    suma();
                    break;
                case 2:
                    resta();
                    break;
                case 3:
                    System.out.println(multiplicacion());
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion invalida");    
            }
        }
        while(op!=4); //  regresa al menu  
    } //FIN DE MAIN
    
}// FIN DE CLASS
