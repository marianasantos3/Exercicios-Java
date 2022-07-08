package com.company.exerciciosjava1;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double valor;

        System.out.println("Insira o IPI: ");
        double ipi = sc.nextDouble();

        System.out.println("Digite o código do produto 01. : ");
        int codigo1 = sc.nextInt();
        System.out.println("Digite o valor do produto 01. : ");
        double valor1 = sc.nextDouble();
        System.out.println("Digite a quantidade do produto 01. : ");
        int quantia1 = sc.nextInt();

        System.out.println("Digite o código do produto 02. : ");
        int codigo2 = sc.nextInt();
        System.out.println("Digite o valor do produto 02. : ");
        double valor2 = sc.nextDouble();
        System.out.println("Digite a quantidade do produto 02. : ");
        int quantia2 = sc.nextInt();

        valor = (valor1*quantia1*valor2*quantia2)*(ipi/100+1);

        System.out.println("Total: " + valor);

    }
}
