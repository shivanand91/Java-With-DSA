//  this is the function which is print the pair of an array
//  (1,3), (1,4), (1,5), (1,7), (1,8), (3,4), (3,5), (3,7), (3,8),
//  (4,5), (4,7), (4,8), (5,7), (5,8),(7,8)

public class Solution_06 {

    public static void printPairs(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int current = arr[i];

            for(int j = i + 1; j < arr.length; j++){
                System.out.print("(" + current + "," + arr[j] + ")");
            }
           System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 7, 8};
        printPairs(arr);
    }
}
