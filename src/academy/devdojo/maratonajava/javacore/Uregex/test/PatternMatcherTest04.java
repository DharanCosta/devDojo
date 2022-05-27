package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
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
        // . 1.3 = 123, 133, 143

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";

        String texto2 = "12 0x 0X 0xFFABC 0X10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto: "+texto2);
        System.out.println("indice: 012345678910");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");
        while(matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
        int numeroHex = 0x59F86A;
        System.out.println(numeroHex);
    }
}
