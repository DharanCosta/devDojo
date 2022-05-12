package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.test;

import academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.domain.Carros;

public class CarroTest01 {
    public static void main(String[] args) {
        Carros.setVelocidadeLimite(180);

        Carros carro1 = new Carros("BMW",280);
        Carros carro2= new Carros("Mercedes",275);
        Carros carro3 = new Carros("Audi",260);



        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
