// this is the program of print a floyd's triangle

import java.util.Scanner;

public class Solution_04 {

    public static void floydTriangle(int n) {

        int counter = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(counter +" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        floydTriangle(n);
    }
}
