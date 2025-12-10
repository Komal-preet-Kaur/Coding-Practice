//minimum number of coins
class Solution {
    public int findMin(int n) {
        // code here
        int totalCoins=0;
        int coins[]={10,5,2,1};
        for(int c:coins){
            int count=n/c;
            totalCoins+=count;
            n-=(count*c);
            if(n==0)break;
        }
        return totalCoins;
    }
}
