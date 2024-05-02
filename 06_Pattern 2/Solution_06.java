// this is the program of print an inverted and rotated half pyramid

import java.util.Scanner;

public class Solution_06 {

    public static void zero_trinagle_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {

                if((i + j) % 2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
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
