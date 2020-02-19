/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastel.algoritmo;

import java.util.Scanner;
/**
 *
 * @author PADILLA GONZALEZ
 */
public class PastelAlgoritmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner Tec = new Scanner(System.in);
        NVelas v = new NVelas();
        int edad;
        System.out.println("\t\t\t\tPastel de cumpleaños\t\t\t\t");     
        System.out.println("\nIngrese la edad de la persona que cumple años\t");
        edad = Tec.nextInt();
        v.setVelas(edad);
        v.AlturaV();
        v.ImpAlturaV();
        v.ApagarVelas();
        
    }
    
}
