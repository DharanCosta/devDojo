package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
//        new Person("Dharan", "Costa", "devdeveloper","dharan@emai.com");
        Person build = new Person.PersonBuilder()
                .firstName("Dharan")
                .lastName("Costa")
                .username("devdeveloper")
                .email("dharan@email.com")
                .build();
        System.out.println(build);
    }
}

