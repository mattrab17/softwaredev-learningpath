import java.util.HashMap;

public class hashmap {
  
  public static void main(String[] args) {
     //Hash map with a key(String) and a value(double)
     //Keys must be unique
  HashMap<String, Double> map = new HashMap<>();

  //storing into a hashmap

  map.put("apple", 0.50);
  map.put("orange", 0.75);
  map.put("banana", 0.25);

  map.put("orange", 100000.00); //this orange overrides the original orange
  map.put("coconut", 1.00);
  
  System.out.println(map);
  //removing items from a hashmap

  // map.remove("apple");

  //Retrieving a value using a key

  Double costOfApple = map.get("apple");

  System.out.println("The cost of the apple is: " + costOfApple);

  //check to see if a key exists

  boolean doesAppleExist = map.containsKey("apple");

  System.out.println("Does the apple key exist: " + doesAppleExist);

  //check to see if a value exists

  boolean doesHalfACentExist = map.containsValue(.5);

  System.out.println("Does half a cent exist: " + doesHalfACentExist);

  //check to see the size of the map

  int mapSize = map.size();

  System.out.println("The size of the map is: " + mapSize);

  //iterating through a map
  
  //map.keySet() -> gets us all of the keys in our map
  for(String key : map.keySet()) {
    System.out.println(key + ": $" + map.get(key));
  }

  
  }
 
}
