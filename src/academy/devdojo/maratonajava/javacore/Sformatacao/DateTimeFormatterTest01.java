package academy.devdojo.maratonajava.javacore.Sformatacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("--------------------");

        LocalDate parse1 = LocalDate.parse("20210219",DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2022-05-25+05:00",DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2022-05-25",DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);
        System.out.println("--------------------");

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2022-05-25T14:29:36.5128723");
        System.out.println(parse4);
        System.out.println("--------------------");
        // dd/MM/yyyy BR
        // MM/dd/yyyy USA
        //yyyy/MM/dd Japão
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("19/02/2021", formatterBR);
        System.out.println(parseBR);
        System.out.println("--------------------");

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);
        LocalDate parse5 = LocalDate.parse("25.Mai.2022", formatterGR);
        System.out.println(parse5);
    }
}
