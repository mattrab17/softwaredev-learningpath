package src.week1.monday;

public class ArrayPractice{
  public static void main(String[]args){

    int[] myArray = new int[5];
    myArray[0]=1;
    myArray[1]=2;
    myArray[2]=3;
    myArray[3]=4;
    myArray[4]=5;

    //1 + 2 + 3 + 4 + 5

    //Calculate the sum of all the numbers in the array
   
    /*int sum = 0;
    for(int i = 0; i < myArray.length; i++) {
      sum = sum + myArray[i];
    }

    System.out.println("The sum is: " + sum); */

    /*
    i m
    1 0
    2 1
    3 2
    4 3
    X 4
    */
    
    //Calculate the max number of the array
    /*int max = 0;
    for(int i = 0; i < myArray.length; i++) {
      if(myArray[i] > max){
        max = myArray[i];
      }
    }

    System.out.println("The max number in the array is: " + max);*/


    //Print out all the numbers in the array
    /*for(int temp : myArray) {
      System.out.print(temp + " ");
    }

    System.out.println(); */


    //Print out all the numbers in the array in reverse
    /*for(int i = myArray.length-1; i >= 0; i--) {
      System.out.print(myArray[i] + " ");
    }

    System.out.println(); */

    //Count how many times the number 1 appears in the array
    /*int countOne = 0;
    for(int i = 0; i < myArray.length; i++) {
      if(myArray[i]==1) {
        countOne++;
      }
    }
    System.out.println("Times the number one appears in the array: " + countOne); */


    //Find the second largest number
    int max = 0;
    int indexOfMax = 0;
    
    // 1 2 3 4 5
    // 1 2 3 4 0

    //Traverse array and find the largest and its index
    for(int i = 0; i < myArray.length; i++) {
      if(myArray[i] > max) {
        max = myArray[i];
        indexOfMax = i;
        
      }
    }
    //Erase largest from array
    myArray[indexOfMax] = 0;
    //Reset max to 0
    max = 0;

    System.out.println("Number at index " + indexOfMax + " -> " + myArray[indexOfMax]);

    //Traverse array and find the second largest 
    for(int i = 0; i < myArray.length; i++) {
      if(myArray[i] > max) {
        max = myArray[i];
      }
    }

    System.out.println("The second largest number in the array is: " + max);
    

    
  }
}