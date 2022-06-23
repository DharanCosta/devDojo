package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalTest01 {
    public static void main(String[] args) {

        Optional<String> optional1 =  Optional.of("Qualquer Texto dentro do optional");
        Optional<String> optional2 =  Optional.ofNullable(null);
        Optional<String> optional3 =  Optional.empty();
        System.out.println(optional2);
        System.out.println("-----------");

        Optional<String> nameOptional =  findName("Dharan");
        String empty = nameOptional.orElse("EMPTY");
        System.out.println(empty);
        nameOptional.ifPresent(s-> System.out.println(s.toUpperCase()));

    }

    private static Optional<String> findName(String name){
        List<String> list = List.of("Dharan", "Carlos");
        int i = list.indexOf(name);
        if(i != -1){
            return Optional.of(list.get(i));
        }
        return Optional.empty();

    }
}
