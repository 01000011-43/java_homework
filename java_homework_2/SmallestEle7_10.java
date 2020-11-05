import java.util.Scanner;

public class SmallestEle7_10{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the length of array:");
        int n = input.nextInt();
        System.out.printf("Enter numbers of array: ");
        double []matrix = new double[n];
        for(int i = 0;i < n;i++){
            matrix[i] = input.nextDouble();
        }
        input.close();
        System.out.printf("smallest index = "+indexOfSmallestElement(matrix)+"\n");
        System.out.println("smallest num = "+matrix[indexOfSmallestElement(matrix)]);
    }
    public static int indexOfSmallestElement(double[] array){
        double min = array[0];
        int index = 0;
        for(int i = 0;i < array.length;i++){
            if(array[i] < min){
                index = i;
            }
        }return index;
    }
}