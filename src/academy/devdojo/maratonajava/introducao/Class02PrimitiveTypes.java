package academy.devdojo.maratonajava.introducao;

public class Class02PrimitiveTypes {

    public static void main(String[] args) {
        // Tipos primitivos
        // int, double, float, char, byte, short, long boolean
        int ageDad = 35;
        long salLong = (long) 155.23;
        double salDouble = 2000.0;
        float salFloat = 2500.0F;
        byte ageByte = 127;
        short ageShort = 32000;
        boolean booleTrue = true;
        boolean booleFalse = false;
        char caractere = 'M';

        String name = "Name of your client, no limits of Characters ";

        System.out.println("A idade é "+ageDad+" anos.");
        System.out.println("Casting de uma double em uma long "+salLong );
        System.out.println(name);
    }
}
