package src.week1.tuesday;


import java.util.HashMap;

public class FrequencyCount {
  
  public static void main(String[] args){


    //count frequency of words in a sentence
    /*
    
    1. We want the map to act like a tally sheet

    Ex:

    Key -> Value
    Cat -> 2

    The word cat appears 2 times

    2. The flow

    I am reading a sentence, and for every word I want to follow these steps:
    1. Have I seen this word before (Check my key list)
      -> No? -> Write the word down and put a 1 next to it 
      -> Yes? -> Look at the key and add 1 to its value

      Use: containsKey(word) -> to check if the word is in the map
           get(word) -> retrieves the current count for the word
           put(word, count) -> saves the updated count 

    */


    //input sentence
    String sentence = "I really really like hashmaps";
    
    //turn sentence into array so that we can check each individual word
    String[] mySentence = new String[5];
    String temp = "";
    int increment = 0;

    //this for-loop puts every word in a string into an array index
    for(int i = 0; i < sentence.length(); i++) {
      if((!sentence.substring(i,i+1).equals(" "))){
        temp += sentence.substring(i,i+1);
        System.out.println("Temp: " + temp);
      } else{
        System.out.println("Space found, put word into array");
        mySentence[increment] = temp;
        increment++;
        temp="";
      }
      //last word case
      if(i == sentence.length()-1) {
        mySentence[increment] = temp;
      }
    }

    //print out every word from the array
    for(int i = 0; i < mySentence.length; i++) {
      System.out.print(mySentence[i] + " ");
    }
    System.out.println("");

    //Counting the frequency of every word using a hashmap

    //String = word 
    //Integer = how many times the word appears in the sentence
    HashMap<String, Integer> map = new HashMap<>();

    //This loop goes through every array object
    for(int i = 0; i < mySentence.length; i++) {
      //Case 1: check to see if the word exists in the map
      //      if no, add word to map with value = 1
     
      if(!map.containsKey(mySentence[i])) { //map doesn't have the word
        map.put(mySentence[i], 1);
      } else { //map has the word
        int currentCount = map.get(mySentence[i]); //gets the current count (value) of the word
        map.put(mySentence[i], currentCount+1); //overrides the key-value pair with the same word and increments its count by one
      }
    }

    
    for(String key : map.keySet()) {
      System.out.println(key + " -> " + map.get(key));
    }
   

    



    
  }
}
