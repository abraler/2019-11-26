import java.util.*;

public class Main2 {
    public static int getValue(int[] gifts, int n) {
        double dd=n/2.0;
        Map<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i <gifts.length ; i++) {
            if(map.containsKey(gifts[i])){
                map.put(gifts[i],map.get(gifts[i])+1);
            }
            map.put(gifts[i],1);
        }
        Set<Map.Entry<Integer,Integer>>m =map.entrySet();
        int s=0;
        int t=0;
        for(Map.Entry<Integer,Integer>a:m){
            if(a.getValue()>s){

                s=a.getValue();
                if(s>dd){
                    t=a.getKey();
                }
            }
        }
        return t;
    }
}
