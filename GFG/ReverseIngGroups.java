import java.util.*;

class Solution {

    public void reverse(int arr[], int st, int end) {
        while (st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }

    public void reverseInGroups(int[] arr, int k) {
        int l = 0;
        int n = arr.length;

        while (l < n) {
            int r = Math.min(n - 1, l + k - 1);
            reverse(arr, l, r);
            l += k;
        }
    }
}
