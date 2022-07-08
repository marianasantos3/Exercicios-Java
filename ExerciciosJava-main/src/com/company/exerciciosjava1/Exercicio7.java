package com.company.exerciciosjava1;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = 8, n2 = 9, n3 = 7, n4 = 4, n5 = 5, n6 = 6, somaMedias, media1, media2, media3;

        media1 = (n1 + n2 + n3) / 3;
        media2 = (n4 + n5 + n6) / 3;
        somaMedias = media1 + media2;
        media3 = (media1 + media2) / 2;

        System.out.println("A media do numeros 8, 9 e 7 é: " + media1);
        System.out.println("A media do numeros 4, 5 e 6 é: " + media2);
        System.out.println("A soma das duas medias é: " + somaMedias);
        System.out.println("A media das medias é: " + media3);

    }
}
