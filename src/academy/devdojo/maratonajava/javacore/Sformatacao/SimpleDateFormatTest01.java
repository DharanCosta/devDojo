package academy.devdojo.maratonajava.javacore.Sformatacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "yyyy.MM.DD G 'at' HH:mm:ss z";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

        String pattern2 = "'Brasil' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf2 = new SimpleDateFormat(pattern2);
        System.out.println(sdf2.format(new Date()));

        try {
            System.out.println(sdf2.parse("Brasil 23 de maio de 2022"));
        } catch (ParseException e) {
                e.printStackTrace();
        }

    }
}
