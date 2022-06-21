package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static  List<Car> cars = List.of(
            new Car("Green",2011),
            new Car("Red", 2019),
            new Car("Black", 2020)
    );

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterCarByColor(cars, "Red"));
        System.out.println(filterCarByColor(cars, "Black"));
        System.out.println("---------");
        System.out.println("Carros fabricados antes de 2020: "+filterCarByYear(cars, 2020));
    }

    private static List<Car> filterGreenCar(List<Car> cars){
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars){
            if(car.getColor().equals("Green")){
                greenCars.add(car);
            }
        }
        return greenCars;
    }
    private static List<Car> filterCarByColor(List<Car> cars, String cor ){
        List<Car> colorCars = new ArrayList<>();
        for (Car car : cars){
            if(car.getColor().equals(cor)){
                colorCars.add(car);
            }
        }
        return colorCars;
    }

    private static List<Car> filterCarByYear (List<Car> cars, int year){
        List<Car> yearCar = new ArrayList<>();
        for(Car car: cars){
            if(car.getYear() < year){
                yearCar.add(car);
            }
        }
        return yearCar;
    }


}
