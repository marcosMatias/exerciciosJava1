/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio12;

import java.util.Scanner;

/**
 *
 * @author marcosvieira
 */
public class Exercicio12 {

    /**
     * Faça um algoritmo para ler o código, o sexo e o número de horas/aulas
     * dadas no mês dos professores de uma escola , sabendo que um professor
     * ganha R$ 12,50 hora/aula e que a escola possui 10 professores. Após a
     * leitura, mostre:
     *
     * a) O salário bruto, o desconto e o salário líquido de cada professor. b)
     * A média aritmética dos salários brutos dos professores do sexo masculino.
     * c) A média aritmética dos salários brutos dos professores do sexo
     * feminino.
     *
     * Os descontos devem ser assim calculados sobre o salário bruto:
     *
     * Masculino Até 40 horas/aula ao mês : 10% Mais que 40 horas/aula ao mês :
     * 8% Masculino Até 40 horas/aula ao mês : 11% Mais que 40 horas/aula ao mês
     * : 9%
     *
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numProfessores = 10;

        int[] codigo = new int[numProfessores];
        double[] numeroHoraAula = new double[numProfessores];
        String[] sexo = new String[numProfessores];
        double valorHoraAula = 12.5;
        double salarioBruto;
        double salarioLiquido;
        double desconto;
        double mediaSalBrutoMasc;
        double mediaSalBrutoFem;

        for (int i = 0; i < numProfessores; i++) {

            System.out.println("Digite o codigo");
            codigo[i] = scanner.nextInt();
            System.out.println("Digite o sexo");
            sexo[i] = scanner.next();
            System.out.println("Digite o numero de aulas");
            numeroHoraAula[i] = scanner.nextDouble();
            
        }

        scanner.close();
    }

}
