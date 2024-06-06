public class Solution_09 {

    // Kadanes Algorithm Time Complexity = O(n)

    public static void kadanes(int arr[]) {
        // this is the max sum
        int ms = Integer.MIN_VALUE;

        // this is the current sum 
        int cs = 0;

        for (int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
            if (cs < 0) {
                cs = 0;
                }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our Max sub array is: " + ms);

    }

    public static void main(String[] args) {
         int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
         kadanes(arr);
    }

}
