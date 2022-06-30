package academy.devdojo.maratonajava.javacore.ZZGconcorrencias.domain;

// storeName:price:discountCode - Quote
public class Discount {
    public enum Code{
        NONE(0), SUPER(5), SUPER_2(10), SUPER_3(15);
        private final int percentage;

        Code(int percentage){
            this.percentage = percentage;
        }

        public int getPercentage(){
            return percentage;
        }
    }
}
