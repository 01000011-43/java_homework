import java.util.Scanner;

public class wk8_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row:");
        double [][]matrix = new double[4][4];
        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++){
                matrix[i][j] = input.nextDouble();
            }
        }
        System.out.printf("Sum of the elements in the major diagonal is "+sumMajorDiagonal(matrix));
    }
    public static double sumMajorDiagonal(double[][] m){
        double sum = 0.0;
        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++){
                if(i == j){
                    sum += m[i][j];
                }
            }
        }return sum;
    }
}
