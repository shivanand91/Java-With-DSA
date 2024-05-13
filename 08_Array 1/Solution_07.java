// this is the function which is find the sub arrays  of an array 

public class Solution_07 {

    public static void subArrays(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int start = arr[i];

            for(int j = 0; j < arr.length; j++){
                int end = j;

               for(int k = start; k <= end; k++){
                System.out.print(arr[k] + " ");
               }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7, 8};
        subArrays(arr);
    }
}
