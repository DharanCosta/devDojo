package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;

public class HerancaTest02 {
    //0 - Bloco de inicialização estático da super classe é executado
    //1 - Bloco de inicialização estático da sub classe é executado
    //2 - Alocado espaço em memória para objeto classe pai/ superclasse
    //3 - Cada atributo da classe é criado e inicializado com valores default
    //4 - Bloco de inicialização da superclasse é executado na ordem em que apareçe
    //5 - Construtor da superclasse é executado
    //6 - Alocado espaço em memória para objeto classe filho/subclasse
    //3 - Cada atributo da classe é criado e inicializado com valores default
    //4 - Bloco de inicialização da subclasse é executado na ordem em que apareçe
    //5 - Construtor da subclasse é executado


    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Magno");
    }
}
