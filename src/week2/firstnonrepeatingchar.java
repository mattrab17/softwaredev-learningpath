import java.util.HashMap;

public class firstnonrepeatingchar{
  public static void main(String[] args) {




    //We have to find the first non repeating character.
    /*
    Ex: 
    aab -> b is firstchar
    baa -> b is first char
    baac -> b is first char
    baacb -> c is first char
    aabdbccf -> d is first char

    
    */

    // The output = d because d is the first character that doesn't repeat

    //Case 1: if a letter repeats (if value > 1), it can't be firstchar
    //Case 2: if a letter doesn't repeat (if value < 1), it can be first char


    // 
    //Step 1. Turn input into array of chars
    //Step 2. Count number of times a letter appears and put it into hashmap
    //STep 3. Iterate through original array and check to see that letter's count. firstChar = the first letter with frequency 1
    


    //Step 1.
    
    String input = "aabbccdf";

    //create a char array
    char[] chars = new char[input.length()];

    //loop through the string and put every char into an array box
    for(int i = 0; i < input.length(); i++) {
      chars[i] = input.charAt(i); //we use .charAt because we are working with chars
    }

    //print the final array of chars

    System.out.println("Final Array of Chars:");

    for(char c : chars) {
      System.out.print(c + " ");
    }
    

    //Step 2. 

    //ex aabdbccf
    
    
    HashMap<Character, Integer> map = new HashMap<>();
    
    //put chars into a hashmap with their frequency
    for(int i = 0; i < chars.length; i++) { //go through for-loop
      if(!map.containsKey(chars[i])) { //if map doesn't contain char
        map.put(chars[i], 1); //put char into map with 1 frequency
        
      } else { //if map contains char
        int currentValue = map.get(chars[i]); 
        map.put(chars[i], currentValue+1); //increase char's frequency by 1
      }
    }

    //prints out the entire hashmap
    System.out.println("");
    for(Character key : map.keySet()) {
      System.out.println(key + " -> " + map.get(key));
    }

    //iterate through array and find the first char with frequency 1
    char firstChar = ' ';
    for(int i = 0; i < chars.length; i++){

      if(map.get(chars[i])==1) {
        firstChar = chars[i];
        break;
      }
    }

    System.out.println(firstChar);
    


  }
}