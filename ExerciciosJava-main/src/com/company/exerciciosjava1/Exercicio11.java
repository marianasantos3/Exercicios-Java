package com.company.exerciciosjava1;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        Double salario = sc.nextDouble();
        Double vendas = sc.nextDouble();

        Double salarioFinal = ((vendas * 15) / 100);


        System.out.println("Nome: " + nome);
        System.out.printf("Salário Fixo: %.2f \n", salario);
        System.out.printf("Salário Final: %.2f \n", salarioFinal + salario);

    }
}
