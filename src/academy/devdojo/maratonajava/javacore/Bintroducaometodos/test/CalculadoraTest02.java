package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicaDoisNumeros(5,5.5F);

        double result = calculadora.divideDoisNumeros(20,2);
        System.out.println(result);

        System.out.println(calculadora.divideDoisNumeros1(20,2));
        calculadora.imprimiDivisaoDeDoisNumeros(86,0);
    }
}
