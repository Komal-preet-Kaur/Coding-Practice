class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        // code here
        int n=prices.length;
        Arrays.sort(prices);
        int min=0;
        int buy=0;
        int free=n-1;
        ArrayList<Integer> list=new ArrayList<>();
        while(buy<=free){
            min=min+prices[buy];
            buy++;
            free=free-k;
        }
        int max=0;
        buy=n-1;
        free=0;
        while(free<=buy){
            max=max+prices[buy];
            buy--;
            free=free-k;
        }
        list.add(min);
        list.add(max);
        return list;
        
    }
}
