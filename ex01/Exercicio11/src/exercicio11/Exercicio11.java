/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio11;

import java.util.Scanner;

/**
 *
 * @author marcosvieira
 */
public class Exercicio11 {

    /**
     * A prefeitura de uma cidade faz uma pesquisa entre 10 habitantes, 
     * coletando dados sobre o salário e o número de filhos. A prefeitura deseja saber:
        a) Média de salário da população.
        b) Média do número de filhos.
        c) Maior salário.
        d) Percentual de pessoas com salário até R$ 1.000,00
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numHabitantes = 10;
        double[] salarios = new double[numHabitantes];
        int[] numFilhos = new int[numHabitantes];

        // Coletando dados dos habitantes
        for (int i = 0; i < numHabitantes; i++) {
            System.out.println("Digite o salário do habitante " + (i + 1) + ":");
            salarios[i] = scanner.nextDouble();
            System.out.println("Digite o número de filhos do habitante " + (i + 1) + ":");
            numFilhos[i] = scanner.nextInt();
        }

        // Calculando média de salário
        double somaSalarios = 0;
        for (double salario : salarios) {
            somaSalarios += salario;
        }
        double mediaSalario = somaSalarios / numHabitantes;

        // Calculando média do número de filhos
        double somaFilhos = 0;
        for (int num : numFilhos) {
            somaFilhos += num;
        }
        double mediaFilhos = somaFilhos / numHabitantes;

        // Encontrando o maior salário
        double maiorSalario = salarios[0];
        for (double salario : salarios) {
            if (salario > maiorSalario) {
                maiorSalario = salario;
            }
        }

        // Calculando percentual de pessoas com salário até R$ 1.000,00
        int numPessoasAteMil = 0;
        for (double salario : salarios) {
            if (salario <= 1000) {
                numPessoasAteMil++;
            }
        }
        double percentualAteMil = (double) numPessoasAteMil / numHabitantes * 100;

        // Exibindo os resultados
        System.out.println("Média de salário: " + mediaSalario);
        System.out.println("Média do número de filhos: " + mediaFilhos);
        System.out.println("Maior salário: " + maiorSalario);
        System.out.println("Percentual de pessoas com salário até R$ 1.000,00: " + percentualAteMil + "%");

        scanner.close();
    
    }
    
}
