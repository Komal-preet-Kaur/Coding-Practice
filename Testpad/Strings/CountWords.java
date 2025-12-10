class Result {
  static int countWords(String str) {
    // Write your code here
      if(str.length()==0)return 0;
    str=str.trim();
      String word[]=str.split("\\s+");
      
      return word.length;
  }
}