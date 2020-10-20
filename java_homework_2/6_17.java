import java.util.Scanner;

public class 6_17DisplayMatrixof0sand1s {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter n:");
        int n = input.nextInt();
        printMatrix(n);
        input.close();
    }
    public static void printMatrix(int n){
        int matrix[][] = new int[n][n];
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0;j < matrix[i].length; j++) {
                System.out.printf("%d ", (int) (Math.random() * 2));
            }System.out.print("\n");
        }
    }
}