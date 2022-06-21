package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.domain.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    private static  List<Car> cars = List.of(
            new Car("Green",2011),
            new Car("Red", 2019),
            new Car("Black", 2020)
    );

    public static void main(String[] args) {
//        List<Car> greenCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("Green");
//            }
//        });
//        System.out.println(greenCars);

        List<Car> greenCars = filter(cars, car -> car.getColor().equals("Green"));
        List<Car> redCars = filter(cars, car -> car.getColor().equals("Red"));
        List<Car> blackCars = filter(cars, car -> car.getColor().equals("Black"));
        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(blackCars);

        List<Car> yearBefore = filter(cars, car -> car.getYear()<2020);
        System.out.println(yearBefore);

        List<Integer> nums =List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(filter1(nums,num -> num%2!=0));



    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate){
       List<Car> filteredCar = new ArrayList<>();
       for(Car car : cars){
           if(carPredicate.test(car)){
               filteredCar.add(car);
           }
       }
       return filteredCar;
    }

    private static <T> List<T> filter1(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for(T e : list){
            if (predicate.test(e)){
                filteredList.add(e);
            }
        }
        return filteredList;
    }



}
