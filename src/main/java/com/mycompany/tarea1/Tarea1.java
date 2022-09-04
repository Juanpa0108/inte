/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea1;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author jroba
 */
public class Tarea1 {

    public static void main(String[] args) {
      
        // Centigrados a Fahrenheit
        
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite los grados en centigrados >> ");
    double centigrados = parseInt(scanner.nextLine());
    
    double resultado= (centigrados * 9/5) + 32;

    System.out.println("Grados en Fahrenheit: " + resultado);   
        
    
        //Sumar enteros pares del 2 al 20 
        
    int acumulador=0;
    int sumatoria=0;
    
    while(acumulador<=20)
    {
       
        if(acumulador%2==0){
            sumatoria+=acumulador;
        }
        acumulador++;
    }
    System.out.println("La sumatoria de los numeros pares es: "+ sumatoria);
       
    
    
    
        
    }
}
