//pair sum
import java.io.*;
import java.util.* ;

public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.
        List<int[]>res=new ArrayList<>();
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            int compliment=s-num;
            if(map.containsKey(compliment)){
                int count=map.get(compliment);
                //this is done so that all occurences of the compliment can be attached with the num;like if 3:2 time then(3,-3) (3,-3) will be the pairs 
                for(int i=0;i<count;i++){
                    int first=Math.min(compliment,num);
                int second=Math.max(compliment,num);
                res.add(new int[]{first,second});
                }
                
            }
            //to store the occurences;
            map.put(num,map.getOrDefault(num,0)+1);
        }
        res.sort((a,b)->{
            if(a[0]==b[0])return Integer.compare(a[1],b[1]);
            else return Integer.compare(a[0],b[0]);
        });
        return res;
    }
}
