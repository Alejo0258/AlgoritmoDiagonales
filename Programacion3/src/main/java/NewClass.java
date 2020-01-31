/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PADILLA GONZALEZ
 */
public class NewClass {
    public static void main(String[] args) {	
        long suma;
        suma=0;
        for(int i=0;i<10;i++)
        {
            if(i%2==1)
                suma=suma+i;
        }
		System.out.println("\nEl resultado de la suma de los numeros impares entre 0 y 100000000 es -> " +suma);
	}
}
