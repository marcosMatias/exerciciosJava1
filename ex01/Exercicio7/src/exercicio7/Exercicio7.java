/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio7;

import java.util.Scanner;

/**
 *
 * @author marcosvieira
 */
public class Exercicio7 {

    /**
     * Um funcionário recebe um salário fixo mais 4% de comissão sobre as
     * vendas. Faça um programa que receba o salário fixo do funcionário e o
     * valor de suas vendas, calcule e mostre a comissão e seu salário final.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioFixo;
        double vendas;
        double comissao;
        double salarioFnal;

        
        System.out.println("Digite o valor do Salario");
        salarioFixo = scanner.nextDouble();
        System.out.println("Digite o valor da Vendas");
        vendas = scanner.nextDouble();
        comissao = vendas * 0.04;
        salarioFnal = salarioFixo + comissao;
        System.out.println("O valor da comissão é "+comissao);
        System.out.println("O valor do salario final  é "+salarioFnal);
        
        
        
        
        
        
        
        
        // Fechando o scanner para evitar vazamentos de recursos
        scanner.close();
    }

}
