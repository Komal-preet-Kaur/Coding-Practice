//optimised code
class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        // code here
        Set<Integer> res=new HashSet<>();
        Set<Integer> set=new HashSet<>();
        for(int n:a){
            set.add(n);
        }
        for(int m:b){
            if(set.contains(m)){
                res.add(m);
            }
        }
        return new ArrayList<>(res);
    }
}
// class Solution {
//     public ArrayList<Integer> intersect(int[] a, int[] b) {
//         // code here
//         Arrays.sort(a);
//         Arrays.sort(b);
//         int n=a.length;
//         int m=b.length;
//         ArrayList<Integer>list=new ArrayList<>();
//         int i=0;
//         int j=0;
//         while(i<n && j<m){
//             if(a[i]<b[j]){
//                 i++;
//                 continue;
//             }
//             if(a[i]>b[j]){
//                 j++;
//                 continue;
//             }
//             if(i>0 && a[i-1]==a[i]){
//                 i++;
//                 continue;
//             }
//             if(j>0 && b[j-1]==b[j]){
//                 j++;
//                 continue;
//             }
//             else if(a[i]==b[j]){
//                 list.add(a[i]);
//                 i++;
//                 j++;
//             }
//         }
//         return list;
//     }
// }