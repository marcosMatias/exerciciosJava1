/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author marcosvieira
 */
public class Exercicio3 {

    /**
     * Faça um programa que receba o salário base de um funcionário, 
     * calcule e mostre o salário a receber, 
     * sabendo-se que o funcionário tem gratificação de R$ 50,00 
     * e paga imposto de 10% sobre o salário base
     */
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        double salarioBase;
        double valorGratificacao;
        double imposto;
        double salarioAreceber;

        System.out.println("Digite o Salario Base:");
        salarioBase = scanner.nextDouble();
        valorGratificacao = 50;
        imposto =  salarioBase * 0.1;
        salarioAreceber = (salarioBase-imposto)+ valorGratificacao;
        System.out.println("O salario total a receber é: "+salarioAreceber);
        
         // Fechando o scanner para evitar vazamentos de recursos
        scanner.close();
       
    }
    
}
