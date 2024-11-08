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

public class Frase {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        String meuNome;
        int minhaIdade;
        double minhaAltura; 
        
        System.out.println("Digite seu nome: ");
        meuNome = sc.nextLine();
        
        System.out.println("Digite sua idade: ");
        minhaIdade = sc.nextInt();
        
        System.out.println("Digite sua altura: ");
        minhaAltura = sc.nextDouble();
        
        System.out.println("Olá meu nome é " + meuNome + " tenho " + minhaIdade + " de idade, e " + minhaAltura + " de altura.");
    }
}