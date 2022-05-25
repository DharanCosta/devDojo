package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTime1 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime1);


        System.out.println(ZoneOffset.MIN); //-18:00
        System.out.println(ZoneOffset.MAX); //+18:00

        ZoneOffset offSetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(offSetManaus);
        System.out.println(offsetDateTime);
        OffsetDateTime offsetDateTime1 =  OffsetDateTime.of(now, offSetManaus);
        System.out.println(offsetDateTime1);

        OffsetDateTime offsetDateTime2 = nowInstant.atOffset(offSetManaus);
        System.out.println(offsetDateTime2);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);

        LocalDate meijiEraLocalDate = LocalDate.of(1990,2,1);
        JapaneseDate meijiEra = JapaneseDate.from(meijiEraLocalDate);
        System.out.println(meijiEra);
    }
}