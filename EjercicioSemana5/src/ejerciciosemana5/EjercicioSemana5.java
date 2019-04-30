/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosemana5;
import porcentajes.NewClass.*;
import java.util.Scanner;
import porcentajes.NewClass;



/**
 *
 * @author Salas
 */
public class EjercicioSemana5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int matricula = 1330;
        double primerPorcentaje = NewClass.porcentciudad;
        double segundoPorcent =  NewClass.porcentedad;
        double tercerPorcentaje = NewClass.porcentEstadoCivil;
        double cuartoPorcentaje = NewClass.porcentCargasFamiliares;
        double ciudad;
        double edad;
        double estadoCivil;
        double cargasFamiliares;
        double costo_final;
       
               
        
        System.out.println("Ingrese la ciudad del estudiante si es loja o"
                + " zamora escriba 1 sino escriba 2");
        ciudad = entrada.nextFloat();
       if(ciudad==1){
           costo_final = (1330-NewClass.porcentciudad);   
        }else {
           costo_final = matricula;
       }
       
         
         System.out.println("Ingrese su Edad");
          edad = entrada.nextInt();
         if(edad>=17 && edad <20){
             costo_final = (costo_final-NewClass.porcentedad);
             
             
             
         System.out.println("Ingrese su estado cilvil:1 casado o 2 soltero");
                 estadoCivil = entrada.nextFloat();
                 if(estadoCivil==1){
                      costo_final = (costo_final-NewClass.porcentEstadoCivil);
                 }
                     
                  
        System.out.println("ingrese el numero de cargas familiares");
                 cargasFamiliares = entrada.nextFloat();
                 if (cargasFamiliares>=1){
                     costo_final = (costo_final-NewClass.porcentCargasFamiliares);
                 }
                    
                 costo_final = (float) (costo_final + (costo_final * 0.02));
                    
                 }
                 
         System.out.printf("El valor final a pagar de la matricula es: %.2f", costo_final);
                 
                 
                 
               
                     
                 
                
                  
         
          
                  
             
      }    
   }
    

