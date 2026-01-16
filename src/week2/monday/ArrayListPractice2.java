package src.week2.monday;
import java.util.ArrayList;
public class ArrayListPractice2 {
  
  public static void main(String[] args){

    //1. Create an ArrayList<Integer>
    ArrayList<Integer> nums = new ArrayList();

    //2. Add 5 numbers to array list
    nums.add(1);
    nums.add(2);
    nums.add(3);
    nums.add(4);
    nums.add(5);

    //3. Remove 1 number
    nums.remove(3); //removes 4 from array list

    //4. Print all numbers
    for(int num : nums){
      System.out.println(num);
    }

    //5. Find the maximum value

    int max = nums.get(0);
    for(int i = 0; i < nums.size(); i++){
      if(nums.get(i)>max){
        max = nums.get(i);
      }
    }

    System.out.println("The max is: " + max);



  }
}
