package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Willian"; // String constant pool
        String nome2 = "Willian";
        nome = nome.concat(" Suane"); // nome += " Suane"
        System.out.println(nome == nome2);
        String nome3 = new String("Willian"); //Variavel de referência, objeto do tipo strin, uma string no pool de strings
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
