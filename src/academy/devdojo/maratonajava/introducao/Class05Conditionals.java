package academy.devdojo.maratonajava.introducao;

public class Class05Conditionals {
    public static void main(String[] args){
        int age = 20;
        boolean isAutorizadoComprarBebida= age>=18;

        if(isAutorizadoComprarBebida){
            System.out.println("Compra autorizada");
        }else{
        System.out.println ("Você não pode comprar!");
        }

        // Problem
        // idade < 15  == categoria infantil
        // idade >= 15 && idade<18 categoria Juvenil
        // idade >= 18 categoria adulto
        int idade =17;
        if(idade<15){
            System.out.println("Categoria Infantil");
        }else if(idade>=15 && idade <18){
            System.out.println("Categori Juvenil");
        }else{
            System.out.println("Categoria Adulto");
        }

    }

}

