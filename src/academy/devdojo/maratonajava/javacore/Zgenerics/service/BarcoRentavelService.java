package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> carrosDisponiveis = new ArrayList<>(
            List.of(new Barco("Lancha"),new Barco("Canoa")));

    public Barco retrieveAvailable(){
        System.out.println("Buscando barco disponível...");
        Barco barco = carrosDisponiveis.remove(0);
        System.out.println("Alugando barco: "+barco);
        System.out.println("Barcos disponíveis para alugar:");
        System.out.println(carrosDisponiveis);
        return barco;
    }
    public void returningShip(Barco barco){
        System.out.println("Devolvendo barco"+barco);
        carrosDisponiveis.add(barco);
        System.out.println("Barcos disponíveis para alugar:");
        System.out.println(carrosDisponiveis);
    }
}
