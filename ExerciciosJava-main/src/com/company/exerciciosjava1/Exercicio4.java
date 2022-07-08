package com.company.exerciciosjava1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int valorA, valorB, valorC;

        System.out.println("Digite o primeiro valor: ");
        valorA = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        valorB = sc.nextInt();

        System.out.println("Digite o Terceiro valor: ");
        valorC = sc.nextInt();

        if (valorA > valorB){
            if(valorB > valorC){
                System.out.println("valorA \n" + "valorB \n" + "valorC");
            }else{
                if (valorA > valorC){
                    System.out.println("valorA \n" + "valorC \n" + "valorB");
                }else{
                    System.out.println("valorC \n" + "valorA \n" + "valorB");
                }
            }
        }

        if(valorB > valorC) {
            if (valorA > valorC) {
                System.out.println("valorB" + "valorA" + "valorC" );
            } else {
                System.out.println("valorB" + "valorC" + "valorA" );
            }
        } else {
            System.out.println("valorC" + "valorB" + "valorA" );
        }
    }
}
