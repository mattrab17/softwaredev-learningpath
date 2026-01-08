package src.week1.tuesday;
import java.util.HashMap;
import java.util.Scanner;

public class phonebook {
  public static void main(String[]args) {

    //Step 1. make a hashmap with people's names and phone numbers
    //Step 2. ask for someone's name to find their phone number

    HashMap<String,Integer> map = new HashMap<>();

    map.put("John",8001002);
    map.put("William", 8005252);
    map.put("Andrew", 4005025);

    Scanner scan = new Scanner(System.in);
    System.out.println("Whose phone number do you want?");
    String name = scan.nextLine();

    scan.close();
    if(map.containsKey(name)) {
      System.out.println(name + "'s phone number is: " + map.get(name));
    } else { // in case the name doesn't exist
      System.out.println("The name does not exist");
    }









  }
}
