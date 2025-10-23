class Solution {
    public boolean isUgly(int n) {
        if(n<=0)return false;
        int primes[]={2,3,5};
        for(int p:primes){
            while(n%p==0){
                n/=p;
            }
        }
        if(n==1)return true;
        else return false;
    }
}