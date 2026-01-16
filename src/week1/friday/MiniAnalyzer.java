import java.util.HashMap;
public class MiniAnalyzer {
  

  //Word Frequency Identifier
  /*
  Features:
  1.Takes a sentence
  2.Counts word frequency
  3.Prints most common word
  4.Handles empty input

  
  
  
  
  */
  public static void main(String[]args){

    
    
    String input = "I like to eat cheese because it tastes good to to eat eat hi hi cheese cheese cheese";
    String input2 = " ";
    System.out.println(MiniAnalyzer.miniAnalyzer(input));


  }
  
  public static String miniAnalyzer(String words){

    //words = sentence
    //Parameters: a string of words 
    //Case 1: if words.length()==0 or words==null
    //      -> print "Your input is empty or null"
    //Case 2:
    //1. Read every word individually (use an array)
    //2. Use a HashMap to count the frequency of the words and use a for-loop to traverse through the array (Frequency)
    //3. Use a for-loop to go through array and find which word has the highest value in hashmap (Max)
    //4. print most common word

    if(words==null){
      return "Your input is null";
    }
    else if(words.length()==0 ||words.trim().equals("")){
      return "You inputted no words";
    }
    else{
      String[] myWords = words.split(" ");
      HashMap<String, Integer> map = new HashMap();

      //for-loop for frequency counter
      for(String word : myWords){
        //Case 1: If map doesn't have the word, put word with value 1
        if(!map.containsKey(word)){
          map.put(word,1);
        }
        else{
          int currentValue = map.get(word);
          map.put(word,currentValue+1);
        }
        //Case 2: map contains word, overwrite word with value + 1 
        
      }

      int max = 0;
      String finalWord = "";
      for(String word : map.keySet()){
        if(map.get(word)>max){
          max = map.get(word);
          finalWord = word;
        }
      }

      return finalWord;

    }

  }
}
