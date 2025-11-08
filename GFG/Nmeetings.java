class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        List<int[]>meet =new ArrayList<>();
        for(int i=0;i<start.length;i++){
            meet.add(new int[]{start[i],end[i]});
        }
        meet.sort((a,b)->Integer.compare(a[1],b[1]));
        int count=0;
        int endIdx=-1;
        for(int m[]:meet){
            if(m[0]>endIdx){
                count++;
                endIdx=m[1];
            }
        }
        return count;
    }
}
