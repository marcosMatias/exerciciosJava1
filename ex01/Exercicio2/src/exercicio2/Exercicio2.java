/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author marcosvieira
 */
public class Exercicio2 {

    /**
     * Faça um programa que receba o salário de um funcionário e o percentual de
     * aumento , calcule e mostre o valor do aumento e o novo salário
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valorSalario;
        double percentualAumento;
        double valorAumento;
        double novoSalario;

        System.out.println("Digite o valor do Salario:");
        valorSalario = scanner.nextDouble();
        System.out.println("Digite o percentual de aumento:");
        percentualAumento = scanner.nextDouble();
        
        valorAumento =  valorSalario * (percentualAumento/100);
        
        novoSalario =  valorAumento + valorSalario;
        
        
        System.out.println("O valor do aumento é "+valorAumento);
        
        System.out.println("o valor do novo salario é: "+novoSalario);
        
 // Fechando o scanner para evitar vazamentos de recursos
        scanner.close();
    }

}
