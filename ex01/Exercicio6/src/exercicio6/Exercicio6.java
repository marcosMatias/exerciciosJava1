/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio6;

import java.util.Scanner;

/**
 *
 * @author marcosvieira
 */
public class Exercicio6 {

    /**
     * 
     * Faça um programa que receba o preço de um produto, calcule e mostre o novo preço, sabendo-se que este sofreu um desconto de 10%.
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
          
          double preco;
          double resultado;
          double desconto;
          
          
          System.out.println("Digite o preco do produto");
          preco = scanner.nextDouble();
         
          desconto = preco * 0.1;
          resultado = preco - desconto;
          
          System.out.println("o Resultado da operacao é "+resultado);
          
          
       // Fechando o scanner para evitar vazamentos de recursos
        scanner.close();
    }
    
}
