package academy.devdojo.maratonajava.introducao;

public class Class06Repetition {

    public static void main(String[] args) {

        int count = 0;
        while(count < 10){
            System.out.println(count);
            count +=2;
        }

        count =0;
        do{
            System.out.println(++count);
        }while(count<10);


        for(int i = 0; i<10; i++){
            System.out.println("For "+i);
        }

        //Problem 01 - Even numbers 1 to 1000000

       for(int i = 0; i<=1000000; i+=2){
           System.out.println(i);
        }

       //Problem 02 - Print the firs 25th numbers for a given number

        int valorMax = 50;

       for(int i = 0; i <= valorMax; i++){
           if(i>25){
               break;
           }
           System.out.println(i);
       }

    }
}
