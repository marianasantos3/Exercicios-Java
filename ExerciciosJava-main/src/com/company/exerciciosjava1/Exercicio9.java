package com.company.exerciciosjava1;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int numero, antecessor, sucessor;

        System.out.println("Informe um numero : ");
        numero = sc.nextInt();

        antecessor = numero - 1;
        sucessor = numero + 1;

        System.out.println("O Antecessor do " + numero + " é: " + antecessor);
        System.out.println("O Sucessor do " + numero + " é: " + sucessor);



    }
}
