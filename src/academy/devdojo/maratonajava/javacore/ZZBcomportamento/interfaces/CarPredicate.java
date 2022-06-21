package academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.domain.Car;

@FunctionalInterface
public interface CarPredicate {
    //lambdas são anônimas, funções concisas
    boolean test(Car car);
    //(parametro) -> <expressão>
    //(Car car) -> car.getColo().equals("Green");

}
