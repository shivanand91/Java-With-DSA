public class Solution_02 {

    public static void linearSearch(int arr[], int key){
           
        for(int i = 0; i < arr.length; i++){
           if(arr[i] == key){
            System.out.println(i);
           }
        }
        
    }

    public static void main(String[] args) {
     
        int arr[] = {1, 3, 4, 5, 6, 9};
        int key = 5;
        linearSearch(arr, key);
        
    }
}
