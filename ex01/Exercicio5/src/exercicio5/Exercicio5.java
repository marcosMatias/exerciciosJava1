/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio5;

import java.util.Scanner;

/**
 *
 * @author marcosvieira
 */
public class Exercicio5 {

    /**
     * Faça um programa que receba três números, calcule e mostre a multiplicação desses números.
     */
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
          
          int n1, n2,n3,resultado;
          
          
          System.out.println("Digite o primeiro numero");
          n1 = scanner.nextInt();
          System.out.println("Digite o segundo numero");
          n2 = scanner.nextInt();
          System.out.println("Digite o terceiro numero");
          n3 = scanner.nextInt();
         
          
          resultado = n1*n2*n3;
          
          System.out.println("o Resultado da operacao é "+resultado);
          
          
           // Fechando o scanner para evitar vazamentos de recursos
        scanner.close();
        
    }
    
}
