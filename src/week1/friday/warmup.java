import java.util.HashMap;
public class warmup{
  public static void main(String[] args) {
    
    //First non repeating char method
    
    String letters = "bggeb";
    double[] nums = {1.0,2.0,3.0};
   

    System.out.println(warmup.findFirstRepeatingChar(letters));
    System.out.println(warmup.findAverage(nums));
    
  }

  //attempt 2 - optimized
  public static String findFirstRepeatingChar(String letters){

      //Parameters: String of letters "abcbcbcb"
      //We need something that holds the letters in memory and counts them -> HashMap 
      //We need to check each letter individually
      //Step 1. Count the letters and count their frequency -> for-loop, hashmap
      //Step 2. Go through each letter and check to see which letter has a count > 1 -> for-loop
      //Step 3. Return that letter -> assign letter to variable, return value

      HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < letters.length(); i++){
          //Case 1: if letter doesn't exist, add it to map with value 1
          char c = letters.charAt(i);
          if(!map.containsKey(c)){
            map.put(c,1);
          } //letters exists, increase its value by 1
          else{
            int currentValue = map.get(c);
            map.put(c, currentValue+1);
          }
        }
        
        for(int i = 0; i < letters.length(); i++){  
          char c = letters.charAt(i);
          if(map.get(c)>1){
            return Character.toString(c);
          }
        }
        return "There is no repeating letter";

        
  }
    
  //attempt 1 
  public static double findAverage(double[] nums){

    //parameters: araay of doubles [1.0,2.0,3.0]
    //Logic: 1.Go through array, and add up every number to a sum variable. 
    //       2. Divide count by the number of nums in the array 

    double sum = 0;
    for(int i = 0; i < nums.length; i++){
      sum += nums[i];
    }
  
    double average = sum / nums.length;

    return average;
  
  }

  //attempt 2 optimized
  public static double findAverage2(double[] nums){

    if(nums.length==0 || nums == null){
      return 0;
    }
    else{
      double sum = 0;
      for(int i = 0; i < nums.length; i++){
      sum += nums[i];
      }
      double average = sum / nums.length;
      return average;
    }
  }
}
  

