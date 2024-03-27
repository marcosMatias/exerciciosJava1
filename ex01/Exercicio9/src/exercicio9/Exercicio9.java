/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio9;

import java.util.Scanner;

/**
 *
 * @author marcosvieira
 */
public class Exercicio9 {

    /**
     * Faça um programa que receba o valor do salário mínimo e o valor do salário de um funcionário,
     * calcule e mostre a quantidade de salários mínimos que esse funcionário ganha.
     */
    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);
         
        double salarioMinimo;
        double salarioFuncionario;
        double quantidadeSalarios;
       
        
        System.out.println("Digite o valor do salario minimo");
        salarioMinimo = scanner.nextDouble();
        System.out.println("Digite o valor do salario do funcionario");
        salarioFuncionario = scanner.nextDouble();
        
        quantidadeSalarios =  salarioFuncionario / salarioMinimo;
        
        System.out.println("A quantidade de salarios que o funcionario recebe é "+quantidadeSalarios);
        
        
        
        
         
         scanner.close();
    }
    
}
