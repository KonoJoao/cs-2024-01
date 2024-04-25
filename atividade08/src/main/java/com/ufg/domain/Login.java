package com.ufg.domain;

import com.ufg.exception.LoginInvalidoException;

import java.util.Scanner;

public class Login {

    public Login() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu usuário");
        String usuario = scanner.nextLine();
        System.out.println("Digite sua senha");
        String senha = scanner.nextLine();
        this.fazer_login(usuario, senha);
    }

    private boolean fazer_login(String usuario, String senha) throws LoginInvalidoException {
        if (usuario.equals("admin") && senha.equals("123")) {
            System.out.println("Logado");
            return true;
        } else {
            throw new LoginInvalidoException("Login inválido");
        }
    }
}
