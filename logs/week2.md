I learned how to create a hashmap:
HashMap<key, value> map = new HashMap<>()

HashMaps have two parameters: keys and values   
                            Keys have to be unique
                            values can repeat

Methods for HashMaps:

map.put(key, value) -> puts a key and value into the map
map.containsKey(key) -> returns true or false if the key exists in the map
map.containsValue(value) -> returns true or false if the value exists in the map

1. Counting word frequency in a sentence:

Step 1. I created a string input containing my sentence: ex "I really really like hashmaps"

Step 2. To count my words later, it would be easier to put each word into an array so that I can count each one individually
      -> I did this by traversing the input with a for-loop
      -> I created a temporary string variable that will continously add a single letter from a word into it each time i increases
      -> I created a increment int variable that will increment by one each time a new word is found.
      -> When my for-loop reaches a " " or space, the word in temp will go into myArray[increment], and I will increase increment by one
         so that every time a new word is created, increment will tell the array that the word will go into the next array box
      -> For the last case where there is no space, I made an if-statement to check to see if the for-loop reached the last index.
         If the for-loop reaches the last index, I will force temp into myArray[increment] so that my array will even contain the last word of the string input

Step 3. To count the frequency of my words, I used a HashMap because it uses a key-value pair
      -> I did this by first traversing through my array containing all my words
      -> Case 1: if my map does not contain myArray[i] or a word, then I will put(myArray[i], 1).
          This makes sense because the map doesn't contain the word, so I put the word into the map and it only occurs once (1)
      -> Case 2: if my map does contain myArray[i] or a word, then I will use the map's override feature
            1. I created a temporary int "currentValue" so that I can see the current frequency count of the word that's already in the map
            2. I did map.put(myArray[i], currentValue+1) so that the same word stays in the hashmap, but the value increases by 1
      
Step 4. I printed the hashmap out using a special for-loop syntax I learned:

map.keySet() -> gets you the set of all the keys
map.get(key) -> gets you the value of what the key points to

  for(<KeyDataType> key : map.keySet()) {
     System.out.println(key + " -> " + map.get(key));
  }

=====================

firstnonrepeatingchar exercise:

HashMaps answers = How many? (used for counting)
Strings/arrays answer = Which comes first? (used for ordering)

Step 1: I turned a String of letters into an array of chars so I can work with each letter individually while keeping the same order
Step 2: I used a hashmap to iterate through the array of chars and assign every letter a frequency
Step 3: Since I have every letter's frequency in the HashMap, I used a for-loop to iterate through the char array.
        Every time I check a char in the array, I check it's frequency in the hashmap. Since the char array keeps the order of the original String, I can find the first letter with frequency 1.

======================

Phone book exercise:

1. I made my own hashmap with "names of people" (key) and "phone number" (value)
2. I used a java scanner to ask the user for the name they want

Some drawbacks of my implementation:
  if the user enters john instead of John, the if statement will return "the name does not exist"
  -Possible Solution: I can put the lower case version of the name into the hashmap 
                      I can also turn the user's input into a lower case version

  if I allow the user to enter a phone number, it'll probably throw a size error
  -Possible Solution: I can turn the phone number into a string and allow the user to enter whatever they want
                      This way, I can also put dashes "-" in between each phone number code
                      
======================

Debugging/Reflection

Why use a HashMap instead of an array?
-> It's better to use a hashmap to count frequency because every number will have it's frequency count attached to it directly. 
A HashMap has a time complexity of O(1) because it uses a Hash Function to turn your Key (like the word "really") into a specific math-generated index (a "hash code").


What breaks if the key doesn’t exist?
-> if the key doesn't exist, Java would return a null value if you want to find the value of that nonexistent key
-> if you attempt to do a math problem using the key with null, you would be adding null + 1 which would give you a NullPointerException

Can I use an Array instead of a HashMap for a phonebook?
->I can, but then that would make the time complexity for every look up O(n) since I would need a for-loop to traverse every single index of the array to find my name and value.
->HashMaps just map a key to a hash code and it takes O(1)