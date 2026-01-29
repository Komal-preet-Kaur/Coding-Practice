import java.util.*;

class Solution {

    public int mean(int[] arr) {
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum / n;
    }

    public int median(int[] arr) {
        int n = arr.length;

        Arrays.sort(arr);

        if (n % 2 != 0) {
            return arr[n / 2];
        } else {
            int ele1 = arr[(n / 2) - 1];
            int ele2 = arr[n / 2];
            return (ele1 + ele2) / 2;
        }
    }
}
