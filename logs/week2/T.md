I learned the methods for a Stack. 

Why is stack LIFO?
  Stacks are LIFO or Last in first out because they work like a Stack of books. When you put a book on top of a book twice, to get the bottom book, you have to take out the last placed book twice. 

  To access anything, you must take from the top (the last placed object) 

When is a stack better than a list?
  -Stacks are good for tracing back your previous steps since you always know what your last move was
  -> better for undo or when you care about the most recent item

  -Lists are better for putting in objects and not having to worry about getting rid of other objects while accessing one object
  -> better for random access 

What happens if you pop() an empty stack?
  -> You will get a runtime Empty Stack exception

=-=-=-=-=-=-=-=-=

Time Complexity of a Stack:

-> Stacks are the most efficient data structures because they are designed for TOP ONLY ACCESS

push() -> adds to the top
       -> places item at the next available memory address 
       -> O(1)

pop()  -> remove the top item
       -> computer grabs last item and moves the top pointer down one
       -> O(1)

peek() -> Looks at the top item
       -> Computer just reads the value at the "top" address
       -> O(1)

isEmpty() -> check if the size is 0 (just checks the internal counter of the data structure that's already there in the first place)
       -> O(1)

search() -> searches for an item
         -> starts at the top and checks every single item 
         -> O(n)

printing/iterating -> must visit every item 
                   -> O(n)
                  
      