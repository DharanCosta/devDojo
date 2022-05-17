package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.Repository.Repositorio;

public class RepositorioMemoria implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
