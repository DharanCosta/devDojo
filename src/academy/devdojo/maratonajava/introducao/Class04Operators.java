package academy.devdojo.maratonajava.introducao;

public class Class04Operators {

    public static void main(String[] args) {
        int number01 = 10;
        double number02 = 20;
        double sum = number01+number02;
        double div= number01/number02;
        System.out.println("The sum is "+sum);
        System.out.println("The division is "+div);

        //%
        double rest = number02%number01;
        System.out.println(rest);

        // < >  <= >= == !=
        boolean isTenMoreThanTwenty = number01>number02;
        boolean isTenLessThanTwenty = number01<number02;
        boolean isTenEqualsTwenty = number01==number02;
        System.out.println(isTenMoreThanTwenty);
        System.out.println(isTenLessThanTwenty);
        System.out.println(isTenEqualsTwenty);

        // & (AND) || (OU)
        int age = 28;
        float salary = 300F;
        boolean isDentroDaLeiMaiorQueTrinta = age >= 30 && salary >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = age <30 && salary >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta"+ isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta"+ isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente =200;
        double valorTotalContaPoupanca =10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus %=2;
        System.out.println(bonus);

        //
        int contador =0;
        contador +=1;
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);

        int contador2 = 0;
        System.out.println(++contador2);

    }
}
