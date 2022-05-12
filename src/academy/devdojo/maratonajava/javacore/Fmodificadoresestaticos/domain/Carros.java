package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.domain;

public class Carros {
    private String nome;
    private double velocidadeMax;
    public static double velocidadeLimite =250;

    public Carros(String nome, double velocidadeMax){
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public void imprime(){
        System.out.println("-------------");
        System.out.println("Nome "+ this.nome);
        System.out.println("Velocidade Máxima "+ this.velocidadeMax);
        System.out.println("Velocidade Limite "+ Carros.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carros.velocidadeLimite = velocidadeLimite;
    }
    public static double getVelocidadeLimite(){
        return Carros.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

}
