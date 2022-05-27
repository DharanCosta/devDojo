package academy.devdojo.maratonajava.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String textp = "Levi, Eren, Mikasa, true, 200";
        String[] nomes = textp.split(",");
        for(String nome :nomes){
            System.out.println(nome.trim());
        }
    }
}
