package com.company.exerciciosjava1;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double real, dolar, cotacao;

        System.out.println("Digite uma quantidade em dolar: " );
        dolar = sc.nextDouble();

        System.out.println("Digite a cotação do dolar: " );
        cotacao = sc.nextDouble();

        real = dolar * cotacao;

        System.out.printf("Você possui em reais: " + real);
    }
}
