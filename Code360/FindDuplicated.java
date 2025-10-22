//find duplicates
import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        Set<Integer>set=new HashSet<>();
        for(int num:arr){
            if(set.contains(num))return num;
            else set.add(num);
        }
        return -1;
    }
}
