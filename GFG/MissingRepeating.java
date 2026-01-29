import java.util.*;

class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();

        int dup = 0;
        int n = arr.length;

        int originalSum = 0;
        for (int i = 1; i <= n; i++) {
            originalSum += i;
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        Set<Integer> s = new HashSet<>();
        for (int num : arr) {
            if (s.contains(num)) {
                dup = num;
            }
            s.add(num);
        }

        int missing = originalSum - sum + dup;

        list.add(dup);
        list.add(missing);

        return list;
    }
}
