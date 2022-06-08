// #include <bits/stdc++.h>
// using namespace std;
// int main(int argc, char **argv)
// { 
//    //write your code
//    return 0;
// }


import java.util.*;
public class Main{

   public static void main(String args[]){
      Scanner scn = new Scanner(System.in);

      String exp = scn.nextLine();

      System.out.println(duplicateBrackets(exp));
   }

   public static boolean duplicateBrackets(String exp){
      Stack<Character> st = new Stack<>();

      for(int i = 0 ; i < exp.length() ; i++){
          char ch = exp.charAt(i);
          if(ch == ' '){continue;}
          else 
          if(ch == ')'){
              if(st.peek() == '('){
                  return true;
              }else{
                  while(st.peek() != '('){
                      st.pop();
                  }
                  st.pop(); // (
              }
          }else{
              st.push(ch);
          }
      }
      return false;
   }
}   