package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Carro;

import java.util.List;

public class RentalService <T>{
    private List<T> automoveisDisponiveis;
    public RentalService(List<T> automoveisDisponiveis){
        this.automoveisDisponiveis = automoveisDisponiveis;
    }

    public T retrieveAvailable(){
        System.out.println("Buscando objeto disponível...");
        T t = automoveisDisponiveis.remove(0);
        System.out.println("Alugando objeto: "+t);
        System.out.println("Objetos disponíveis para alugar:");
        System.out.println(automoveisDisponiveis);
        return t;
    }
    public void returningObject(T t){
        System.out.println("Devolvendo objeto"+t);
        automoveisDisponiveis.add(t);
        System.out.println("Objetos disponíveis para alugar:");
        System.out.println(automoveisDisponiveis);
    }
}
