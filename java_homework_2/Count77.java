public class Count77 {
    public static void main(String[] args){
        int counts[] = new int [10];
        for(int i = 0;i < 100;i++){
            counts[(int)(Math.random()*10)]++;
        }
        System.out.printf("counts of:");
        for(int j = 0;j < 10;j++){
            System.out.printf("%d=%d ",j,counts[j]);
        }
        System.out.println(" ");
    }
}