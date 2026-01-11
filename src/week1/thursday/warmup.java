package src.week1.thursday;

public class warmup {
  
  public static void main(String[] args) {
    int[] array = {3,2,2}; //length=3

    //System.out.println(findDuplicateBruteForce(array));

    warmup myObj = new warmup();
    System.out.println(myObj.findDuplicateBruteForce(array));

  }

  /*
  i j 
  0 1 
  */
  public boolean findDuplicateBruteForce(int[] nums) {
    //Parameters: an array of nums {2,1,4,2}
    //Compare index i->n-1 to every other index
    //if nums[i]==nums[i->n], then there is a duplicate, return true

    for(int i = 0; i < nums.length; i++) {
      for(int j = i + 1; j < nums.length; j++) {
        if(nums[i]==nums[j]) {
          return true; //return true if we found a duplicate
        }
      }
    } 
    return false; //return false if we have no duplicate ints in the array
  }
}
