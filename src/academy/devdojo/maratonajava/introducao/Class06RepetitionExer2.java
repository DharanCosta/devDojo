package academy.devdojo.maratonajava.introducao;

public class Class06RepetitionExer2 {
    public static void main(String[] args) {

        double priceCar = 44500;
        double parcel = 0;
        double parcelValue = 0;

        for(parcel = priceCar; parcel >1; parcel--){
            parcelValue =priceCar/parcel;
            if(parcelValue <1000){
                continue;
            }
            System.out.println("Parcela "+parcel+" R$"+parcelValue);

        }

    }
}
