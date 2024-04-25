package com.ufg.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoDeDoisNumeros {
    private Scanner scanner = new Scanner(System.in);

    public DivisaoDeDoisNumeros() {
        try{
            System.out.println("digite o primeiro número");
            int num1 = scanner.nextInt();
            System.out.println("digite o segundo número");
            int num2 = scanner.nextInt();
            int resultado = num1/num2;
            System.out.println(resultado);
        } catch(ArithmeticException exception){
                throw new Error("você tentou dividir por 0");
        } catch(InputMismatchException exception){
            throw new Error("insira dados númericos");
        }
    }

}
