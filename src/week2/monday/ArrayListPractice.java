  //This class contains the basic methods for an ArrayList
package src.week2.monday;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListPractice {


  public static void main(String[]args){

    //ArrayList = a resizable array that stores objects

    ArrayList<String> fruits = new ArrayList();

    //ADD METHOD
    fruits.add("Apple");
    fruits.add("Orange");
    fruits.add("Banana");
    fruits.add("Coconut");

    System.out.println(fruits); //prints everything in the arraylist

    //REMOVE METHOD
    fruits.remove(1);//removes object at index 1

    System.out.println(fruits);
    //SET METHOD
    fruits.set(0, "Pineapple"); //sets index 0 to pineapple, Apple is removed
    System.out.println(fruits);

    //GET METHOD
    String x = fruits.get(1);
    System.out.println(x);

    //SORTING an ArrayList alphabetically/numerically
    Collections.sort(fruits);
    System.out.println(fruits);

    //PRINTING every object in the Array list
    for(String fruit : fruits){
      System.out.println(fruit);
    }


    


  
  }
  
}
