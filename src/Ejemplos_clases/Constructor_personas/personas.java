/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos_clases.Constructor_personas;

// 13-11-24 constructores


public class personas {
    //atributos
    String nombre ;
    int edad ;
    
    //metodo constructor
   public personas (String nombre1,int edad){
         nombre=nombre1;   //si no tienen el mismo nombre se puede escribir directamente nombre=nombre1 
        //this.nombre=nombre ; // se usa this. cuando las variables tienen el mismo nombre
        this.edad=edad ;
  }
    public void mostrar(){
        System.out.println("El nombre es "+nombre);
        System.out.println("La edad es :"+edad);
    }
    
    
    
}
