Warmup Optimization Notes:

  For the stringReversal() method, I first used a String variable that stores the final reversed String. This is not the most optimal solution because every time I edit the reversedString variable, Java creates a new reversedString object and deletes the old one. If this process happens for 10,000 objects, Java would be deleting 10,000 objects, which will rack up to n^2 time. 

  I optimized my code by using StringBuilder. StringBuilder acts as a temporary buffer Array that dynamically changes its size depending on the number of items inside of it. After filling my StringBuilder buffer, I converted it to a String using toString(). This kept my overall runtime to O(n) since the for-loop, while-loop, and toString operations take up O(n+n+n)=O(3n)=O(n)

  StringBuilders hold primitive (char) data, which takes up less memory than if I were to have used an ArrayList which stores objects

  ======================================

  DataStructureSimulator File:


  Questions: 
 
Why choose stack vs queue?
  -> Stacks are best for undoing or seeing which step you did in the past
  -> Queues are best for keeping a line of instructions before executing them


What data structure you’d use for undo/redo

  ->Stacks because Last in First Out, or in other words, the last element will be the action you can view first


What breaks if you choose the wrong one?

  -> If you choose a Stack instead of a queue, and vice versa, the order of your objects will be incorrect when printing. 
  -> The reason for this is because Stacks follow LIFO (Last in first out) and Queues follow FIFO (First in First Out)


