package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();

        func1.setNome("Tomas");
        func1.setIdade(33);
        func1.setSalarios(new double[]{2500.00,2700.00,3560.00});

        func1.imprime();
        System.out.println("\n----------");
        func1.mediaSalarios();

    }
}
