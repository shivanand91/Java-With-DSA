public class Solution_08 {

    public static void maxSubArraySum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i <= arr.length; i++){
            int start = i;

            for(int j = i; j <= arr.length; j++){
                int end = j;
                currSum = 0;
                for(int k = start; k<=arr.length; k++){
                    currSum += arr[k];

                }

                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum += currSum;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 6, 7, 8, 9};
        maxSubArraySum(arr);
    }
    
}
