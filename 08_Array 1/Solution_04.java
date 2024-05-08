// this function is used to find the largest element of an array

public class Solution_04 {

    public static int smallest(int arr[]){

        int smallest = Integer.MAX_VALUE;
     
        for(int i = 0; i < arr.length; i++){
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
       
        return smallest;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 6, 3, 5, 8, 9};
        System.out.println(smallest(arr));
        
    }
}
