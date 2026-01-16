Warmup Notes

If the array contains only negative numbers, then the max will always be 0. 
  -> Solution: Always intialize the max to be the first element of the array
=-=-=-=-=-=-=-=-=-=

ArrayListPractice Notes

How is ArrayList different from Arrays?
  1.ArrayList:
  ->Size: Size is dynamic and can change, but capacity only shrinks if manually called via .trimToSize()
  ->Data Types: Objects only (Ex: Integer)
  ->Removal: Autoshifts elements to close gap (O(N)) time
  ->Memory: Heavier due to object overhead
  

  2.Array:
  ->Size: Fixed(immutable), they cannot change once they are initialized
  ->Data Types: Primitives (int) & objects
  ->Removal: Removes a hole or needs a manual shift
  ->Memory: Very efficient

What happens when an ArrayList grows?
  1. An ArrayList starts with a default internal array of size 10
  2. When you add the 11th element, it triggers a Resize
  3. It creates a new array that is 1.5x larger (size 15)
  4. It copies all 10 old items into the new 15-slot array


Time complexity?
  add() 
  -> Sticks the value to the end of the array O(1)
  -> If the array is full
    1. ArrayList must resize
    2. ArrayList must copy everything to a new array O(N) time
  
  get() 
  -> has a time 
  complexity of O(1) because they always point to a memory address of the object in the array list.
  -> It's very easy to edit and remove elements in an arraylist
  
  remove()
  -> 1.ArrayList removes the object from the array
     2.every object to the right of the removed index is shifted left []<------2<------3 to close the gap
