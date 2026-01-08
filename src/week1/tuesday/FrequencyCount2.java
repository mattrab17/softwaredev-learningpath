package src.week1.tuesday;
//FrequencyCount 2 is my second attempt at counting the frequency of words in a sentence using a hashmap
//My first implementation was overcomplicated because java has a .split() method that can split a string into an array

import java.util.HashMap;

public class FrequencyCount2{

  public static void main(String[]args) {
    String sentence = "I really really like hashmaps";
  String[] mySentence = sentence.split(" "); //this takes every word in sentence and splits it based on the space in between

  //check array mySentence

  for(String word : mySentence) {
    System.out.print(word + " ");
  }

  HashMap<String, Integer> map = new HashMap<>();

  //case 1: word doesn't exist, put it into the hashmap
  //case 2: word does exist, reassign it's value by +1

  //HashMap implementation using a regular for-loop
  for(int i = 0; i < mySentence.length; i++) {
    if(!map.containsKey(mySentence[i])) {
      map.put(mySentence[i],1);
    } else { 
      int currentValue = map.get(mySentence[i]);
      map.put(mySentence[i],currentValue+1);
    }
  }

  System.out.println(map);

  //HashMap implementation using a for-each loop
  for(String word : mySentence) {
    if(!map.containsKey(word)) {
      map.put(word, 1);
    } else {
      int currentValue = map.get(word); 
      map.put(word, currentValue+1);
    }
  }

  System.out.println(map);

  }
  
}