package com.ufg.domain;

import com.ufg.exception.SaldoInsuficienteException;

import java.util.Scanner;

public class ContaBancaria {
    private static double saldo;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws SaldoInsuficienteException {
        System.out.println("Digite o saldo da conta");
        double valor = scanner.nextDouble();
        saldo = valor;
        while(saldo != 0) {
            System.out.println("O que deseja fazer?\n1-Depositar\n2-Sacar");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    depositar();
                    break;
                case 2:
                    sacar();
                    break;
            }
        }
    }

    public static void depositar(){
        System.out.println("quanto deseja depositar?");
        double valor = scanner.nextDouble();
        saldo += scanner.nextDouble();
    }

    public static void sacar() throws SaldoInsuficienteException {
        System.out.println("quanto deseja sacar?");
        double valor = scanner.nextDouble();
        if(valor > saldo)
            throw new SaldoInsuficienteException("Você não tem saldo suficiente");
    }
}
