package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // Encontrar padrões no texto
        // Fazer validações

        //metacaracteres
        //  \d = Todos os dígitos
        // \D = Tudo que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracters excluindo os em branco
        // \w = tudo de a-zA-Z,digitos e _ (underscore)
        // \W = Tudo que não for incluso em \w
        // []
        // ? Zero ou uma ocorrência
        //* zerou ou mais ocorrencias
        // + uma ou mais
        // {n,m} de n até m ocorrências
        // () agrupamento
        // | o(v|c)o ovo|oco
        // $ fim da linha
        // . 1.3 = 123, 133, 1@3 , 1A3

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-z])+)+";

        String texto2 = "luffy@hotmai.com, 123lucas@gmail.com.br, 2#0@!zoro@mail.com, teste@gmail.com, sakura@mail.com ";
        System.out.println("Email válido?");
        System.out.println("2#0@!zoro@mail.com".matches(regex));
        System.out.println(Arrays.toString(texto2.split(",")));
        System.out.println(texto2.split(",")[1].trim());
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
