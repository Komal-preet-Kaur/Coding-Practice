class Result{
  // Return true if the str2 is a subsequence of str1, else return false
  static boolean strSubsequence(String str1, String str2) {
    // Write your code here
      int n=str1.length();
      int m=str2.length();
      int i=0,j=0;
      while(i<n && j<m){
          if(str1.charAt(i)==str2.charAt(j)){
              j++;
          }
          i++;
      }
      if(j==str2.length())return true;
      else return false;
    
  }
}