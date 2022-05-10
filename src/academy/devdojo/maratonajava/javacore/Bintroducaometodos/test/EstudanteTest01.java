package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Luffy";
        estudante01.idade = 21;
        estudante01.sexo='M';

        estudante02.nome = "Laffy";
        estudante02.idade = 25;
        estudante02.sexo='F';

        impressora.imprime(estudante01);
        System.out.println("---------");
        impressora.imprime((estudante02));

        System.out.println("---------");
        System.out.println(estudante01.nome+" "+estudante01.idade+" "+estudante01.sexo);
        System.out.println(estudante02.nome+" "+estudante02.idade+" "+estudante02.sexo);
    }


}
