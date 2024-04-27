// print the largest of two number

import java.util.*;

public class Solution_01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number one: ");
        int a = sc.nextInt();
        System.out.print("Enter number two: ");
        int b = sc.nextInt();

        // Method 1

        int result = Math.max(a, b);
        System.out.println(result + " is grater");
    
        // Method 2

        // if(a > b){
        //     System.out.println("Number" + a + " is greater");
        // }
        // else{
        //     System.out.println("Number " + b + " is greater");
        // }
    }
}