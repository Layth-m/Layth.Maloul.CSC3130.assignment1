// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.nio.charset.StandardCharsets;
//Assignment 1, CSC 3130
// (code) Problem 1 commonsubsequence
public class Main {
   //common subsequence
   public static void commonSubsequence(String text1, String text2) {
       //PROBLEM 1 Common Subsequence

        StringBuilder commonseq = new StringBuilder();
       for (int i = 0; i < text1.length(); i++) {
            for(int j = 0;j<text2.length();j++){
                if(text1.charAt(i)==text2.charAt(j)){
                    commonseq.append(text1.charAt(i));
                    break;
                }
            }
       }
       if(commonseq.isEmpty()){
           System.out.println("There is no such common subsequence, so the result is "+commonseq.length());
       }
       else{
           System.out.println("The longest common subsequence is \"" + " "+ commonseq+" \" and its length is "+ commonseq.length());
       }
   }
   public static void main(String[]args){
       String text1 = "abc";
       String text2 = "abcde";
       commonSubsequence(text1,text2);
   }
}



