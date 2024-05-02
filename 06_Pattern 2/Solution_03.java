// this is the program of print an inverted half pyramid with number

import java.util.Scanner;

public class Solution_03 {

    public static void inverted_pyramid(int n) {

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        inverted_pyramid(n);
    }
}
