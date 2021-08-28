/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comisionesviejo;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class oldcomisiones {
    private static String[][] comisiones = new String[3][6];
    
    private static final int NOMBRE =0;
    private static final int ENERO =1;
    private static final int FEBRERO =2;
    private static final int MARZO =3;
    private static final int TOTAL =4;
    private static final int PROMEDIO =5;
    
    
    public static void cargaInformacion(int fila){
        Scanner t = new Scanner(System.in);
        
        System.out.println("Ingrese Nombre "+(fila+1));
        comisiones[fila][NOMBRE]= t.nextLine();
        System.out.println("Ingrese Enero");
        comisiones[fila][ENERO]= t.nextLine();
        System.out.println("Ingrese Febrero");
        comisiones[fila][FEBRERO]= t.nextLine();
        System.out.println("Ingrese marzo");
        comisiones[fila][MARZO]= t.nextLine();
        
    }
    
    
     public static void imprimirDecorado(){
       for (int x = 0; x < comisiones.length; x++) {
            System.out.print("|");
            for (int y = 0; y < comisiones[x].length; y++) {
                System.out.print(comisiones[x][y]);
                if (y != comisiones[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
   }
    
     
     public static void ingresoDatos(){
        for (int i = 0; i < 3; i++) {
             cargaInformacion(i);
        }  
     }
     
    public static void main(String[] args) {
       
        ingresoDatos();
        imprimirDecorado();
    }
    
}
