class Solution {
    public double myPow(double x, int n) {
        long power=n;
        if(n<0){
            x=1/x;
            power=-power;
           
        }
         return fastPow(x,power);
    }
    public static double fastPow(double x,long n){
        if(n==0) return 1.0;
        double half=fastPow(x,n/2);
        if(n%2==0) return half*half;
        else{
            return half*half*x;
        }  
    }
}