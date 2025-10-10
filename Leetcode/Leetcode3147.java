//optimal 
class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int[] dp = new int[n];
        int maxEnergy = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (i + k < n)
                dp[i] = energy[i] + dp[i + k];
            else
                dp[i] = energy[i];

            maxEnergy = Math.max(maxEnergy, dp[i]);
        }
        return maxEnergy;
    }
}

//brute
// class Solution {
//     public int maximumEnergy(int[] energy, int k) {
//         int maxEnergy=Integer.MIN_VALUE;
//         for(int i=0;i<energy.length;i++){
//             int currEnergy=0;
//             int j=i;
//             while(j<energy.length){
//                 currEnergy+=energy[j];
//                 j+=k;
//             }
//             maxEnergy=Math.max(maxEnergy,currEnergy);
            
//         }      
//         return maxEnergy;
//     }
// }