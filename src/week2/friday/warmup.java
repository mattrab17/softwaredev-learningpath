package src.week2.friday;
import java.util.Stack;


//Stack string reversal
public class warmup {

  public static void main(String[]args){
    String input = "abcdef";

    System.out.println(warmup.stringReversal(input));
  }

  public static String stringReversal(String x){

    //Parameters: x = string of letters
    /*
    1. Traverse string and put each letter into a stack
    2. Pop each letter and add it to a variable 
    */

    Stack<String> stack = new Stack();
    for(int i = 0; i < x.length(); i++){
      String currentLetter = x.substring(i,i+1);
      stack.push(currentLetter);
    }

    StringBuilder reversedString = new StringBuilder(); 
    while(!stack.isEmpty()){
      reversedString.append(stack.pop());
    }

    return reversedString.toString();
  }
  
}
