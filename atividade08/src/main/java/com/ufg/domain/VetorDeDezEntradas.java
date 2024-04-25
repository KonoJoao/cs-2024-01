package com.ufg.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VetorDeDezEntradas {

    public VetorDeDezEntradas(){
        System.out.println("digite os números de entrada para o array");
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int valor = scanner.nextInt();
        int i = 0;

        while(valor != 0){
            try {
                vetor[i] = valor;
                valor = scanner.nextInt();
                i++;
            }  catch(ArrayIndexOutOfBoundsException exception){
            throw new Error("você tentou colocar dados em espaço de memoria invalido");
        } catch(InputMismatchException exception){
            throw new Error("insira dados númericos");
        }
        }
    }
}
