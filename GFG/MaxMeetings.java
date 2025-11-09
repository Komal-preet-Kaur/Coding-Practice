class Solution {
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        // code here
        List<int[]> meet=new ArrayList<>();
        for(int i=0;i<N;i++){
            meet.add(new int[]{S[i],F[i],i+1});
        }
        meet.sort((a,b)->Integer.compare(a[1],b[1]));
        ArrayList<Integer> res=new ArrayList<>();
        int endIdx=Integer.MIN_VALUE;
        for(int m[]:meet){
            if(m[0]>endIdx){
                 
                res.add(m[2]);
               endIdx=m[1];
            }
        }
        Collections.sort(res);
        return res;
    }
}