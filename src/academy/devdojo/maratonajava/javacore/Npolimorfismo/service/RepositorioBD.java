package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.Repository.Repositorio;

public class RepositorioBD implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de dados");
    }
}
