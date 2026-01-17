package src.week2.tuesday;
import java.util.ArrayList;
public class warmup {

  //Create an ArrayList max logic method

  public static void main(String[]args){

    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(1);
    nums.add(2);
    nums.add(3);
    nums.add(4); 

    System.out.println(warmup.findMax(nums));
  }

  public static int findMax(ArrayList<Integer> nums){

    //Parameters: an array of doubles
    //1. Take care of the empty, null cases 
    //2. Go through array and add up all numbers
    //3. 
    //4. Return a double value
      
    

    //Case 1: The input is bad
    if(nums==null || nums.size()==0){
      System.out.println("No data found.");
      return -1;
    }
    //Case 2: The input is good
    
    int max = nums.get(0);
    for(int i = 0; i < nums.size(); i++){
      if(nums.get(i) > max){
        max = nums.get(i);
      }
    }
    return max;
    
  }
  
}
