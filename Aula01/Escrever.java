/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula01;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */

import java.util.Scanner;

public class Escrever {
    public static void main(String[]args){
        // Cria um objeto Scanner para ler a entrada do usuario
                Scanner sc = new Scanner(System.in);
                
         int numero1, numero2;
         
         String nome;
         
        System.out.println("Digite um número: ");
        numero1 = sc.nextInt();
         
        System.out.println("Digite outro número: ");
        numero2 = sc.nextInt();
        
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        sc.nextLine();
        
        System.out.println("Aqui está o resultado," + nome + ":" + (numero1 + numero2));
    }
}
