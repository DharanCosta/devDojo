package academy.devdojo.maratonajava.javacore.ZZGconcorrencias.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencias.services.StoreService;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencias.services.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest03 {

    public static void main(String[] args) {
        StoreServiceDeprecated storeServiceDeprecated = new StoreServiceDeprecated();
        searchPricesASyncCompletableFuture(storeServiceDeprecated);
    }

    private static void searchPricesASyncCompletableFuture(StoreServiceDeprecated storeServiceDeprecated){
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1","Store 2","Store 3","Store 4","Store 5");
        List<CompletableFuture<Double>> completableFutures = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeServiceDeprecated.getPriceSync(s)))
                .collect(Collectors.toList());

        List<Double> prices = completableFutures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());


        System.out.println(prices);
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %dms%n",(end-start));
    }
}
