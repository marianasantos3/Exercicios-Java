package com.company.exerciciosjava1;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double fahrenheit;

        System.out.println("Digite a temperatura em celsius: ");
        double celsius = sc.nextDouble();


        fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Temperatura em fahrenheit: " + fahrenheit);
    }
}
