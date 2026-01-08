1. Compile time errors = errors that appears while Java code gets compiled
{
Ex:

cannot find symbol - used a variable or method that wasn't declared (counts vs count)

class, interface, or enum expected - there's a missing or extra { }

invalid method declaration; return type required - forgot to say what a method returns (void, int, String, etc), or a constructor was mispelled
}

2. Run time errors = errors that appear while your code is being executed and the user inputs something the computer doesn't know 
what to do with
{
  Ex:

  java.lang.NullPointerException -> tried to use an object that doesn't exist in memory yet. For instance, HashMap map was declared but wasn't initialized (= new HashMap<>();)

  java.lang.ArrayIndexOutOfBoundsException -> tried to access a seat in the array that isn't there. Check loop condition

  java.util.NoSuchElementException -> asked a scanner or an iterator for the next thing, but its empty. For instance, scanner.nextInt() or .nextLine() was called more times than there were lines in the input file

  java.lang.ArithmeticException: / by zero -> tried to divide by a variable that happens to be 0. Add an if (divisor != 0) check before the calculation
}

3. Infinite error = an error that freezes your computer or crashes the program
{
  Ex:

  java.lang.StackOverflowError -> the call stack is full. Happens when you haveinfinite recursion. A meth od is calling itself over and over without ever reaches a base case to stop. Check the recursive logic and find out why it isn't stopping

  java.lang.OutOfMemoryError -> the "Heap" where objects live is full. There is an infinite loop that is creating new objects like adding items to a list or map until the computer runs out of RAM


}

4. Logic error = a syntax or code error that a user makes 
