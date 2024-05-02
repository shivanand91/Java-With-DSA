//  this is the program of reverse of a number

import java.util.Scanner;

public class Solution_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ente a number: ");
        int n = sc.nextInt();
        int reverse = 0;

        while(n > 0){
          int a = n % 10;
          reverse = reverse * 10 + a ;
          n = n / 10;
        //   System.out.println(reverse);
        }

        System.out.println(reverse);
    }
}
