// this function is used to find the largest element of an array

public class Solution_03 {

    public static int largest(int arr[]){

        int largest = Integer.MIN_VALUE;
     
        for(int i = 0; i < arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
       
        return largest;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 6, 3, 5, 8, 9};
        System.out.println(largest(arr));
        
    }
}