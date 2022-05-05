package academy.devdojo.maratonajava.introducao;

public class Class03PrimitiveTypesExercise {

    public static void main (String[] args){

        String name1 = "Jones";
        float salary1 = 3500.00F;
        String adress = "Av Matriarca";
        String dateSalaryPayment = "10/01/2022";

        String response = "I, "+name1+", residing by "+adress+
                " confirm that received the payment of "+salary1+" USD, "+
                "at the date of "+dateSalaryPayment;
        System.out.println(response);
    }
}
