package academy.devdojo.maratonajava.introducao;

public class Class06RepetitionExer {
    public static void main(String[] args) {

        double priceCar = 44500;
        double parcel = 0;
        double parcels = 0;

        for(parcels=1;parcels<=priceCar;parcels++){
            parcel = priceCar/parcels;
            if(parcel >= 1000){
                System.out.println("Parcela "+parcels+" R$"+parcel);
            }else{
                break;
            }

        }

    }
}
