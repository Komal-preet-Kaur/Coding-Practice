class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int answer=Integer.MAX_VALUE;
        int n=words.length;
        int steps=0;
        for(int i=0;i<words.length;i++){
            if(words[i].equals(target)){
                int forwardSteps=Math.abs(startIndex-i);
                int backwardSteps=n-Math.abs(startIndex-i);
                steps=Math.min(forwardSteps,backwardSteps);
                answer=Math.min(answer,steps);
            }
            
        }
        return answer==Integer.MAX_VALUE?-1:answer;
    }
}