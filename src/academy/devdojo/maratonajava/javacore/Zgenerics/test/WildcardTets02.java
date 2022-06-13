package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildcardTets02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
//        printConsulta(cachorros); Type erasure
        printConsulta(cachorros);
        printConsulta(gatos);

        List<Animal> animals = new ArrayList<>();
        printConsultaAnimal(animals);

    }
    private static void printConsulta(List<? extends Animal> animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
//        animals.add(new Cachorro()); Não posso adicionar por conta do ? extends(wildcard)
    }
    private static void printConsultaAnimal(List<? super Animal> animals){
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
