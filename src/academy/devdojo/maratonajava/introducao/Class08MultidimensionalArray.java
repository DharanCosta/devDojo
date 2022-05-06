package academy.devdojo.maratonajava.introducao;

public class Class08MultidimensionalArray {
    public static void main(String[] args) {
        //1,2,3,4,5 meses
        //31,28,31,30 dias do mês
        int[][] dias = new int[4][3];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 30;
        dias[1][1] = 31;
        dias[1][2] = 30;

        dias[2][0] = 31;
        dias[2][1] = 31;
        dias[2][2] = 30;

        dias[3][0] = 31;
        dias[3][1] = 30;
        dias[3][2] = 31;

        for(int i =0; i<dias.length; i++){
            for(int j=0; j<dias[0].length;j++){
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("----------------");

        for(int[] arrBase:dias){
            for(int num: arrBase) {
                System.out.println(num);
            }
        }

        System.out.println("----------------");

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];

        for(int[] arrayBase: arrayInt){
            System.out.println("\n-------");
            for(int num: arrayBase){
                System.out.print(num+ " ");
            }
        }
        int[][]  arrayInt2 ={{0,0},{1,2,3},{1,2,3,4,5,6}};

    }
}
