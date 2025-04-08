/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tratamentoDeExcessoes;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class Exemplo2BlocoFinally {

    // Bloco finally: O bloco finally é opcional e é usado para executar código que deve rodar independentemente de uma exceção ter ocorrido ou não.
    // Isso é útil, por exemplo, para fechar conexões com banco de dados ou liberar recursos.
    
    public static void main(String[] args) {
        try {
            int[] numeros = {10, 20, 30, 40, 50};
            System.err.println(numeros[8]);
        } catch (Exception error) {
            System.err.println("Erro: " + error.getMessage());
        }
    }
}
