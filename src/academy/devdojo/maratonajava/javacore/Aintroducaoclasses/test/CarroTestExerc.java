package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTestExerc {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Gol";
        carro1.modelo= "1.0";
        carro1.ano = 1999;

        carro2.nome = "Prisma";
        carro2.modelo= "4.0";
        carro2.ano = 2012;

        carro2=carro1;
        System.out.println("O carro "+carro1.nome+" modelo "+carro1.modelo+" do ano: "+carro1.ano);
        System.out.println("O carro "+carro2.nome+" modelo "+carro2.modelo+" do ano: "+carro2.ano);

    }
}
