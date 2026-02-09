// https://www.geeksforgeeks.org/problems/the-pattern-matcher-java/1
class Geeks {
    static int follPatt(String s) {
        // Your code here
        int i=0;
        int n=s.length();
        
        while(i<n){
            int xCnt=0;
            int yCnt=0;
            
            while(i<n && s.charAt(i)=='x'){
                xCnt++;
                i++;
            }
            while(i<n && s.charAt(i)=='y'){
                yCnt++;
                i++;
            }
            if(xCnt==0 || xCnt!=yCnt)return 0;
        }
        return 1;
    }
}