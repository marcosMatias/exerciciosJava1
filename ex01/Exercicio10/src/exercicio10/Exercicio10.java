/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio10;

import java.util.Scanner;

/**
 *
 * @author marcosvieira
 */
public class Exercicio10 {

    /**
     * Faça um programa que receba uma temperatura em Celsius
     * , calcule e mostre essa temperatura em Fahrenheit. Sabe-se que F = 180 * ( C + 32 ) / 100.
     */
    public static void main(String[] args) {
          
        Scanner scanner = new Scanner(System.in);
        double temperatura;
        double temperaturaConvertida;
        System.out.println("Digite a temperatura em gruas celcuis");
        temperatura = scanner.nextDouble();
        
        temperaturaConvertida = 180*(temperatura+32)/100;
         System.out.println("A temperatura convertida é "+temperaturaConvertida);
          scanner.close();
    }
    
}
