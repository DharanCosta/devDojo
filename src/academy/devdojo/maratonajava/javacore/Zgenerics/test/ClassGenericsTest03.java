package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClassGenericsTest03 {
    public static void main(String[] args) {
        List<Barco> barcoDisponiveis = new ArrayList<>(
                List.of(new Barco("Lancha"),new Barco("Canoa")));
        List<Carro> carrosDisponiveis = new ArrayList<>(
                List.of(new Carro("BMW"),new Carro("Mercedes")));

        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService.retrieveAvailable();
        System.out.println("Usando o barco por um mês...");
        rentalService.returningObject(carro);

        System.out.println("----------------");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcoDisponiveis);
        Barco barco = rentalServiceBarco.retrieveAvailable();
        System.out.println("Usando o barco por um mês...");
        rentalServiceBarco.returningObject(barco);
    }
}
