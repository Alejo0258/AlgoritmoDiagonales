/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmodiagonales;

/**
 *
 * @author PADILLA GONZALEZ
 */
public class AlgoritmoDiagonales {

    public static void main(String[] args)  
    {        
    System.out.println("\tPrograma que crea una matriz e imprime la suma y resta de sus diagonales\t");
        int n=3;
        int matriz[][] = new int[n][n];
        int sumaDP=0, sumaDS=0;        
        for(int f=0;f<n;f++)        {
            for(int c=0;c<n;c++)            {
                matriz[f][c]= (int) Math.floor(Math.random()*100+1); // LLenado matriz
                if (f==c)
                   sumaDP= sumaDP+matriz[f][c];                               
            }
        }
        for(int f=0;f<n;f++)        
            sumaDS= sumaDS+matriz[f][(n-1)-f]; 
        System.out.println("\nLa matriz es:\t");
        System.out.print(" _______________________________________________ ");
        for(int f=0;f<n;f++)        { 
            System.out.print("\n|");            
            for(int c=0;c<n;c++){               
                System.out.print("\t"+matriz[f][c]); //Impresion matriz
                System.out.print("\t|");
                if (c==n-1) System.out.println();              
            }            
        }
        System.out.print(" _______________________________________________ ");
        System.out.println("\nLa suma de la diagonal principal es -> " + sumaDP);
        System.out.println("\nLa suma de la diagonal secundaria es -> " + sumaDS);
        System.out.println("\nLa suma de las diagonales es -> " +( sumaDP + sumaDS));
        System.out.println("\nLa diferencia de las diagonales es -> " +( sumaDP - sumaDS));  
        System.out.println("\nEste programa fue elaborado por Alejandro Padilla 1803596"); 
    }    
    
}


