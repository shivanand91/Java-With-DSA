// this is the program of print a zero_one_trinagle_pattern

import java.util.Scanner;

public class Solution_05 {

    public static void butterfly_pattern(int n) {

        // first half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for(int sp = 1; sp <= 2 * (n - i); sp++){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
                // Second half
                for (int i = n; i >= 1 ; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
        
                    for(int sp = 1; sp <= 2 * (n - i); sp++){
                        System.out.print(" ");
                    }
        
                    for(int j = 1; j <= i; j++){
                        System.out.print("*");
                    }
        
                    System.out.println();
                }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        butterfly_pattern(n);
    }
}
