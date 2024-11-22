/*
 * This source file was generated by the Gradle 'init' task
 */
package com.example.Jogo2;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
            System.out.println("Escolha o nome do seu personagem");
            String nomePersonagem = scanner.nextLine();
            
            Espingardeiro espingardeiro = new Espingardeiro();
            Sniper sniper = new Sniper();
            Pistoleiro pistoleiro = new Pistoleiro();
            AtiradorAssalto atiradorAssalto = new AtiradorAssalto();
            Inimigo1 inimigo1 = new Inimigo1();
            Inimigo2 inimigo2 = new Inimigo2();
            InimigoFinal inimigoFinal = new InimigoFinal();
            Granada granada = new Granada();
            Bandagem bandagem = new Bandagem();
            
            System.out.println("\nEscolha a sua classe de Personagem:");
            System.out.println("1. Espingardeiro");
            System.out.println("2. Sniper");
            System.out.println("3. Pistoleiro");
            System.out.println("4. Atirador de Assalto");
            int escolha = scanner.nextInt();
            
            Personagem escolhido = null;
            
                 switch (escolha) {
                case 1:
                    escolhido = espingardeiro;
                    break;
                case 2:
                    escolhido = sniper;
                    break;
                case 3:
                    escolhido = pistoleiro;
                    break;
                case 4:
                    escolhido = atiradorAssalto;
                    break;
                    default:
                System.out.println("Opcao invalida.");
                return;
            }

         int numero1 = 0;
         int numero2 = 0;
         int numero3 = 0;
         int numero4 = 0;

        if (escolhido instanceof Espingardeiro) {
            numero1 = 3;
            numero2 = 4;
            numero3 = 2;
            numero4 = 1;
        } else if (escolhido instanceof Sniper) {
            numero1 = 4;
            numero2 = 2;
            numero3 = 1;
            numero4 = 3;
        } else if (escolhido instanceof Pistoleiro) {
            numero1 = 2;
            numero2 = 1;
            numero3 = 3;
            numero4 = 4;
        } else if (escolhido instanceof AtiradorAssalto) {
            numero1 = 1;
            numero2 = 3;
            numero3 = 4;
            numero4 = 2;
        }
        
        String palavra1 = (numero1 == 1) ? "dado" : "dados";
        String palavra2 = (numero2 == 1) ? "dado" : "dados";
        String palavra3 = (numero3 == 1) ? "dado" : "dados";
        String palavra4 = (numero4 == 1) ? "dado" : "dados";
    
         /*aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa*/
                 
        System.out.println("");
        System.out.println("Agora defina seus atributos rolando os dados!");
        
        System.out.println("Voce tem " + numero1 +" "+ palavra1 + " para o dano");
        Scanner scanner1 = new Scanner(System.in);
        int ArmazenaDano = escolhido.Dano();
        
        System.out.println("Voce quer rolar os dados? (s/n): ");
        String resposta1 = scanner1.nextLine();
        if (resposta1.equals("s")) {
           System.out.println("Dano: " + ArmazenaDano);
        } else {
            System.out.println("Voce nao tem opcao, entao irei rolar os dados por voce!");
            System.out.println("Dano: " + ArmazenaDano);
        }
        System.out.println("");
         /*aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa*/
        
          System.out.println("Voce tem " +numero2 +" "+palavra2 + " para a vida");
          Scanner scanner2 = new Scanner(System.in);
        int ArmazenaVida = escolhido.Vida();
          
        System.out.println("Voce quer rolar os dados? (s/n): ");
        String resposta2 = scanner2.nextLine();
        if (resposta2.equals("s")) {
           System.out.println("Vida: " + ArmazenaVida);
        } else {
            System.out.println("Voce nao tem opcao, entao irei rolar os dados por voce!");
            System.out.println("Vida: " + ArmazenaVida);
        }
        System.out.println("");
        /*aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa*/

        System.out.println("Voce tem " + numero3 +" "+ palavra3 + " para a municao");
        Scanner scanner3 = new Scanner(System.in);
        int ArmazenaMana = escolhido.Mana();
        
        System.out.println("Voce quer rolar os dados? (s/n): ");
        String resposta3 = scanner3.nextLine();
        if (resposta3.equals("s")) {
           System.out.println("Municao: " + ArmazenaMana);
        } else {
            System.out.println("Voce nao tem opcao, entao irei rolar os dados por voce!");
             System.out.println("Municao: " + ArmazenaMana);
        }
       System.out.println("");
        /*aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa*/
        
        System.out.println("Voce tem " + numero4 +" "+ palavra4 +" para a agilidade");
        Scanner scanner4 = new Scanner(System.in);
        int ArmazenaAgilidade = escolhido.Agilidade();
        
        System.out.println("Voce quer rolar os dados? (s/n): ");
        String resposta4 = scanner4.nextLine();
        if (resposta4.equals("s")) {
           System.out.println("Agilidade: " + ArmazenaAgilidade);
        } else {
            System.out.println("Voce nao tem opcao, entao irei rolar os dados por voce!");
            System.out.println("Agilidade: " + ArmazenaAgilidade);
        }
        System.out.println("");
        /*aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa*/
       
        System.out.println("Aqui estao seus atributos:");
        System.out.println("Nome: " + nomePersonagem);
        System.out.println("Dano: " + ArmazenaDano);
        System.out.println("Vida: " + ArmazenaVida);
        System.out.println("Municao: " + ArmazenaMana);
        System.out.println("Agilidade: " + ArmazenaAgilidade);
        
                    
        for(int i = 0; inimigo1.VidaInimigo1 > 0 || escolhido.Vida() > 0; i ++){
            
            System.out.println("");
            System.out.println("Escolha uma uma das opcoes de ataque!");
            System.out.println("1. Atirar");
            System.out.println("2. Lancar granada");
            System.out.println("3. Usar bandagem");
            System.out.println("4. Fugir");
            int escolha1 = scanner.nextInt();
            
            int dano1 = 0;

            
                 switch (escolha1) {
                case 1: 
            escolhido.Atirar();
            dano1 = ArmazenaDano;
            int novaVidaInimigo = inimigo1.VidaInimigo1 - dano1;
            inimigo1.VidaInimigo1 = novaVidaInimigo;
            System.out.println("O inimigo recebeu " + dano1 + " de dano e esta com " + inimigo1.VidaInimigo1 + " de vida!");
            break;
                case 2:
                    if (granada.QuantidadeGranada > 0) {
                    escolhido.LancarGranada();
                    granada.UsarGranada();
            int novaVidaInimigo1 = inimigo1.VidaInimigo1 - Granada.danoGranada;
            inimigo1.VidaInimigo1 = novaVidaInimigo1;
            System.out.println("O inimigo recebeu " + 15 + " de dano e esta com " + inimigo1.VidaInimigo1 + " de vida!");
                    } else {
                    System.out.println("Voce nao tem mais granadas!");
                    }
                    break;
                case 3:
                     if (bandagem.QuantidadeBandagem > 0) {
                    escolhido.UsarBandagem();
                    bandagem.CurarBandagem();
            int novaVida = ArmazenaVida + Bandagem.VidaBandagem;
            ArmazenaVida = novaVida;
            System.out.println("Voce recebeu mais " + 15 + " de vida!");
            System.out.println("Agora voce esta com " + ArmazenaVida + " de vida!");
                    } else {
                    System.out.println("Voce nao tem mais bandagens!");
                    }
                    break;
                case 4:
                    escolhido.Fugir();
                    break;
                    default:
                System.out.println("Opcao invalida.");
                return;
            }
                 
            System.out.println("");
                 
            if (inimigo1.VidaInimigo1 <= 0) {
            System.out.println("O inimigo foi derrotado!");
            break;  
            } else if (escolhido.Vida() <= 0) {
            System.out.println("Você foi derrotado!");
            break; 
    }
        }
    }
}