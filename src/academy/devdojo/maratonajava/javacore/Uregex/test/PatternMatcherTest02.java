package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // Encontrar padrões no texto
        // Fazer validações

        //metacaracteres
        //  \d = Todos os dígitos
        String regex0 = "\\d";
        // \D = Tudo que não for dígito
        String regex1 = "\\D";
        // \s = Espaços em branco \t \n \f \r
        String regex = "\\w ";
        // \S = Todos os caracters excluindo os em branco
        // \w = tudo de a-zA-Z,digitos e _ (underscore)
        // \W = Tudo que não for incluso em \w

        String texto2 = "da3\n5a fa4\ta5 czc";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto: "+texto2);
        System.out.println("indice: 012345678910");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");
        while(matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }

    }
}
