import java.util.Date;

public class UseDate9_3{
    public static String date(long t){
        Date date = new Date();
        date.setTime(10000 * t);
        return date.toString();
    }

    public static void main(String[] args){
        for(int i = 1;i < 100000000;i = i * 10){
            System.out.println(date(i));
        }
    }
}