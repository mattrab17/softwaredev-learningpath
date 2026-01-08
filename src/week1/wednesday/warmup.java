
package src.week1.wednesday;
//warm up: hashmap word frequency counter 
import java.util.HashMap;
public class warmup {

  public static void main(String[]args) {
    

    //Step 1: Take an input string with words
    //Step 2: Split the string by " " using .split(" ") and turn into an array os strings
    //Step 3: Traverse the array
    //   Case 1: if word doesn't exist in the hashmap, add it with frequency 1
    //   Case 2: if word does exist in the hashmap, take its current frequency value and increment it by one

    String input = "I really really like hashmaps because they like to store data for me";
    String[] arr = input.split(" "); //convert input to string array

    //traverse array and add hashmap logic

    HashMap<String,Integer> map = new HashMap<>();
    
    for(String word : arr) {
      //Case 1:
      if(!map.containsKey(word)) {
        map.put(word, 1);
      } else {
        int currentCount = map.get(word); // get current count number
        map.put(word,currentCount+1); //increment by 1
      }
    }

    System.out.println(map);
  }
  
}
