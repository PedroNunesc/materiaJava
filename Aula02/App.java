/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Aula02;
public class App { 

    public static void main(String[]args){
        Pessoa pessoa1 = new Pessoa ("Pedro", 15 );
        pessoa1.apresentar();
        
        Carro carro1 = new Carro ("Fusca", 1999, "Volkswagen" );
        carro1.apresentar1();

        Animal animal1 = new Animal ("Tigre", 15, 100 );
        animal1.apresentar2();
        
        Veiculo veiculo1 = new Veiculo ("Volkswagem" );
        veiculo1.exibirMarca();
    }
}
   /* public static void main(String[] args) {
    
        double numero1 = 50;
        double numero2 = 30;
        
        // Operadores Aritiméticos
        double soma = numero1 + numero2;
        double sub = numero1 - numero2;
        double multi = numero1 * numero2;
        double div = numero1 / numero2;
        double modulo = numero1 % numero2;
        
        System.out.println(soma);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
        System.out.println(modulo);

        // Comparadores
        System.out.println(numero1 == numero2); // False
        System.out.println(numero1 != numero2); // True 
        System.out.println(numero1 > numero2); // True
        System.out.println(numero1 >= numero2); // True
        System.out.println(numero1 < numero2); // False
        System.out.println(numero1 <= numero2); // False

        // Operadores Lógicos
        boolean ligado = true;
        boolean quebrado = false;
        
        System.out.println(ligado && quebrado); // False
        System.out.println(ligado || quebrado); // True
        System.out.println(ligado && !quebrado); // True
        
        // If 
        int idade = 29;
    boolean maiorIdade = idade >= 18;
    boolean temCarteira = true;
    
        if (maiorIdade && temCarteira) {
    System.out.println("Você pode dirigir.");
} else if (maiorIdade){
    System.out.println("Você é de maior mais não tem carteira!");
}   else{
    System.out.println("Você é de menor, logo não pode dirigir!");
}

    String time = "Grêmio";
    
    switch(time){
        case "Grêmio":
            System.out.println("Maior do sul");
        break;
        
        case "Inter":
            System.out.println("Menor do sul");
        break;
        
        default:
            System.out.println("Não conheço esse time");
        break;
    }  
        
       // Loops
        int voltas = 0;
while (voltas <= 10) {
    System.out.println("Você já pedalou " + voltas + " voltas!");
    voltas++;
}

       
       for (int contagem = 0; contagem <= 10; contagem++) {
    System.out.println(contagem);
}

    }
       
       // Classes 
       
    }    
*/