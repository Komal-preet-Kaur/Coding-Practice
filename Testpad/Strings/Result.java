class Result {
  static String revWordsOrder(String str) {
    // Write your code here
      str=str.trim();
      String words[]=str.split("\\s+");
      StringBuilder sb=new StringBuilder();
      for(int i=words.length-1;i>=0;i--){
          sb.append(words[i]);
          if(i>0)sb.append(" ");
      }
      return sb.toString();
  }
}