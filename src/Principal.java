
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arturo
 */
public class Principal {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int array[]=new int[5];
        int mayor=array[0];
        System.out.println("ingrese los cinco numeros: ");
        for(int i=0; i<array.length;i++){
            array[i]=sc.nextInt();
            if(array[i] >mayor)
            {
                mayor = array[i];
            }
        }
        System.out.println("El numero mayor es: "+mayor);
    }
}
