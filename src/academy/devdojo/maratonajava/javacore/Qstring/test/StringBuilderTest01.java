package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Dharan Costa";
        nome.concat(" DevDojo");
        System.out.println(nome);
        System.out.println(nome.substring(0,6));


        StringBuilder sb = new StringBuilder("Dharan Costa");
        sb.append(" DevDojo").append(" String Builder");
        String sub = sb.substring(0,6);
        System.out.println(sb);
        System.out.println(sub);

        sb.reverse();
        sb.delete(0,6);
        System.out.println(sb);
    }
}
