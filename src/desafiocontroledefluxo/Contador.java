package desafiocontroledefluxo;


import java.util.Scanner;



public class Contador {
    public static void main(String[] args){
      System.out.println("-----------------Desafio Controle de fluxo-----------------");
        System.out.println("Digite dois valores para saber o numero.");
        System.out.println("primeiro valor: ");
        Scanner scanner = new Scanner(System.in);
        int paramentro1 = lerInteiro(scanner);

        System.out.println("segundo valor: ");
        int paramentro2 = lerInteiro(scanner);

        try {
            contar(paramentro1, paramentro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int diferenca = parametroDois - parametroUm;
            for (int i = 1; i <= diferenca; ++i) {
                System.out.println("Imprimindo a " + i + "ª interaao: " + i);
            }
        }
    }

    public static int lerInteiro(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite um numero inteiro:");
            }
        }   
        
    }
    
}
