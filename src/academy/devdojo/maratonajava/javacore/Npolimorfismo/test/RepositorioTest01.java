package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.Repository.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.RepositorioBD;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.RepositorioMemoria;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBD();
        repositorio.salvar();

        Repositorio repositorio1 = new RepositorioArquivo();
        repositorio1.salvar();

        Repositorio repositorio2 = new RepositorioMemoria();
        repositorio2.salvar();
    }
}
