What this program does:
  This program takes in a sentence or words as a string, counts the frequency of the words that appear in the sentence, and then returns the most commonly used word.


Data Flow:
  Parameter(String words) 
  -> splits into an array of words ["cat","dog","jeff"]
  -> word frequency is counted in a hashmap 
  -> one of the most commonly used words are returned

I chose to use a HashMap because I can iterate through this data structure without needing to check every single array index for frequency
HashMaps are great for checking frequency and storage/quick retrieval

=-=-=-=-=

Biggest weaknesses this week:

1. Trying to do too much at once 
  Ex: counting frequency and searching for a hashmap value all at once
2 Java Logic
  Ex: checking null before length()

What I improved this week:

1. understanding of the "why" behind Hashmaps for frequency and quick retrieval/storage

2. my understanding of various methods
  Ex: .trim()-> removes all white space
  Ex: map.keySet()->contains all of the keys in a hashmap
  Ex: .split(" ") -> splits a string into an array of substrings
  
3. Checked edge cases before jumping into code
  Ex: length==0
  Ex: for(.... i < length-1) -> does it need to be -1 or not?

4. Algorithmic efficiency
  Ex: moved from O(n^2) time to O(n) linear time

5. Module creation (Modularity)
  Ex: moving away from creating one big code in my main method toward using Object Oriented Programming and method creation

6. my understanding of static and non static
  Static -> Class needs to do this (blueprint)
  non static -> A specific Object from the class does this (house from blue print)