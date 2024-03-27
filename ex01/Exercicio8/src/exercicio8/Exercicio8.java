/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio8;

import java.util.Scanner;

/**
 *
 * @author marcosvieira
 */
public class Exercicio8 {

    /**
     * Faça um programa que receba o peso de uma pessoa, calcule e mostre: a. O
     * novo peso, se a pessoa engordar 15% sobre o peso digitado. b. O novo
     * peso, se a pessoa emagrecer 20% sobre o peso digitado.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double peso;
        double pesoGordo;
        double pesoMagro;

        System.out.println("Informe o peso:");
        peso = scanner.nextDouble();
        pesoGordo = peso + (peso * 0.15);
        pesoMagro =  peso - (peso * 0.20);
        
          System.out.println("Se a pessoa engordar 15% seu peso será: "+pesoGordo);
          System.out.println("Se a pessoa emagrecer 20% seu peso será: "+pesoMagro);
        
        scanner.close();
        
    }

}
