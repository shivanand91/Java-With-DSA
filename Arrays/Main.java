import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
      int[] n = {1, 2, 5, 5, 5, 5, 7, 8, 9};
      int duplicateCount = countDuplicates(n);
      System.out.println("Number of duplicate elements: " + duplicateCount);
    }
  
    public static int countDuplicates(int[] arr) {
      // Use a hash table to store element counts
      HashMap<Integer, Integer> elementMap = new HashMap<>();
      int count = 0;
      
      for (int num : arr) {
        // Check if element exists in the map
        if (elementMap.containsKey(num)) {
          count++;
        } else {
          elementMap.put(num, 1);
        }
      }
      
      return count;
    }
  }
  