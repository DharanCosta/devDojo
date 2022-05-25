package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now =LocalDate.now();
        now = now.plusDays(20);
        LocalDate now2 = now.withDayOfMonth(20); // troca exatamente o dia da data data
        LocalDate now3 = now.with(ChronoField.DAY_OF_MONTH, 18); // troca exatamente o mês da data data
        System.out.println(now);
        System.out.println(now2);
        System.out.println(now3);
        System.out.println(now.getDayOfWeek());

        //TemporalAdjusters
        //Next or Same
        LocalDate now4 = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY));
        System.out.println(now4);
        System.out.println(now4.getDayOfWeek());
        //Next
        LocalDate now5 = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println(now5);
        System.out.println(now5.getDayOfWeek());
        //Previous
        LocalDate now6 = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.TUESDAY));
        System.out.println(now6);
        System.out.println(now6.getDayOfWeek());
        //First and Last day of the month
        LocalDate now7 = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now7);
        System.out.println(now7.getDayOfWeek());
        LocalDate now8 = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now8);
        System.out.println(now8.getDayOfWeek());
        //First day of next Year or month
        LocalDate now9 = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(now9);
        System.out.println(now9.getDayOfWeek());
        LocalDate now10 = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(now10);
        System.out.println(now10.getDayOfWeek());
    }
}
