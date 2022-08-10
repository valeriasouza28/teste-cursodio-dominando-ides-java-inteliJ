package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int a, b;
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int soma = soma(a,b);
        int subtracao = subtracao(a, b);
        double divisao = divisao(a, b);
        int multiplicao = multiplicao(a, b);

        System.out.println("soma: " + soma);
        System.out.println("subtarção: " + subtracao);
        System.out.println("divisão: " + divisao);
        System.out.println("multiplicação: " + multiplicao);


    }

    public static int soma(int a, int b) {
        return a + b;
    }


    public static int subtracao(int a, int b) {
        return a - b;
    }

    public static double divisao(double a, double b) {
        return a / b;
    }

    public static int multiplicao(int a, int b) {
        return a * b;
    }
}

