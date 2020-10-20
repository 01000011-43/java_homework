import java.util.Scanner;

public class wk7_7 {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int counts[] = new int [10];
        for(int i = 0;i < 100;i++){
            counts[(int)(Math.random()*10)]++;
        }
        System.out.printf("counts of\n");
        for(int j = 0;j < 10;j++){
            System.out.printf("%d=%d ",j,counts[j]);
        }
    }
}