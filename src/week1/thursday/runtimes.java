package src.week1.thursday;
import java.util.HashMap;
public class runtimes {

  public static void main(String[] args) {
    

    //Constant time O(1) Ex's

      //arrays
      int[] nums = {1,2,3};
      int firstnum = nums[0]; //look up

      //hashmaps
      HashMap<Integer,Integer> map = new HashMap<>();
      map.put(1,1); //insert
      System.out.println(map.get(1)); //lookup
      map.remove(1); //remove
  }
  
}
