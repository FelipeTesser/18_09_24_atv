/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio5;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int inicio = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int fim = scanner.nextInt();

        // Determina o limite superior e inferior
        int menor = Math.min(inicio, fim);
        int maior = Math.max(inicio, fim);
        
        System.out.println("Números pares entre " + menor + " e " + maior + " em ordem decrescente:");

        // Exibe os números pares em ordem decrescente
        for (int i = maior; i >= menor; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        
        scanner.close(); // Fecha o scanner
    }
}
