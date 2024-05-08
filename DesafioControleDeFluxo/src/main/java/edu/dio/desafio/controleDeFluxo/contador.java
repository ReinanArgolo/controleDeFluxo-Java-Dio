package edu.dio.desafio.controleDeFluxo;
import java.util.Scanner;


public class contador {

    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primerio número:");
        int inicio = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int fim = scanner.nextInt();

        try {
            subtrairNumeros(inicio, fim);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo valor deve ser maior que o primeiro.");;
        }
    }

    public static void subtrairNumeros(int inicio, int fim) throws ParametrosInvalidosException {
        if (inicio > fim) {
            throw new ParametrosInvalidosException();
        }

        int subtracao = fim - inicio;

        imprimirNumeros(subtracao);
    }


    public static void imprimirNumeros(int valor) {

        for (int i = 1; i <= valor+1; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

