import java.util.ArrayList;
import java.math.*;

public class ArrayList13_3{
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<Number>();
        list.add(1);
        list.add(2.0);
        list.add(new BigInteger("3432323234344343101"));
        list.add(new BigDecimal("2.0909090989091343433344343"));
        sort(list);
        for(Number i: list){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    public static void sort(ArrayList<Number> list){
        if(list==null||list.size()==0)
            return;

        for(int i = list.size()-1;i>=0;i--){
            for(int j =0;j<i;j++){
                if(list.get(j).doubleValue()>list.get(j+1).doubleValue()){
                    int idx = j;
                    Number larger = list.get(j);
                    list.set(idx,list.get(j+1));
                    list.set(j+1,larger);
                }
            }
        }
    }
}