package academy.devdojo.maratonajava.javacore.ZZGconcorrencias.services;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencias.domain.Discount;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencias.domain.Quote;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreServiceWithDiscount {
    public String getPriceSync(String storeName){
        double price = priceGenerator();
        Discount.Code discountCode = Discount.Code.values()[
                ThreadLocalRandom.current().nextInt(Discount.Code.values().length)
                ];
        return String.format(Locale.US,"%s:%.2f:%s",storeName,price,discountCode);
    }

    public String applyDiscount(Quote quote){
        delay();
        double discountValue = quote.getPrice() * (100 - quote.getDiscountCode().getPercentage()) / 100;
        return String.format(Locale.US,"'%s' original price: '%.2f'. Applying discount code '%s'. Final price: '%.2f'",
                quote.getStore(),quote.getPrice(),quote.getDiscountCode(),discountValue);
    }
        private double priceGenerator(){
        delay();
        return ThreadLocalRandom.current().nextInt(1,500)*10;
    }

    private void delay(){
        try{
            int milli  = ThreadLocalRandom.current().nextInt(200,2500);
            TimeUnit.MILLISECONDS.sleep(milli);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
