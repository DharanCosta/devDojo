package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        // Encontrar padrões no texto
        // Fazer validações

        String regex = "ab";
//        String texto = "abaabaabbab";
        String texto2 = "abababababab";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto: "+texto2);
        System.out.println("indice: 012345678910");
        System.out.println("regex"+regex);
        System.out.println("Posições encontradas");
        while(matcher.find()){
            System.out.print(matcher.start()+" ");
        }

    }
}
