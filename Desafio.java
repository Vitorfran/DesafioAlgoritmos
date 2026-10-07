package DesafioAlgoritmos;

import java.util.Scanner;

public class Desafio {

    /*
     * 
     * int soma = 0;
     * int maior = dados[0];
     * for (int valor : dados) {
     * soma += valor;
     * if (valor > maior) {
     * maior = valor;
     * }
     * }
     * 
     * double media = (double) soma / dados.length;
     * System.out.println("Média: " + media);
     * System.out.println("Maior valor: " + maior);
     */

    // Processamento

    // Metodos

    public static int Soma(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public static int Maior_Numero(int[] numeros) {
        int maior = numeros[0];
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }

        }
        return maior;
    }
    
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int[] dados = new int[5];


        System.out.println("------ Desafio de Algoritmos -----");
        System.out.println("------       EQUIPE 4        -----");

        // Entrada

        for (int i = 0; i < dados.length; i++) {
            System.out.print("Informe um número: ");

            try {
                dados[i] = scanner.nextInt();
            } catch (Exception e) {
                System.out.print("Entrada inválida. Por favor, informe um número inteiro. \n");
                scanner.nextLine(); // Limpa o buffer do scanner
                i--; // Tenta novamente
            }
        }

        // Saida
        System.out.println("\n------ Resultados -----");

        int soma = Soma(dados);
        System.out.println("Numeros informados: " + java.util.Arrays.toString(dados));
        System.out.println("\nSoma dos números informados: " + soma);

        int maior = Maior_Numero(dados);
        System.out.println("Maior número informado: " + maior);

        scanner.close();
    }

}
