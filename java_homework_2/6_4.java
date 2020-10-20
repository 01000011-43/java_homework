import java.util.Scanner;

public class wk6_4 { //输入一个整数，并输出它的反向数
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter an integer:");
        int num = input.nextInt();
        int n = reverse(num);
        System.out.printf("reverse = %d\n",n);
        System.out.printf("reverse with 0 = ");
        reverse0(num);
    }
    public static int reverse(int num){ //若输入120，此函数返回21
        int sum = 0;
        int sign = 1;
        if(num<0){
            num = num * -1;
            sign = -sign;
        }
        while(num > 9){  //-12，
            sum = sum*10 + (num%10)*10;
            num = num/10;//
        }
        num = num + sum;//
        return num*sign;
    }
    public static void reverse0(int num) { //若输入120，此函数返回021
        String str = "";
        while (true) {
            if(num<0){
                num = num*-1;
                System.out.print("-");
            }
            str += num % 10;
            num /= 10;
            if (num == 0) {
                System.out.println(str);
                return;
            }
        }
    }
}
