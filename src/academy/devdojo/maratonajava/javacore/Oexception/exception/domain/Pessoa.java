package academy.devdojo.maratonajava.javacore.Oexception.exception.domain;

import java.io.FileNotFoundException;

public class Pessoa {

    public void salva() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando Pessoa");
    }
}
