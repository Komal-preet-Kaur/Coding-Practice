class Result {
  // return 1 for YES and 0 for NO.
  static int isRotation(String str1, String str2) {
    // Write your code here
      if(str1.length()!=str2.length()){
          return 0;
      }
      String doubled=str1+str1;
     
          if(doubled.contains(str2))return 1;
      return 0;
  }
}