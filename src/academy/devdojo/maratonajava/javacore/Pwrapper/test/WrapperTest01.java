package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP =1;
        long longP =10L;
        float floatP= 10F;
        double doubleP =100;
        char charP = 'W';
        boolean booleanP = false;

        //Wrapper onde há regra de polimorfismo, não podendo sair do "tamanho" de cada tipo primitivo
        //São objetos
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW =1; // autoboxing / boxing
        Long longW =10L;
        Float floatW= 10F;
        Double doubleW = 100D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i  = intW; //unboxing

        Integer intW2 =  Integer.parseInt("12");
        boolean verdadeiro = Boolean.parseBoolean("True");

        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.toUpperCase('v'));
        System.out.println(Character.isUpperCase('v'));

    }
}
