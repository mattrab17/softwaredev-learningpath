package src.week2.tuesday;
import java.util.Stack;

public class StackPractice {
  
  public static void main(String[]args){

    Stack<Integer> stack = new Stack();

    //PUSH INTO STACK
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);

    System.out.println(stack);

    //POP OUT OBJECT FROM TOP OF STACK
    stack.pop();
    stack.pop();

    System.out.println(stack);

    //PEEK THE TOP OBJECT OF THE STACK
    System.out.println("Peeking at the top: " + stack.peek());

    //SEARCH FOR THE INDEX OF A STACK (Top of stack = index 1)
    System.out.println("3 has index:" + stack.search(3));

    //CHECK IF STACK IS EMPTY
    System.out.println("Is stack empty? " + stack.isEmpty());

    
    //======================================

    // Use a stack to reverse a string

    System.out.println(StackPractice.stringReverse("abcd"));
  }


  public static String stringReverse(String x){
    //Parameters: String x
    // 1. Break string up into an array of strings
    // 2. Loop through array and push each letter into stack
    // 3. Loop through stack and pop out each letter into a new string (reversed string)

    //abcd
    //[a][b][c][d]
    /*
    Stack:
    d
    c
    b
    a
    */
   
    //Turn put each letter into an array 
    String[] normalWord = x.split("");
    
    //push each letter from array into stack
    Stack<String> myStack = new Stack();
    for(String letter : normalWord){
      myStack.push(letter);
    }


    //Method 1 to reverse string (for-loop)
    // int stacksFixedSize = myStack.size();
    //   String reversedWord = "";
    // for(int i = 0; i < stacksFixedSize; i++){
    //   reversedWord += myStack.pop();
    // }
    
    //Method 2 to reverse string (while) (BETTER WAY)

    String reversedWord = "";
    while(!myStack.empty()){
      reversedWord += myStack.pop();
    }
    return reversedWord;

  }
}
