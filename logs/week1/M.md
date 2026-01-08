1. One bug I hit was when I was finding the second largest in my array. The bug was that my array kept printing 5 to be the second largest number in the array
2. To fix it, I first tested the first for loop to see if it gave me incorrect results, which it didn't. I knew then that something was wrong with the second half of the code. I asked gemini to help me and gemini told me that I need to use a trace table for the max and array's ints for every line. After gemini showed me how to trace the second for-loop, I realized that I forgot to reset max to 0. 
3. I learned that this bug is called State Leakage. I reused a variable whose old value mattered.

The time complexity of "Finding the second largest" number in the array is T(n)=n. We are using two loops that aren't nested in one another.

  1st for loop: O(n)
  2nd for loop: O(n)
  Total = O(2n) -> O(n)

Why does array indexing start at 0:

  -> Array indexing starts at 0 because arrays are a block of memory and every element is the same size.
  -> Every index is an offset from the start
    Ex: arr[0] = start + 0 (offset by 0 from the start)
        arr[1] = start + 1 (offset by 1 from the start)
        arr[2] = start + 2 (offset by 2 from the start)
