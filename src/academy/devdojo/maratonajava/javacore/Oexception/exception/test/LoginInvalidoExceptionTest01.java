package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }


    private static void logar() throws LoginInvalidoException{
        Scanner teclado = new Scanner(System.in);
        String usernameDB ="Goku";
        String senhaDB ="ssj";
        System.out.println("Usuário:");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha:");
        String senhaDigitado = teclado.nextLine();

        if(!usernameDB.equals(usernameDigitado) || !senhaDigitado.equals(senhaDigitado)){
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }
        System.out.println("Usuário logado com sucesso");

    }
}
