// this is the program of print n number

import java.util.Scanner;

public class Solution_01 {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        System.out.print("Ente a number: ");
        int n = sc.nextInt();

        for(int i = 1; i<= n; i++){
            System.out.println(i);
        }
        System.out.println();
    }
}