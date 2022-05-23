package academy.devdojo.maratonajava.javacore.Rdatas.test;

import academy.devdojo.maratonajava.javacore.Gexercicio.domain.Local;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());//1
        System.out.println(Calendar.getInstance());
        System.out.println(Month.JANUARY.getValue());
        LocalDate date = LocalDate.of(2022, 4, 27);
        LocalDate date1 = LocalDate.of(2022, Month.APRIL, 27);
        LocalDate agora = LocalDate.now();

        System.out.println(date.getYear());
        System.out.println(date1.getMonth()+" / "+date1.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear()); //Ano bissexto
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println(date);
        System.out.println("Max: "+LocalDate.MAX+ " Min:"+ LocalDate.MIN);
        System.out.println(agora);

        agora = agora.plusWeeks(4);
        System.out.println(agora);


    }
}
