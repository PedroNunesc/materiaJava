/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tratamentoDeExcessoes;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class Exemplo3ExcecoesComThrow {

    // Lançando exceções com throw:
    // Se quisermos forçar uma exceção personalizada, podemos usar throw.
    
    static void verificarIdade(int idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("A idade deve ser maior ou igual a 18!");
        }
        System.out.println("Acesso permitido.");
    }

    public static void main(String[] args) {
        try {
            verificarIdade(16); // Vai lançar uma exceção
        } catch (Exception error) {
            System.err.println("Error: " + error.getMessage());
        }
    }
}
