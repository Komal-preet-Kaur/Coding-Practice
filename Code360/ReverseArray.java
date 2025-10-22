//reverseArray
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class ReverseArray 
{
    public static void reverse(ArrayList<Integer>a ,int i,int j ){
        while(i<=j){
            int temp=a.get(i);
            a.set(i,a.get(j));
            a.set(j,temp);
            i++;
            j--;
        }
    }
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int n=arr.size();
        reverse(arr,m+1,n-1);  
    }
}
