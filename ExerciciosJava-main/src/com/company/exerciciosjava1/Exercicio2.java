package com.company.exerciciosjava1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        if(numero % 10 == 0){
            System.out.print("Esse número é divisivel por 10");
        } else if(numero % 5 == 0){
            System.out.print("Esse número é divisivel por 5");
        }else if(numero % 2 == 0){
            System.out.print("Esse número é divisivel por 2");
        }else{
            System.out.print("Não é possível dividir");
        }
    }
}
