/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newcomisiones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelos.MdVendedor;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class nuevacomision {//declara una lista de tipo md vendedor para que se inserten todos los datos 
    
     
    //List<MdVendedor> Todos = new ArrayList<MdVendedor>();//variable tipo instancia  la nueva comisiones
    
    // va devolver el objecto de tipo md vendedor
      //public MdVendedor  Ingreso_Informacion(){//agregue el voi poque me tiraeroror sin el void
       // MdVendedor vende = new MdVendedor();
        //Scanner t = new Scanner (System.in);
        
      //  System.out.println("Ingrese su nombre");
     //   vende.nombre = t.nextLine();
        
       // System.out.println("Ingrese el Enero");
       // vende.enero = t.nextDouble();
      //  System.out.println("Ingrese el Febrero");
      //  vende.febrero = t.nextDouble();
       // System.out.println("Ingrese el Marzo");
       // vende.marzo = t.nextDouble();
       // Todos.add(vende);
       // return vende;
      //}
     
      
      
     // public void desplegarDato(){
        //  for(MdVendedor ele: Todos){//todos es una variable de instancia
        //   // System.out.println("Nombre = "+ele.nombre);
          //  System.out.println("Enero="+ele.enero);
          //  System.out.println("Febrero="+ele.febrero);
            //System.out.println("Marzo ="+ele.marzo);
            
            
        //  }
              
     // }
    private static String[][] comision = new String[5][6];
    private static int [][] sumafi = new  int[5][6];//suma final
    private static int [][] sumacolumna = new  int[5][6];
    private static int [][] matriz = new  int[5][6];   
    private static  final int Nombre = 0;
    private static  final int Enero = 1;
    private static  final int Febrero = 2;
    private static  final int Marzo = 3;
    private static  final int resultado = 4;
    private static  final int promedio = 5;
    private static final int cal = 0;
    private static final int totalg = 4;
    
    
           
    private static void Registro(){
       for (int i = 1; i < comision.length-1; i++) {
          Ingreso_Informacion(i);  
        } 
    }
    
    //Funcion para mostrar Textos de Encabezados
    private static void Titulos(){
       comision[cal][Nombre]="Nombre";
        comision[cal][Enero]="Enero";
        comision[cal][Febrero]="Febrero";
        comision[cal][Marzo]="Marzo";
        comision[cal][resultado]="Total";
        comision[cal][promedio]="Promedio";
    
    }
    
    // Carga la Informacion a la Matriz.
    public static void Ingreso_Informacion(int Fila){
        Scanner lector = new  Scanner(System.in);
        Titulos();
        System.out.println("Ingresa el nombre de la persona " +(Fila)+":");
        comision[Fila][Nombre]=lector.nextLine();
        System.out.println("Ingresa el mes 1");
        comision[Fila][Enero]=lector.nextLine();
        System.out.println("Ingresa el mes 2");
        comision[Fila][Febrero]=lector.nextLine();
        System.out.println("Ingresa el mes 3");
        comision[Fila][Marzo]=lector.nextLine();
        
    }
    
    // Repite la  Suma de  los Totales
    private static void TotalPromediosporCliente(){
        for (int i = 1; i < comision.length-1; i++) {
          TotalPromediosporCliente(i);  
        }
    
    }
    
    //muestra el  Total de la Persona.
    public static void TotalPromediosporCliente(int fila){
        for (int i = 1; i < comision.length; i++) {
            int total = 0;
            for (int j = 1; j < comision.length-3; j++) {
                for (int k = 1; k < 4; k++) {
                sumafi[j][i]=Integer.parseInt(comision[fila][k]);
                total+=sumafi[j][i];
                comision[fila][resultado]=String.valueOf(total);
                comision[fila][promedio]=String.valueOf(total/3);
                }
                
            }
            
        }    
    }
    
    //hace  Repetir los Grandes Totales
    private static void SumaGranTotal(){
        for (int i = 1; i < comision.length-1; i++) {
            GranTotal(i);  
        }
    
    }
    
    // Suma todo  lo de los tres Meses
    public static void GranTotal(int columnas){
        for (int i = 1; i < comision.length; i++) {
            int total=0,total2=0,total3=0;
            for (int j = 1; j < comision.length-3; j++) {
                for (int k = 1; k < 4; k++) {   
                sumacolumna[j][i]=Integer.parseInt(comision[k][columnas]);
                total+=sumacolumna[j][i];
                comision[totalg][columnas]=String.valueOf(total);
                
                sumacolumna[j][i]=Integer.parseInt(comision[k][resultado]);
                total2+=sumacolumna[j][i];
                comision[totalg][resultado]=String.valueOf(total2);
                
                sumacolumna[j][i]=Integer.parseInt(comision[k][promedio]);
                total3+=sumacolumna[j][i];
                comision[totalg][promedio]=String.valueOf(total3);
                    
                }
            }
            
        }
        
    }
    
    // Imprimir la Matriz
     public static void ImprimirMatriz(String[][] Matriz) {
        for (int x = 0; x < Matriz.length; x++) {
            System.out.print("|");
            for (int y = 0; y < Matriz[x].length; y++) {
                System.out.print(Matriz[x][y]);
                if (y != Matriz[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }
   
     // Saca la Venta Mayor de Cada Semana
     public static void MesTotalMayor(int columna,String mes){
         String NombreCliente="";
         int NumMayor=comision.length;
         
         for (int i = 1; i < comision.length-1; i++) {
             int Mayor=0;
            sumafi[i][columna]=Integer.parseInt(comision[i][columna]);
            if(NumMayor < sumafi[i][columna]){
                NumMayor=sumafi[i][columna];
            }
           matriz[1][columna]=Integer.parseInt(comision[1][columna]);
           matriz[2][columna]=Integer.parseInt(comision[2][columna]);
           matriz[3][columna]=Integer.parseInt(comision[3][columna]);
            
           if(matriz[1][columna]> matriz[2][columna]&&matriz[1][columna]> matriz[3][columna]){
               Mayor=1;
               NombreCliente=comision[Mayor][Nombre];
           }
           if(matriz[2][columna]> matriz[1][columna]&&matriz[2][columna]> matriz[3][columna]){
               Mayor=2;
               NombreCliente=comision[Mayor][Nombre];
           }
           if(matriz[3][columna]> matriz[1][columna]&&matriz[3][columna]> matriz[2][columna]){
               Mayor=3;
               NombreCliente=comision[Mayor][Nombre];
           }     
        }
         if(mes=="1"){
         System.out.println("La cantidad mas alta  Q"+NumMayor);
         System.out.println("Nombre  "+NombreCliente);
         System.out.println("\n");
         }
         else{
         System.out.println("La mayor venta es " + mes + " de Q"+NumMayor);
         System.out.println("Su nombre es "+NombreCliente);
         System.out.println("\n");  
         }
         
         
    }
      
     // Saca la Venta Menor de Cada Semana
     public static void MesTotalMenor(int columna,String mes){
       String NombreCliente="";
         int NumMenor=comision.length;

         for (int i = 1; i < comision.length-1; i++) {
             int Menor=0;
            sumafi[i][columna]=Integer.parseInt(comision[i][columna]);
            if(NumMenor > sumafi[i][columna]){
                NumMenor=sumafi[i][columna];
            }
           matriz[1][columna]=Integer.parseInt(comision[1][columna]);
           matriz[2][columna]=Integer.parseInt(comision[2][columna]);
           matriz[3][columna]=Integer.parseInt(comision[3][columna]);
            
           if(matriz[1][columna]< matriz[2][columna]&&matriz[1][columna]< matriz[3][columna]){
               Menor=1;
               NombreCliente=comision[Menor][Nombre];
           }
           if(matriz[2][columna]< matriz[1][columna]&&matriz[2][columna]< matriz[3][columna]){
               Menor=2;
               NombreCliente=comision[Menor][Nombre];
           }
           if(matriz[3][columna]< matriz[1][columna]&&matriz[3][columna]< matriz[2][columna]){
               Menor=3;
               NombreCliente=comision[Menor][Nombre];
           }     
        }
         System.out.println(" La venta menor   es " + mes + " de Q"+NumMenor);
         System.out.println("nombre  "+NombreCliente);
         System.out.println("\n");     
         
     }
     
     // Modifica cada  uno de los  Datos que desiemos cambiar 
     public static void Modificar(){
         Scanner lector = new  Scanner(System.in);
         int colummna=0,fila=0;
         String valor="";
         
         
         System.out.println("¿En que columna se encuentra el dato?\n"
                 + "0. Modificar nombre \n"
                 + "1. Modificar cantidad de enero\n"
                 + "2. Modificar cantidad de febrero\n"
                 + "3. Modificar cantidad de marzo");
         colummna =lector.nextInt();
         System.out.println("¿En que fila se encuentra el dato?\n"
                 + "1. Modificar fila 1\n"
                 + "2. Modificar fila 2\n"
                 + "3. Modificar fila 3");
         fila =lector.nextInt(); 
         System.out.println("Ingresar valores nuevos");
         valor=lector.nextLine();
         valor=lector.nextLine();
          for (int i = 1; i < comision.length-1; i++) {
              comision[fila][colummna]=valor;
          }
     }
    
     // lo que hace es buscar la cantidad que querramos saber   de los datos que se ingresaron 
     public static void Busquedas(){
        Scanner lector = new  Scanner(System.in);
        String Busqueda[]=new String[2];
        int cantbusqueda;
      
         System.out.println("Ingresa la cantidad que deseas buscar");
         cantbusqueda=lector.nextInt();
         for (int i = 1; i < comision.length-1; i++) {
             
             if(Integer.parseInt(comision[i][Enero])==cantbusqueda){
                 Busqueda[0]=comision[i][Nombre];
                 Busqueda[1]="Enero";
             }
             
             if(Integer.parseInt(comision[i][Febrero])==cantbusqueda){
                 Busqueda[0]=comision[i][Nombre];
                 Busqueda[1]="Febrero";
             }
             
             if(Integer.parseInt(comision[i][Marzo])==cantbusqueda){
                 Busqueda[0]=comision[i][Nombre];
                 Busqueda[1]="Marzo";
             }  
         }
             System.out.println("La persona que vendio fue " +Busqueda[0]);
             System.out.println("El mes que vendio fue  " +Busqueda[1]);
  
     }
     
     public static void main(String[] args) {
       Scanner lector = new  Scanner(System.in);
       int opcion=0;
       int seguir=1;
       
       while(seguir==1){
       System.out.println("***MENU ***\n"
               + "1. Ingresar datos de  los clientes\n"
               + "2. Consultar de quien vendió más por mes y quién vendió menos\n"
               + "3. Cosultar quién vendió más en los 3 meses.\n"
               + "4. modificar datos \n"
               + "5. Buscar  datos !! \n"
               + "6. Datos nuevos\n"
               + "7. Salir");
      opcion=lector.nextInt();
      
      switch(opcion){
          
          case 1:
              Registro();
              TotalPromediosporCliente();
              SumaGranTotal();
              System.out.println("\n");
              ImprimirMatriz(comision);
              break;
          case 2:
              MesTotalMayor(Enero,"Enero");
              MesTotalMayor(Febrero,"Febrero");
              MesTotalMayor(Marzo,"Marzo");
              MesTotalMenor(Enero,"Enero");
              MesTotalMenor(Febrero,"Febrero");
              MesTotalMenor(Marzo,"Marzo");
              break;
          case 3:
              MesTotalMayor(resultado,"1");
              break;
          case 4:
              ImprimirMatriz(comision);
              System.out.println("\n");
              Modificar();
              TotalPromediosporCliente();
              SumaGranTotal();
              System.out.println("Se realizo el cambio");
              break;
          case 5:
              Busquedas();
              break;
          case 6:
              ImprimirMatriz(comision);
              break;
          case 7:
              System.exit(0);
              break;
          default: 
              System.out.println("Opcion incorrecta");
              break;   
      }
       System.out.println("\n");
       System.out.println("Deseas volver a repetir");
       System.out.println("Presiona el  1 - para volver al inicio");
       System.out.println("Presiona el  0 - para salir del programa ");
       seguir=lector.nextInt();
       System.out.println("\n");
       
     
        
    }
    
     }
     
     
       
        
    }
      
      
    

          
          
      
          
              
          
      
    


