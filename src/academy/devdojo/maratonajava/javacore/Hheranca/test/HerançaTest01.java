package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Endereço;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Pessoa;


public class HerançaTest01 {
    public static void main(String[] args) {
        Endereço endereço = new Endereço();
        endereço.setRua("Rua Virgílio");
        endereço.setCep("015044-220");
        Pessoa pessoa = new Pessoa("Emanuel Gonzaga");
        pessoa.setCpf("35.785.955-12");
        pessoa.setEndereço(endereço);

        pessoa.imprime();
        System.out.println("--------------");

        Funcionario funcionario = new Funcionario("Josué");
        funcionario.setCpf("252265225");
        funcionario.setEndereço(endereço);
        funcionario.setSalario(2500.00);

        funcionario.imprime();

        System.out.println("--------------");

        funcionario.relatorioPagamento();
    }
}
