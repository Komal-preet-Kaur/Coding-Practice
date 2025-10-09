//optimal approach
class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer>list=new ArrayList<>();
        int n=a.length;
        int m=b.length;
        
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(a[i]<b[j]){
                list.add(a[i]);
                i++;
            }
            else if(a[i]>b[j]){
                list.add(b[j]);
                j++;
            }
            if(i>0 && a[i-1]==a[i]){
                i++;
                continue;
            }
            if(j>0 && b[j-1]==b[j]){
                j++;
                continue;
            }
            else{
                list.add(a[i]);
                
                i++;
                j++;
            }
        }
        
        while(i<n){
            if(i>0 && a[i-1]==a[i]){
                i++;
                continue;
            }
            list.add(a[i]);
            i++;
        }
        while(j<m){
            if(j>0 && b[j-1]==b[j]){
                j++;
                continue;
            }
            list.add(b[j]);
            j++;
        }
        return list;
    }
}

//better approach
// class Solution {
//     public static ArrayList<Integer> findUnion(int a[], int b[]) {

//         Set<Integer> s=new HashSet<>();
//         for(int i=0;i<a.length;i++){
//             s.add(a[i]);
//         }
//         for(int j=0;j<b.length;j++){
//             s.add(b[j]);
//         }
//         ArrayList<Integer> list=new ArrayList<>();
        
//         for(int n:s){
//             list.add(n);
//         }
//         return list;
//     }
// }

