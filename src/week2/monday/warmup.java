package src.week2.monday;

public class warmup {

  public static void main(String[]args){

    /*From memory, write a Java program that:
    Creates an array of integers
    Prints all values
    Finds the max
    */

    int[] array = {1,2,3,4,5,6};

    for(int num : array){
      System.out.println(num);
    }

    int max = 0;
    for(int i = 0; i < array.length; i++){
      if(array[i]>max){
        max = array[i];
      }
    }
    System.out.println("The max is: " + max);
  }
  
}
