/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor inicial: ");
        int inicio = scanner.nextInt();
        
        System.out.print("Digite o valor final: ");
        int fim = scanner.nextInt();
        
        int somaPares = 0;

        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                somaPares += i; // Adiciona o número par à soma
            }
        }
        
        System.out.println("A soma dos números pares entre " + inicio + " e " + fim + " é: " + somaPares);
        
        scanner.close(); // Fecha o scanner
    }
}

