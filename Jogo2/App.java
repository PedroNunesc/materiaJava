/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Jogo2;
/*
 * This source file was generated by the Gradle 'init' task
 */
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("BEM VINDO AO JOGO GUERRA MILITAR!");
    
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
            Historia historia = new Historia();
            
           System.out.println("");
           System.out.println("Clique enter para comecar a historia!");
           String enterhistoria = scanner.nextLine();
           System.out.println(historia.Historia());
            
            System.out.println("");
            System.out.println("Esta na hora de escolher sua classe, irei dar uma breve intruducao para cada uma!");
            System.out.println("Clique enter para escolher!");
            String enter = scanner.nextLine();
            System.out.println("");
                        
                        
System.out.println(historia.Classess());
System.out.println("");
System.out.println("4. Atirador de Assalto:");
System.out.println("A classe com as armas mais conhecidas como as AKs entre outras, pode ser escolhida por favoritismo.");
System.out.println("Tendo uma municao quase infinita e uma vida muito consideravel ela pode se tornar um semiTank.");
System.out.println("Pelo visto estas vieram com defeito entao elas acabaram com o pior dano, que vem junto com uma agilidade mediocre!");
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
                        System.out.println("Opcao invalida. Escolhendo pistoleiro por padrao.");
                        escolhido = pistoleiro;
                break;
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
        
        System.out.println("");
        System.out.println("Voce ira para a linha de frente, e tem que escolher se voce fara parte do pelotao que vai para o Leste ou para o Oeste.");
        System.out.println("Qual voce escolhe?");
        System.out.println("1. Leste");
        System.out.println("2. Oeste");
        int escolha2 = scanner.nextInt();
        int caminho = 0;
        
         switch (escolha2) {
                case 1:
                    caminho = 1;
                    break;
                case 2:
                    caminho = 2;
                    break;
         }
                    
         if (caminho == 1){
             
             System.out.println("");
            System.out.println(historia.inimigo2());
            
        for(int i = 0; inimigo1.VidaInimigo1 > 0 && ArmazenaVida > 0; i ++){
            
            
            System.out.println("");
            System.out.println("Escolha uma uma das opcoes de ataque!");
            System.out.println("1. Atirar");
            System.out.println("2. Lancar granada");
            System.out.println("3. Usar bandagem");
            System.out.println("4. Fugir");
            int escolha1 = scanner.nextInt();

            int danoAtacar;
            int danoBandagem;
            int danoGranada;
            int danoInimigo;
            int danoInimigoFinal;
            
                 switch (escolha1) {
                case 1: 
                    if (ArmazenaMana > 0){
            escolhido.Atirar();
            System.out.println("");
            danoAtacar = inimigo1.VidaInimigo1 - ArmazenaDano;
            inimigo1.VidaInimigo1 = danoAtacar;
            System.out.println("O inimigo recebeu " + ArmazenaDano + " de dano e esta com " + inimigo1.VidaInimigo1 + " de vida!"); // Metodo de Atacar
            
           ArmazenaMana = ArmazenaMana - 1; // retira uma munição apos o ataque
            
            //aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
            
            if (inimigo1.VidaInimigo1 > 0 ){
            danoInimigo = ArmazenaVida - inimigo1.danoInimigo1;
            ArmazenaVida = danoInimigo;
            System.out.println("");
            System.out.println("O seu inimigo te atacou e causou " + inimigo1.danoInimigo1 + " de dano!");
            System.out.println("Agora voce esta com " + ArmazenaVida + " de vida!");
            System.out.println("");
            }
                    } else {
                    System.out.println("Voce não tem municao!");}
            break;
            
                case 2:
                    if (granada.QuantidadeGranada > 0) {
                    escolhido.LancarGranada();
                    granada.UsarGranada();
                    System.out.println("");
            danoGranada = inimigo1.VidaInimigo1 - Granada.danoGranada;
            inimigo1.VidaInimigo1 = danoGranada;
            System.out.println("O inimigo recebeu " + Granada.danoGranada + " de dano e esta com " + inimigo1.VidaInimigo1 + " de vida!");
                        
            //aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
            if (inimigo1.VidaInimigo1 > 0 ){
            danoInimigo = ArmazenaVida - inimigo1.danoInimigo1;
            ArmazenaVida = danoInimigo;
            System.out.println("");
            System.out.println("O seu inimigo te atacou e causou " + inimigo1.danoInimigo1 + " de dano!");
            System.out.println("Agora voce esta com " + ArmazenaVida + " de vida!");
            System.out.println("");
            }
                    } else {
                    System.out.println("Voce nao tem mais granadas!");
                    }
                    break;
                    
                case 3:
                     if (bandagem.QuantidadeBandagem > 0) {
                    escolhido.UsarBandagem();
                    bandagem.CurarBandagem();
            danoBandagem = ArmazenaVida + Bandagem.VidaBandagem;
            ArmazenaVida = danoBandagem;
            System.out.println("Voce recebeu mais " + 15 + " de vida!");
            System.out.println("Agora voce esta com " + ArmazenaVida + " de vida!");
            
            if (inimigo1.VidaInimigo1 > 0 ){
            danoInimigo = ArmazenaVida - inimigo1.danoInimigo1;
            ArmazenaVida = danoInimigo;
            System.out.println("");
            System.out.println("O seu inimigo te atacou e causou " + inimigo1.danoInimigo1 + " de dano!");
            System.out.println("Agora voce esta com " + ArmazenaVida + " de vida!");
            System.out.println("");
            }
                    } else {
                    System.out.println("Voce nao tem mais bandagens!");
                    }
                    break;
                    
                case 4:
                    escolhido.Fugir();
                    System.out.println("Voce nao conseguiu fugir!");
                    
            if (inimigo1.VidaInimigo1 > 0 ){
            danoInimigo = ArmazenaVida - inimigo1.danoInimigo1;
            ArmazenaVida = danoInimigo;
            System.out.println("");
            System.out.println("O seu inimigo te atacou e causou " + inimigo1.danoInimigo1 + " de dano!");
            System.out.println("Agora voce esta com " + ArmazenaVida + " de vida!");
            System.out.println("");
            }
                    break;
                    
                    default:
                    System.out.println("Opcao invalida.");
                    break;
                 }
        }
            
// aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
// aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
// aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa

         } else if (caminho == 2) {
            
            System.out.println("");
            System.out.println(historia.inimigo2());
            
                    for(int ii = 0; inimigo2.VidaInimigo2 > 0 && ArmazenaVida > 0; ii ++){
                        
            System.out.println("");
            System.out.println("Escolha uma uma das opcoes de ataque!");
            System.out.println("1. Atirar");
            System.out.println("2. Lancar granada");
            System.out.println("3. Usar bandagem");
            System.out.println("4. Fugir");
            int escolha3 = scanner.nextInt();

            
                 switch (escolha3) {
                case 1: 
                    if (ArmazenaMana > 0){
            escolhido.Atirar();
            System.out.println("");
            int danoAtacar = inimigo2.VidaInimigo2 - ArmazenaDano;
            inimigo2.VidaInimigo2 = danoAtacar;
            System.out.println("O inimigo recebeu " + ArmazenaDano + " de dano e esta com " + inimigo2.VidaInimigo2 + " de vida!");
            
           ArmazenaMana = ArmazenaMana - 1; // retira uma mana
            
            //aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
            if (inimigo2.VidaInimigo2 > 0 ){
            int danoInimigo2 = ArmazenaVida - inimigo2.danoInimigo2;
            ArmazenaVida = danoInimigo2;
            System.out.println("");
            System.out.println("O seu inimigo te atacou e causou " + inimigo2.danoInimigo2 + " de dano!");
            System.out.println("Agora voce esta com " + ArmazenaVida + " de vida!");
            System.out.println("");
            }
            
                    } else {
                    System.out.println("Voce não tem municao!");}
            break;
            
                case 2:
                    if (granada.QuantidadeGranada > 0) {
                    escolhido.LancarGranada();
                    granada.UsarGranada();
                    System.out.println("");
            int danoGranada = inimigo2.VidaInimigo2 - Granada.danoGranada;
            inimigo2.VidaInimigo2 = danoGranada;
            System.out.println("O inimigo recebeu " + Granada.danoGranada + " de dano e esta com " + inimigo2.VidaInimigo2 + " de vida!");
                        
            //aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
            if (inimigo2.VidaInimigo2 > 0 ){
            int gra2ini2 = ArmazenaVida - inimigo2.danoInimigo2;
            ArmazenaVida = gra2ini2;
            System.out.println("");
            System.out.println("O seu inimigo te atacou e causou " + inimigo2.danoInimigo2 + " de dano!");
            System.out.println("Agora voce esta com " + ArmazenaVida + " de vida!");
            System.out.println("");
            }
                    } else {
                    System.out.println("Voce nao tem mais granadas!");
                    }
                    break;
                    
                case 3:
                     if (bandagem.QuantidadeBandagem > 0) {
                    escolhido.UsarBandagem();
                    bandagem.CurarBandagem();
            int danoBandagem = ArmazenaVida + Bandagem.VidaBandagem;
            ArmazenaVida = danoBandagem;
            System.out.println("Voce recebeu mais " + 15 + " de vida!");
            System.out.println("Agora voce esta com " + ArmazenaVida + " de vida!");
            
            if (inimigo2.VidaInimigo2 > 0 ){
            int danoInimigo = ArmazenaVida - inimigo2.danoInimigo2;
            ArmazenaVida = danoInimigo;
            System.out.println("");
            System.out.println("O seu inimigo te atacou e causou " + inimigo2.danoInimigo2 + " de dano!");
            System.out.println("Agora voce esta com " + ArmazenaVida + " de vida!");
            System.out.println("");
            }
                    } else {
                    System.out.println("Voce nao tem mais bandagens!");
                    }
                    
                case 4:
                    escolhido.Fugir();
                    System.out.println("Voce nao conseguiu fugir!");
                    
            if (inimigo1.VidaInimigo1 > 0 ){
            int fu1iniF = ArmazenaVida - inimigo1.danoInimigo1;
            ArmazenaVida = fu1iniF;
            System.out.println("");
            System.out.println("O seu inimigo te atacou e causou " + inimigo1.danoInimigo1 + " de dano!");
            System.out.println("Agora voce esta com " + fu1iniF + " de vida!");
            System.out.println("");
            }
                    break;
                    
                    default:
                    System.out.println("Opcao invalida.");
                    break;
            }   
            
        }
    }
        int caminhoo = caminho;
        if (caminhoo == 1) {
             if (inimigo1.VidaInimigo1 <= 0) {
            System.out.println("O inimigo foi derrotado!");
            System.out.println("");
            System.out.println(historia.ContinuaIni1());
            System.out.println("");
        }} else if ( caminhoo == 2) {
            if (inimigo2.VidaInimigo2 <= 0) {
            System.out.println("O inimigo foi derrotado!");
            System.out.println("");
            System.out.println(historia.ContinuaIni2());
            System.out.println("");
        }}  
               
         scanner.nextLine(); // limpa o scanner OBRIGATORIO
         if (ArmazenaVida > 0 ) {
         System.out.println("Clique enter para seguir com a historia!");
          String enter1000 = scanner.nextLine();}
         
         // aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
         // aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
         int caminho2 = caminho;
         
          if (caminho2 == 1){
              if (inimigo1.VidaInimigo1 <= 0) {
            
            System.out.println(historia.ContinuaIni1());
            int danoBonus = ArmazenaDano + 5;
            ArmazenaDano = danoBonus;
            }
          
          } else if (caminho2 == 2){
         if (inimigo1.VidaInimigo1 <= 0) {
            
            System.out.println(historia.ContinuaIni2());
            int vidaBonus = ArmazenaVida + 7;
            ArmazenaVida = vidaBonus;
           } 
         
          //aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
          
          }  
           if (ArmazenaVida > 0){
             
             System.out.println("");
            System.out.println(historia.HistoriainiF());
            
        for(int iii = 0; inimigoFinal.VidaInimigoF > 0 && ArmazenaVida > 0; iii ++){
            
            
            System.out.println("");
            System.out.println("Escolha uma uma das opcoes de ataque!");
            System.out.println("1. Atirar");
            System.out.println("2. Lancar granada");
            System.out.println("3. Usar bandagem");
            System.out.println("4. Fugir");
            int escolha5 = scanner.nextInt();

            
                 switch (escolha5) {
                case 1: 
                    if (ArmazenaMana > 0){
            escolhido.Atirar();
            System.out.println("");
            int dano1 = ArmazenaDano;
            int novaVidaInimigoF = inimigoFinal.VidaInimigoF - dano1;
            inimigoFinal.VidaInimigoF = novaVidaInimigoF;
            System.out.println("O inimigo recebeu " + dano1 + " de dano e esta com " + inimigoFinal.VidaInimigoF + " de vida!");
            
           ArmazenaMana = ArmazenaMana - 1; 
            
            //aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
            if (inimigoFinal.VidaInimigoF > 0 ){
            int dano3iniF = ArmazenaVida - inimigoFinal.danoInimigoF;
            ArmazenaVida = dano3iniF;
            System.out.println("");
            System.out.println("O seu inimigo te atacou e causou " + inimigoFinal.danoInimigoF + " de dano!");
            System.out.println("Agora voce esta com " + dano3iniF + " de vida!");
            System.out.println("");
            }
                    } else {
                    System.out.println("Voce nao tem municao!");}
            break;
            
                case 2:
                    if (granada.QuantidadeGranada > 0) {
                    escolhido.LancarGranada();
                    granada.UsarGranada();
                    System.out.println("");
            int novaVidaInimigoF = inimigoFinal.VidaInimigoF - Granada.danoGranada;
            inimigoFinal.VidaInimigoF = novaVidaInimigoF;
            System.out.println("O inimigo recebeu " + 15 + " de dano e esta com " + inimigoFinal.VidaInimigoF + " de vida!");
                        
            //aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
            if (inimigoFinal.VidaInimigoF > 0 ){
            int gra3iniF = ArmazenaVida - inimigoFinal.danoInimigoF;
            ArmazenaVida = gra3iniF;
            System.out.println("");
            System.out.println("O seu inimigo te atacou e causou " + inimigoFinal.danoInimigoF + " de dano!");
            System.out.println("Agora voce esta com " + gra3iniF + " de vida!");
            System.out.println("");
            }
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
            
            if (inimigoFinal.VidaInimigoF > 0 ){
            int ban3iniF = ArmazenaVida - inimigoFinal.danoInimigoF;
            ArmazenaVida = ban3iniF;
            System.out.println("");
            System.out.println("O seu inimigo te atacou e causou " + inimigoFinal.danoInimigoF + " de dano!");
            System.out.println("Agora voce esta com " + ban3iniF + " de vida!");
            System.out.println("");
            }
                    } else {
                    System.out.println("Voce nao tem mais bandagens!");
                    }
                    break;
                    
                case 4:
                    escolhido.Fugir();
                    System.out.println("Voce nao conseguiu fugir!");
                    
                    if (inimigoFinal.VidaInimigoF > 0 ){
            int fu1iniF = ArmazenaVida - inimigoFinal.danoInimigoF;
            ArmazenaVida = fu1iniF;
            System.out.println("");
            System.out.println("O seu inimigo te atacou e causou " + inimigoFinal.danoInimigoF + " de dano!");
            System.out.println("Agora voce esta com " + fu1iniF + " de vida!");
            System.out.println("");
            }
                    break;
                    
                    default:
                    System.out.println("Opcao invalida.");
                    break;
                    
                    case 5:
                        System.out.println("Hack");
                        int hack = ArmazenaDano + 1000;
                        ArmazenaDano = hack;
                        break;
                 }
        }
           } 
           int novainifinal = inimigoFinal.VidaInimigoF;
           if (novainifinal <= 0) {
            System.out.println("O inimigo foi derrotado!");
            System.out.println("");
            System.out.println(historia.ContinuaIniF());
            
            } else if (ArmazenaVida <= 0) {
            System.out.println("Voce foi derrotado!");

            }
           }
}          
    