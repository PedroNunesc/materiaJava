/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tratamentoDeExcessoes;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class Exemplo1tryEcatch {

    // Bloco try e catch: O bloco try contém o código que pode gerar uma exceção.
    // O bloco catch é responsável por capturar e tratar essa exceção.
    
    // psv + Ctrl + enter. Para o main
    public static void main(String[] args) {
        // Estou tentando fazer uma divisão
        try {
            int resultado = 10 / 0;
            System.out.println(resultado);
        }
        // se não der certo, e gerar uma excessão, ele captura a excessão e me mostre qual foi
        catch (Exception error) {
            System.err.println("Erro: " + error.getMessage());
        }
        System.err.println("Foi ");
    }
}
