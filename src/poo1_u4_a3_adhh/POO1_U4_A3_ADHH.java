/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo1_u4_a3_adhh;

import java.util.Scanner;

/**
 *
 * @author ADAN
 */
public class POO1_U4_A3_ADHH {
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      

    Scanner tam=new Scanner(System.in); 
    Scanner tam2=new Scanner(System.in);
    System.out.println("Introduce número de filas del arreglo: ");
    int tamaño=tam.nextInt();
    System.out.println("Introduce número de columnas del arreglo: ");
    int tamaño2=tam2.nextInt();
   int arreglo[][]= new int[tamaño][tamaño2];
     for(int i=0;i<tamaño; i++){
     for(int j=0;j<tamaño2; j++){
         Scanner valor=new Scanner(System.in);
         
     System.out.println("teclea  valor "+i+j);
     arreglo[i][j]=valor.nextInt();
     }
     }  
     System.out.println("Arreglo orden normal");
             for(int i=0;i<tamaño; i++){
             for(int j=0;j<tamaño2; j++){
                 System.out.println(arreglo[i][j]);
             }
             }
       // int arreglo_inv[][]=new int[tamaño][tamaño2];
        
        for (int k =tamaño-1; k>=0; k--) {
        for (int l = tamaño2-1;l>=0; l--) {
            //arreglo[i][j]=arreglo[k][l];
           // tamaño--;
            //tamaño2--;
             System.out.println("Arreglo invertido: " +arreglo[k][l] );
            
                    }
        
    }
       
        }
             }
    
    



