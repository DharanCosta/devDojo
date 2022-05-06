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

        // Problem1
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

        // Problema 03

        double salary = 3000;
        String mensagemDoar = "Eu vou doar 500 por DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado;

        if(salary> 5000){
            resultado = mensagemDoar;
        }else{
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);

        String res = salary > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(res);

        //Problema 04 - Imposto de renda

        double incomeY = 33000;
        double tax1 = 9.70/100;
        double tax2 = 37.35/100;
        double tax3 = 49.50/100;
        double totalTax = 0;
        if(incomeY <= 34713) {
            totalTax = incomeY * tax1;
        }else if(incomeY >=34713 && incomeY <=68508){
            totalTax = incomeY * tax2;
        }else{
            totalTax = incomeY * tax3;
        }
        System.out.println("The total taxes you must pay is "+totalTax);

        // Switch

        byte day = 4;
        // char, byte, int, short, enum, String
        switch(day){
            case 1 :
                System.out.println("Sunday");
                break;
            case 2 :
                System.out.println("Monday");
                break;
            case 3 :
                System.out.println("Tuesday");
                break;
            case 4 :
                System.out.println("Wednesday");
                break;
            case 5 :
                System.out.println("Thursday");
                break;
            case 6 :
                System.out.println("Friday");
                break;
            case 7 :
                System.out.println("Saturday");
                break;
            default: System.out.println("Number invalid! Type a number between 1 and 7");
            break;
        }

        // Problema 05 -- ^^Continuação

        switch(day){
            case 1 :
            case 7 :
                System.out.println("Weekend");
                break;
            case 2 :
            case 3 :
            case 4 :
            case 5 :
            case 6 :
                System.out.println("Week day");
                break;
            default: System.out.println("Number invalid! Type a number between 1 and 7");
                break;
        }


    }

}

