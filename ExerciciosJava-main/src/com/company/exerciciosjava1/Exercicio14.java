package com.company.exerciciosjava1;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor, soma = 0;

        for (int i = 1; i < 11; i++) {
            System.out.println(i + " Insira um numero: " );
            valor = entrada.nextInt();
            soma += valor;
        }

        System.out.println(soma);
    }
}
