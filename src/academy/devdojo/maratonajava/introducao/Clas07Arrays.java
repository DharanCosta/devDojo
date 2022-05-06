package academy.devdojo.maratonajava.introducao;

public class Clas07Arrays {
    public static void main(String[] args) {
        //Padrão de inicialização
        //byte, short, int, long, float e double = 0

        //boolean false
        //String null
        int[] ages = new int[3];

        ages[0] =21;
        ages[1] = 15;
        ages[2] = 11;
        System.out.println(ages[1]);

        String[] names = new String[3];
        names[0]= "James";
        names[1]= "Carl";
        names[2]= "Elisa";

        for( int i =0; i<names.length; i++){
            System.out.println(names[i]);
        }

        // aula 03
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{1,2,3,4,5};
        for( int i =0; i<numeros2.length; i++){
            System.out.println(numeros2[i]);
        }
        for(int num:numeros3){
            System.out.println(num);
        }
    }
}
