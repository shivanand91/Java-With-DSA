import java.util.*;

import java.util.Scanner;

public class SumOfNnumber {

    public static int sumOfNnumber(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i; 
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number n: ");
        int n = sc.nextInt();
        System.out.println("Sum of N number is: " + sumOfNnumber(n));
    }
}
