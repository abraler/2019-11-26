import java.util.*;

public class Main {
    public static int getValue(int[] gifts, int n) {
        // write code here
        Arrays.sort(gifts);
        int num=1;
        int flag=0;
        int sum=0;
        int fin=0;

        for(int i=0;i<gifts.length-1;i++){
            int k=gifts[i];
            while(k==gifts[i+1]&&i<gifts.length-1){
                num++;
                sum=gifts[i];
                i++;
            }
            if(num>flag){
                fin=sum;
                flag=num;
            }else{
                num=1;
            }
        }
        double s=n/2.0;

        if(flag>s){
            return fin;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        int []a={1,2,2,3,2};
        System.out.println(getValue(a,5));
    }
}