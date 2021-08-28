/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coleccion.clase6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import modelos.MdVendedor;
import newcomisiones.nuevacomision;



/**
 *
 * @author usuario
 */
public class coleccion {
     public static void main(String [] args ){
         
    
       
       //List miLista = new ArrayList();
       //miLista.add(10);
       //miLista.add(20);
      // miLista.add(30);
      // imprimir(miLista);
       //miLista.add(10);
      // System.out.print("despues ===");
      // imprimir(miLista);
      // MdVendedor vende = new MdVendedor();
      // vende.nombre= "juan";
      // vende.enero= 30;
      // vende.febrero= 40;
       //vende.marzo= 10;
      
       // MdVendedor vende2 = new MdVendedor();
       //vende2.nombre= "maria";
       //vende2.enero= 10;
       ////vende2.febrero= 60;
      // vende2.marzo= 80;
         
      List<MdVendedor> local = new ArrayList<MdVendedor>();//variable tipo instancia  la nueva comisiones
     
      //nuevacomision comi = new nuevacomision();
      MdVendedor ventemp = new MdVendedor();
      //ventemp=comi.Ingreso_Informacion();
      //local.add(ventemp);
      
      //comi.Ingreso_Informacion();
      //comi.Ingreso_Informacion();
      //comi.desplegarDato();
      
      ventemp.nombre="Juan";
      ventemp.enero=10;
      ventemp.febrero=15;
      local.add(ventemp);
      desplegarLocal(local);
      ventemp = new MdVendedor();
      
      System.out.println("Nueva informacion");
      ventemp.nombre="Maria";
      ventemp.enero=90;
      ventemp.febrero=915;
      local.add(ventemp);
      desplegarLocal(local);
      ventemp = new MdVendedor();
      
      
     }
     public static void desplegarLocal(List<MdVendedor> arre){
         for(MdVendedor ele: arre){
             System.out.println("nombre = "+ ele.nombre);
             System.out.println("enero="+ele.enero);
             System.out.println("Febrero="+ele.febrero);
             System.out.println("marzo="+ele.marzo);
             
         }
             
         
         
         
     }
      
      
      
   
      
       
       
       
       
        
       
    
    
    //se hara la iteracion y agarrara elemnto por elemento y se desplegara en pantalla
    public  static void imprimir(Collection coleccion){
       for(Object elemento: coleccion){
            System.out.print("Elemento = "+ elemento);
            
            
        }
    }
    
}
