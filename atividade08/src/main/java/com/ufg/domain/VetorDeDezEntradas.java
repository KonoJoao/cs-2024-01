package com.ufg.domain;

import java.util.Scanner;

public class VetorDeDezEntradas {

    public VetorDeDezEntradas(){
        System.out.println("digite os números de entrada para o array");
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int valor = scanner.nextInt();
        int i = 0;

        while(valor != 0){
            vetor[i] = valor;
            valor = scanner.nextInt();
            i++;
        }
    }
}
