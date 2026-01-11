package src.week1.wednesday;
import java.util.HashMap;

public class DebugPractice {
    public static void main(String[] args) {
        String text = "apple banana apple";
        String[] words = text.split(" ");
        
        // BUG 1: Potential NullPointerException if map isn't initialized
        //HashMap<String, Integer> counts = null; 
        HashMap<String, Integer> counts = new HashMap<>();

        // BUG 2: Off-by-one error in the loop boundary
        // for (int i = 0; i <= words.length; i++) {
        //     String word = words[i];
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if(!counts.containsKey(word)) {
              counts.put(word, 1); 
            } else {
                 int value = counts.get(word);
            counts.put(word,value+1);
            }
            // BUG 3: Logic bug - this always sets count to 1
           

        }

        System.out.println(counts);
    }
}