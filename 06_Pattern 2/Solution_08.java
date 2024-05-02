// this is the program of print an inverted and rotated half pyramid

import java.util.Scanner;

public class Solution_08 {

    public static void zero_trinagle_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
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
        zero_trinagle_pattern(n);
    }
}
